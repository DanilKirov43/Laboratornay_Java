package org.example;
import jakarta.persistence.*;
import java.util.Scanner;
public class GroundTransport extends Transportabstract{
    @Transient
    Scanner scanner = new Scanner(System.in);
    @Transient
    private int speed_0, final_speed;
    @Transient
    private String type_road;
//Геттеры и сеттеры
    public void setSpeed_0(int speed_0){
        this.speed_0 = speed_0;
    }
    public void setType_road(String type_road){
        this.type_road = type_road;
    }
    /*public  String getType_road() {
        return type_road;
    }*/
    public int getSpeed_0(){
        return final_speed;
    }
//Переопределяющий метод - Ускорить
    @Override
    public void Speed_up(){

        System.out.print("Введите начальную скорость: ");
        int speed_0 = scanner.nextInt();
        setSpeed_0(speed_0);

        scanner.nextLine();

        System.out.print("Введите тип дороги (асфальт, грунтовка, щебенка): ");
        String type_road = scanner.nextLine();
        setType_road(type_road);

        if (type_road.equalsIgnoreCase("асфальт")) {
            final_speed = speed_0 + 100;
        } else if (type_road.equalsIgnoreCase("грунтовка")) {
            final_speed = speed_0 + 50;
        } else if (type_road.equalsIgnoreCase("щебенка")) {
            final_speed = speed_0 + 80;
        } else {
            System.out.println("Неизвестный тип дороги. Скорость не изменилась.");
        }
        System.out.println("Ваша новая скорость = "+getSpeed_0());

    }
//Геттеры и сеттеры
    @Transient
    private int col_skoz, data_road;
    public void setCol_skoz(int col_skoz){
        this.col_skoz = col_skoz;
    }
    /*public int getCol_skoz() {
        return col_skoz;
    }*/
//Переопределяющий метод - Расчитать данные движения
    @Override
    public void Movement_data(){
        System.out.println("Давайте расчитаем данные движения! :)");
        System.out.print("Впишите количество скользких участвок дороги: ");
        int col_skoz = scanner.nextInt();
        setCol_skoz(col_skoz);
        scanner.nextLine();
        if (col_skoz > 0 & col_skoz < 10){
            System.out.println("Сканирую твою дорогу ...");
            for (int i=0; i<=5; i++) {
                System.out.print(">");
                try {
                    Thread.sleep(280);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(" Дорога не такая скользкая. Следуйте со скоростью +- 60 км/ч");
        }
        if (col_skoz >= 10 & col_skoz < 30){
            System.out.println("Сканирую твою дорогу ...");
            for (int i=0; i<=5; i++) {
                System.out.print(">");
                try {
                    Thread.sleep(280);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(" Дорога скользкая. Следуйте со скоростью менее 40 км/ч");
        }
        if (col_skoz >= 30 & col_skoz < 50){
            System.out.println("Сканирую твою страшную дорогу ...");
            for (int i=0; i<=5; i++) {
                System.out.print(">");
                try {
                    Thread.sleep(280);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(" Дорога очень плоха. Следуйте со скоростью менее 10 км/ч");
        }
        if (col_skoz >= 50){
            System.out.println("Просматриваю твою пугающую дорогу ...");
            for (int i=0; i<=5; i++) {
                System.out.print(">");
                try {
                    Thread.sleep(280);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(" Не шевелитесь на этом катке, помощь уже в пути");
        }
    }
//Собственные методы Наземного транспорта
    @Transient
    private int col_cars;
    public void setCol_cars(int col_cars){
        this.col_cars = col_cars;
    }
//Метод - Проверить тарфик на дороге
    public void Traffic_roads(){
        System.out.print("Введите количество машин на дороге: ");
        int col_cars = scanner.nextInt();
        setCol_cars(col_cars);
        scanner.nextLine();
        if (col_cars == 0){
            System.out.println("Свобода. Дорога ваша!");
        } else if (col_cars > 0 & col_cars < 10) {
            System.out.println("Трафик малый. Малая загруженность");
        } else if (col_cars >= 10 & col_cars < 30) {
            System.out.println("Трафик умеренный. Средняя загруженность");
        } else if (col_cars >= 30 & col_cars < 50) {
            System.out.println("Трафик высокий. Высокая загруженность");
        } else if (col_cars >= 50 & col_cars < 100) {
            System.out.println("Мега тяжелая ситуация с пробками!");
        } else {
            System.out.println("Иди пешком. Завтра заберешь свою машину!");
        }

    }
//Метод - Проверить состояние дороги
    public void Road_condition() {
        System.out.println("Проверяем состояние дороги...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Начать проверку:");
        for (int i=0; i<=5; i++) {
            System.out.print(">");
            try {
                Thread.sleep(280);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print(" проверено 5%\n");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Проверим количество скольским участком:");
        for (int i=0; i<=5; i++) {
            System.out.print(">");
            try {
                Thread.sleep(280);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print(" проверено 50%\n");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Проверим еще и дороэные ситуации:");
        for (int i=0; i<=5; i++) {
            System.out.print(">");
            try {
                Thread.sleep(280);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(" проверено 100%\n");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Скользских участков: много");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Дорожных ситуаций: мало");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Счастливого пути!");
    }
}


