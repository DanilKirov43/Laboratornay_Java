package org.example;
import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Data
@Entity
@Table(name = "type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "type_value")
    private String typeValue;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "type_passenger",
            joinColumns = @JoinColumn(name = "type_id"),
            inverseJoinColumns = @JoinColumn(name = "passenger_name_id")
    )
    private List<Passenger_name> passenger_names = new ArrayList<>();
    public void addPassenger(Passenger_name passenger) {
        if (!passenger_names.contains(passenger)) {
            passenger_names.add(passenger);
            passenger.getTypes().add(this); // Update the other side!
        }
    }
    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", typeValue='" + typeValue + '\'' +
                ", passengers=" + passenger_names.stream()
                .map(Passenger_name::getNameName)
                .collect(Collectors.joining(", ")) +
                '}';
    }
}