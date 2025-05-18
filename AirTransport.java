package org.example;
import jakarta.persistence.*;
import java.util.Scanner;
public class AirTransport extends Transportabstract {
    @Transient
    Scanner scanner = new Scanner(System.in);
    //Переопределяющие методы Воздушного транспорта
    //Геттеры и сеттеры
    private int type_wings, final_speed, speed_nol;
    public void setSpeed_nol(int speed_nol){
        this.speed_nol = speed_nol;
    }
    public void setType_wings(int type_wings){
        this.type_wings = type_wings;
    }
    public int getFinal_speed(){
        return final_speed;
    }
    //Метод Ускорить воздушный транспорт
    @Override
    public void Speed_up(){
        System.out.println("== Ускорить воздушный транспорт ==");
        System.out.println("Выберети тип крыльев:");
        System.out.print("1. Эллипсовидные\n2. Прямоугольные\n3. Трапецевидные\n4. Стреловидные\n5. Треугольные\nТип: ");
        int type_wings = scanner.nextInt();
        setType_wings(type_wings);

        scanner.nextLine();
        System.out.print("Введите начальную скорость: ");
        int speed_nol = scanner.nextInt();
        setSpeed_nol(speed_nol);

        scanner.nextLine();
        if (type_wings == 1){
            final_speed = speed_nol + 10000;
            System.out.println("Это лучшая форма крыльев, ваша новая скорость: "+getFinal_speed());
        } else if (type_wings == 2) {
            final_speed = speed_nol + 5000;
            System.out.println("Это менее выгодгная форма крыльев, ваша новая скорость: "+getFinal_speed());
        } else if (type_wings == 3) {
            final_speed = speed_nol + 8000;
            System.out.println("По аэродинамическим характеристикам лучше прямоугольных, ваша новая скорость: "+getFinal_speed());
        } else if (type_wings == 4) {
            final_speed = speed_nol + 15000;
            System.out.println("Это мега улучшнаая форма, ваша новая скорость: "+getFinal_speed());
        } else {
            final_speed = speed_nol + 20000;
            System.out.println("Такая форма для сверхзвуковых, ваша новая скорость: "+getFinal_speed());
        }
    }
    //Метод Расчитать коррдинаты полета
    private int speed_flight_0;
    private int a = 45, g= 10;
    private double I;
    public void setSpeed_flight_0(int speed_flight_0){
        this.speed_flight_0 = speed_flight_0;
    }
    public double getI(){
        return I;
    }
    @Override
    public void Movement_data(){
        System.out.println("== Вычисление координат полета ==");
        System.out.print("Введите скороть аэроплата: ");
        int speed_flight_0 = scanner.nextInt();
        setSpeed_flight_0(speed_flight_0);

        scanner.nextLine();
        I = ((speed_flight_0)*2 * Math.sin(a))/g;
        System.out.println("Дальность полета = "+getI());
    }
    //Метод - Проверить метео условия
    public void Weather_condition(){
        System.out.println("Проверяем метеоусловия:");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("Начать проверку:");
        for (int i=0; i<=8; i++) {
            System.out.print(">");
            try {
                Thread.sleep(280);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print(" Погода пасмурная!\n");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("Проверим количество скольским участком:");
        for (int i=0; i<=8; i++) {
            System.out.print(">");
            try {
                Thread.sleep(280);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print(" Иногда дождик!\n");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("Проверим еще и дороэные ситуации:");
        for (int i=0; i<=8; i++) {
            System.out.print(">");
            try {
                Thread.sleep(280);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(" Высокая влажность!\n");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("Скользских участков: много");
        /*try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //System.out.println("Дорожных ситуаций: мало");
        /*try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("Погода нелетная! Лучше поездом!");
    }
    public void To_plane(){
        System.out.println("Проуесс посадки:");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("Начать проверку:");
        for (int i=0; i<=10; i++) {
            System.out.print(">");
            try {
                Thread.sleep(280);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print(" Штурвал взяли\n");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("Проверим количество скольским участком:");
        for (int i=0; i<=10; i++) {
            System.out.print(">");
            try {
                Thread.sleep(280);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print(" Координаты посчитали\n");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("Проверим еще и дороэные ситуации:");
        for (int i=0; i<=10; i++) {
            System.out.print(">");
            try {
                Thread.sleep(280);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(" Снижаемся\n");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i=0; i<=10; i++) {
            System.out.print(">");
            try {
                Thread.sleep(280);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(" Выдвигаем шасси\n");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i=0; i<=10; i++) {
            System.out.print(">");
            try {
                Thread.sleep(280);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(" Присаживаемся в Победилово\n");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Мы молодцы! Мы сели, да еще и целые!\n");
        /*try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //System.out.println("Дорожных ситуаций: мало");
        /*try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
       // System.out.println("Погода нелетная! Лучше поездом!");
    }
}
