package org.example;
import jakarta.persistence.*;
import lombok.Data;
import java.util.*;
@Data
@Entity
@Table(name = "passenger_name")
public class Passenger_name {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_name")
    private String nameName;

    @Column(name = "name_value")
    private String nameValue;

    @ManyToMany(mappedBy = "passenger_names")
    private List<Type> types = new ArrayList<>();

    public void addType(Type type) {
        if (!types.contains(type)) {
            types.add(type);
            type.getPassenger_names().add(this); // Update the other side!
        }
    }
}
