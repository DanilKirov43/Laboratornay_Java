package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;
import java.io.IOException;
import java.util.Scanner;
class MainMenu {
    public static void show(){
        Configuration configuration = new Configuration().configure();
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
                Scanner scanner = new Scanner(System.in)){
            while (true) {
                clearScreen();
                System.out.println("=== Главное меню ===");
                System.out.println("Выберете вид трансопрта:");
                System.out.println("1. Наземный транспорт");
                System.out.println("2. Воздушный транспорт");
                System.out.println("3. Выход");
                int choice = getUserChoice();
                switch (choice) {
                    case 1:
                        WinGroundTransport.show();
                        break;
                    case 2:
                        WinAirTransport.show();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Неверный выбор!");
                }
            }
        }
    }
    private static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
class WinGroundTransport {
    static GroundTransport ground = new GroundTransport();
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            clearScreen();
            System.out.println("=== Наземный траспорт ===");
            System.out.println("1. Свойства");
            System.out.println("2. Переопределяющие методы");
            System.out.println("3. Наследуемые методы");
            System.out.println("4. Собственные методы");
            System.out.println("5. Вернуться на Главное меню");
            System.out.println("6. Выйти из Приложения");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    S_G_T.show();
                    break;
                case 2:
                    PereopMetody_ground.show();
                    break;
                case 3:
                    Inherited_Methods.show();
                    break;
                case 4:
                    Sobstevennye_methods_ground.show();
                    break;
                case 5:
                    return;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

class Sobstevennye_methods_air {
    public static void show() {
        AirTransport air = new AirTransport();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            clearScreen();
            System.out.println("=== Собственные методы ===");
            System.out.println("1. Проверить метеоусловия");
            System.out.println("2. Выполнить посадку");
            System.out.println("3. Назад");
            System.out.println("4. Выйти из Приложения");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    air.Weather_condition();
                    break;
                case 2:
                    air.To_plane();
                    break;
                case 3:
                    return;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();


    }
}

class WinAirTransport {
    public static void show() {
        AirTransport air = new AirTransport();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            clearScreen();
            System.out.println("=== Воздушный транспорт ===");
            System.out.println("1. Свойства");
            System.out.println("2. Переопределяющие методы");
            System.out.println("3. Наследуемые методы");
            System.out.println("4. Собственные методы");
            System.out.println("5. Вернуться на Главное меню");
            System.out.println("6. Выйти из Приложения");
            int choice = scanner.nextInt();
            switch (choice) {
                case 2:
                    PereopMetody_air.show();
                    break;
                case 3:
                    Inherited_Methods.show();
                    break;
                case 4:
                    Sobstevennye_methods_air.show();
                    break;
                case 5:
                    return;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }

    private static void clearScreen() {
        String os = System.getProperty("os.name").toLowerCase();

        try {
            if (os.contains("win")) {
                // Для Windows используем команду cls
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Для других операционных систем используем ANSI escape код
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    //public static void main(String[] args) {
   //     show();
    //}

}

class PereopMetody_ground {
    //static GroundTransport ground = new GroundTransport();
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        GroundTransport ground = new GroundTransport();
        while (true) {
            clearScreen();
            System.out.println("=== Переопределяющие методы ===");
            System.out.println("1. Ускорить");
            System.out.println("2. Расчитать движение по дороге");
            System.out.println("3. Назад");
            System.out.println("4. Выйти из Приложения");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ground.Speed_up();
                    break;
                case 2:
                    ground.Movement_data();
                    break;
                case 3:
                    return;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

class PereopMetody_air {
    //static GroundTransport ground = new GroundTransport();
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        AirTransport air = new AirTransport();
        while (true) {
            clearScreen();
            System.out.println("=== Переопределяющие методы ===");
            System.out.println("1. Ускорить");
            System.out.println("2. Расчитать движение по дороге");
            System.out.println("3. Назад");
            System.out.println("4. Выйти из Приложения");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    air.Speed_up();
                    break;
                case 2:
                    air.Movement_data();
                    break;
                case 3:
                    return;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

class Inherited_Methods {
    public static void show() {
        GroundTransport ground = new GroundTransport();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            clearScreen();
            System.out.println("=== Наследуемые методы ===");
            System.out.println("1. Запустить двигатель");
            System.out.println("2. Остановить двигатель");
            System.out.println("3. Вернуться на Главное меню");
            System.out.println("4. Выйти из Приложения");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ground.StartEngine();
                    break;
                case 2:
                    ground.StopEngine();
                    break;
                case 3:
                    return;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
        private static void clearScreen() {
            System.out.print("\033[H\033[2J");
            System.out.flush();


    }
}

class Sobstevennye_methods_ground {
    public static void show() {
        GroundTransport ground = new GroundTransport();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            clearScreen();
            System.out.println("=== Собственные методы ===");
            System.out.println("1. Оценить плотность трафика");
            System.out.println("2. Проверить состояние дороги");
            System.out.println("3. Назад");
            System.out.println("4. Выйти из Приложения");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ground.Traffic_roads();
                    break;
                case 2:
                    ground.Road_condition();
                    break;
                case 3:
                    return;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();


    }
}

class S_G_T {
    public static void show() {
        GroundTransport ground = new GroundTransport();
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Type.class)
                .addAnnotatedClass(Passenger_name.class)
                .buildSessionFactory();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберете таблицу для вызова");
            System.out.println("1 - Показать: Общая таблица");
            System.out.println("2 - Показать: Таблица Тип трансорта");
            System.out.println("3 - Показать: Таблица Пассажир");
            System.out.println("4 - Добавить запись: в Тип трансопрта");
            System.out.println("5 - Добавить запись: в Пассажир");
            System.out.println("6 - Удалить запись: в Тип трансопрта");
            System.out.println("7 - Удалить запись: в Пассажир");
            System.out.println("8 - Привязать пассажира к типу транспорта");
            System.out.println("9 - Просмотр связей трансорта пассажиров");
            System.out.println("10 - Разорвать связь пассажира и трансопрта");
            System.out.println("11 - Обновить тип");
            System.out.println("12 - Обновить пассажира");
            System.out.println("13 - Назад");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showAllData(factory);
                    break;
                case 2:
                    showTypeTable(factory);
                    break;
                case 3:
                    showPassengerTable(factory);
                    break;
                case 4:
                    addType(factory, scanner);
                    break;
                case 5:
                    addPassenger(factory, scanner);
                    break;
                case 6:
                    deleteType(factory, scanner);
                    break;
                case 7:
                    deletePassenger(factory, scanner);
                    break;
                case 8:
                    PassengerToType(factory, scanner);
                    break;
                case 9:
                    showTransportForPassenger(factory, scanner);
                    break;
                case 10:
                    unlinkPassengerFromType(factory, scanner);
                    break;
                case 11:
                    updateType(factory, scanner);
                    break;
                case 12:
                    updatePassenger(factory, scanner);
                    break;
                case 13:
                    return;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
    private static void showAllData(SessionFactory factory){
            Session session = factory.getCurrentSession();

            try {
                session.beginTransaction();

                List<Type> types = session.createQuery("from Type", Type.class).getResultList();
                List<Passenger_name> passengers = session.createQuery("from Passenger_name", Passenger_name.class).getResultList();

                int maxRows = Math.max(types.size(), passengers.size());

                // Выводим шапку таблицы
                System.out.println("id      | Тип        | Значение              id | Имя       | Фамилия");
                System.out.println("--------+------------+--------------------------+-----------+-----------");

                for (int i = 0; i < maxRows; i++) {
                    StringBuilder line = new StringBuilder();

                    if (i < types.size()) {
                        Type type = types.get(i);
                        line.append(String.format("%7d | %-10s | %-10s",
                                type.getId(), type.getTypeName(), type.getTypeValue()));
                    } else {
                        line.append(String.format("%7s | %-10s | %-10s", "", "", ""));
                    }

                    line.append("  ");

                    if (i < passengers.size()) {
                        Passenger_name passenger = passengers.get(i);
                        line.append(String.format("%12d | %-9s | %-10s",
                                passenger.getId(), passenger.getNameName(), passenger.getNameValue()));
                    } else {
                        line.append(String.format("%12s | %-9s | %-10s", "", "", ""));
                    }

                    System.out.println(line.toString());
                }

                session.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    private static void showTypeTable(SessionFactory factory) {
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

            // Получаем данные из таблицы Type
            List<Type> types = session.createQuery("from Type", Type.class).getResultList();

            // Выводим шапку таблицы
            System.out.println("id      | Тип        | Значение  ");
            System.out.println("--------+------------+-------------");

            // Выводим данные таблицы Type
            for (Type type : types) {
                System.out.println(String.format("%7d | %-10s | %-10s",
                        type.getId(), type.getTypeName(), type.getTypeValue()));
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void showPassengerTable(SessionFactory factory) {
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

            // Получаем данные из таблицы Passenger_name
            List<Passenger_name> passengers = session.createQuery("from Passenger_name", Passenger_name.class).getResultList();

            // Выводим шапку таблицы
            System.out.println("id           | Имя       | Фамилия");
            System.out.println("-------------+-----------+-----------");

            // Выводим данные таблицы Passenger_name
            for (Passenger_name passenger : passengers) {
                System.out.println(String.format("%12d | %-9s | %-10s",
                        passenger.getId(), passenger.getNameName(), passenger.getNameValue()));
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addType(SessionFactory factory, Scanner scanner) {
        showTypeTable(factory);
        Session session = factory.getCurrentSession();
        try {
            System.out.print("Введите имя типа (Тип): ");
            String typeName = scanner.nextLine();

            System.out.print("Введите значение типа (Значение): ");
            String typeValue = scanner.nextLine();

            Type type = new Type();
            type.setTypeName(typeName);
            type.setTypeValue(typeValue);

            session.beginTransaction();
            session.save(type);
            session.getTransaction().commit();

            System.out.println("Запись успешно добавлена в таблицу Тип транспорта!");

        } catch (Exception e) {
            e.printStackTrace();
        }
        showTypeTable(factory);
    }

    private static void addPassenger(SessionFactory factory, Scanner scanner) {
        showPassengerTable(factory);
        Session session = factory.getCurrentSession();
        try {
            System.out.print("Введите имя пассажира (Имя): ");
            String nameName = scanner.nextLine();

            System.out.print("Введите фамилию пассажира (Фамилия): ");
            String nameValue = scanner.nextLine();

            Passenger_name passenger = new Passenger_name();
            passenger.setNameName(nameName);
            passenger.setNameValue(nameValue);

            session.beginTransaction();
            session.save(passenger);
            session.getTransaction().commit();

            System.out.println("Запись успешно добавлена в таблицу Пассажиры!");

        } catch (Exception e) {
            e.printStackTrace();
        }
        showPassengerTable(factory);
    }

    private static void deleteType(SessionFactory factory, Scanner scanner) {
        showAllData(factory);
        Session session = factory.getCurrentSession();
        try {
            System.out.print("Введите ID типа (Тип), который хотите удалить: ");
            int typeId = Integer.parseInt(scanner.nextLine());

            session.beginTransaction();

            Type type = session.get(Type.class, typeId);
            if (type != null) {
                session.delete(type);
                System.out.println("Запись успешно удалена из таблицы Тип транспорта!");
            } else {
                System.out.println("Тип с таким ID не найден.");
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        showAllData(factory);
    }

    private static void deletePassenger(SessionFactory factory, Scanner scanner) {
        showAllData(factory);
        Session session = factory.getCurrentSession();
        try {
            System.out.print("Введите ID пассажира (Рассажир), которого хотите удалить: ");
            int passengerId = Integer.parseInt(scanner.nextLine());

            session.beginTransaction();

            Passenger_name passenger = session.get(Passenger_name.class, passengerId);
            if (passenger != null) {
                session.delete(passenger);
                System.out.println("Запись успешно удалена из таблицы Пассажиры!");
            } else {
                System.out.println("Пассажир с таким ID не найден.");
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        showAllData(factory);
    }

    private static void updateType(SessionFactory factory, Scanner scanner) {
        showAllData(factory);
        Session session = factory.getCurrentSession();
        try {
            System.out.print("Введите ID типа (Тип), который хотите изменить: ");
            int typeId = Integer.parseInt(scanner.nextLine());

            session.beginTransaction();

            Type type = session.get(Type.class, typeId);
            if (type != null) {
                System.out.println("Текущее имя типа: " + type.getTypeName());
                System.out.print("Введите новое имя типа (нажмите Enter, чтобы пропустить): ");
                String newTypeName = scanner.nextLine();

                if (!newTypeName.trim().isEmpty()) {
                    type.setTypeName(newTypeName);
                }

                System.out.println("Текущее значение типа: " + type.getTypeValue());
                System.out.print("Введите новое значение типа (нажмите Enter, чтобы пропустить): ");
                String newTypeValue = scanner.nextLine();

                if (!newTypeValue.trim().isEmpty()) {
                    type.setTypeValue(newTypeValue);
                }

                session.update(type);

                System.out.println("Запись успешно обновлена в таблице Тип трансорта!");
            } else {
                System.out.println("Тип с таким ID не найден.");
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        showAllData(factory);
    }

    private static void updatePassenger(SessionFactory factory, Scanner scanner) {
        showAllData(factory);
        Session session = factory.getCurrentSession();
        try {
            System.out.print("Введите ID пассажира (Пассажир), которого хотите изменить: ");
            int passengerId = Integer.parseInt(scanner.nextLine());

            session.beginTransaction();

            Passenger_name passenger = session.get(Passenger_name.class, passengerId);
            if (passenger != null) {
                System.out.println("Текущее имя пассажира: " + passenger.getNameName());
                System.out.print("Введите новое имя пассажира (нажмите Enter, чтобы пропустить): ");
                String newNameName = scanner.nextLine();

                if (!newNameName.trim().isEmpty()) {
                    passenger.setNameName(newNameName);
                }

                System.out.println("Текущее значение пассажира: " + passenger.getNameValue());
                System.out.print("Введите новую фамилию пассажира (нажмите Enter, чтобы пропустить): ");
                String newNameValue = scanner.nextLine();

                if (!newNameValue.trim().isEmpty()) {
                    passenger.setNameValue(newNameValue);
                }

                session.update(passenger);

                System.out.println("Запись успешно обновлена в таблице Пассажиры!");
            } else {
                System.out.println("Пассажир с таким ID не найден.");
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        showAllData(factory);
    }

    private static void PassengerToType(SessionFactory factory, Scanner scanner) {
        showAllData(factory);
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

            System.out.print("Введите ID пассажира, которого хотите привязать к типу: ");
            Long passengerId = Long.parseLong(scanner.nextLine());
            Passenger_name passenger = session.get(Passenger_name.class, passengerId);

            if (passenger == null) {
                System.out.println("Пассажир с таким ID не найден.");
                session.getTransaction().commit();
                return;
            }

            System.out.print("Введите ID типа транспорта, к которому хотите привязать пассажира: ");
            Long typeId = Long.parseLong(scanner.nextLine());
            Type type = session.get(Type.class, typeId);

            if (type == null) {
                System.out.println("Тип с таким ID не найден.");
                session.getTransaction().commit();
                return;
            }


            type.addPassenger(passenger);
            passenger.getTypes().add(type);


            session.saveOrUpdate(type);
            session.saveOrUpdate(passenger);

            session.getTransaction().commit();
            System.out.println("Пассажир успешно привязан к типу транспорта!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            showAllData(factory);
        }
    }

    public static void PassengerToType1(SessionFactory factory, Scanner scanner) {
        showAllData(factory);
        Session session = factory.getCurrentSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            // Запрос ID пассажира
            System.out.print("Введите ID пассажира, которого хотите привязать к типу: ");
            int passengerId = Integer.parseInt(scanner.nextLine());

            // Получение пассажира из базы данных
            Passenger_name passenger = session.get(Passenger_name.class, passengerId);
            if (passenger == null) {
                System.out.println("Пассажир с таким ID не найден.");
                transaction.commit();
                return;
            }

            // Запрос ID типа транспорта
            System.out.print("Введите ID типа транспорта, к которому хотите привязать пассажира: ");
            int typeId = Integer.parseInt(scanner.nextLine());

            // Получение типа транспорта из базы данных
            Type type = session.get(Type.class, typeId);
            if (type == null) {
                System.out.println("Тип с таким ID не найден.");
                transaction.commit();
                return;
            }

            // Привязка пассажира к типу транспорта
            //passenger.setType(type);
            session.update(passenger);

            // Добавление пассажира в таблицу типа транспорта
            //type.setPassenger(passenger);  // Предполагается, что в классе Type есть метод addPassenger
            session.update(type); // Обновляем тип транспорта

            // Установка одинакового ID для пассажира и типа
            //type.setId((long) passengerId); // Предполагается, что в классе Type есть метод setId
            //session.update(type); // Обновляем тип транспорта с новым ID

            transaction.commit();
            System.out.println("Пассажир успешно привязан к типу транспорта!");

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // Откат транзакции в случае ошибки
            }
            e.printStackTrace();
        }
        showAllData(factory);
    }

    private static void showTransportForPassenger(SessionFactory factory, Scanner scanner) {
        showAllData(factory);
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            System.out.print("Введите ID пассажира: ");
            Long passengerId = Long.parseLong(scanner.nextLine());

            Passenger_name passenger = session.get(Passenger_name.class, passengerId);

            if (passenger == null) {
                System.out.println("Пассажир с таким ID не найден.");
                session.getTransaction().commit();
                return;
            }

            System.out.println("\nПассажир: " + passenger.getNameName() + " " + passenger.getNameValue());

            List<Type> transportList = passenger.getTypes();

            if (transportList.isEmpty()) {
                System.out.println("Этот пассажир не привязан ни к одному типу транспорта.");
            } else {
                System.out.println("\nТипы транспорта, к которым привязан пассажир:");
                System.out.println("ID      | Название       | Значение");
                System.out.println("--------+----------------+----------------");

                for (Type type : transportList) {
                    System.out.printf("%-7d | %-14s | %-15s%n",
                            type.getId(), type.getTypeName(), type.getTypeValue());
                }
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void unlinkPassengerFromType(SessionFactory factory, Scanner scanner) {
        showAllData(factory); // Optionally show current links before removal
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            System.out.print("Введите ID пассажира, связь которого хотите удалить: ");
            Long passengerId = Long.parseLong(scanner.nextLine());
            Passenger_name passenger = session.get(Passenger_name.class, passengerId);

            if (passenger == null) {
                System.out.println("Пассажир с таким ID не найден.");
                session.getTransaction().commit();
                return;
            }

            System.out.print("Введите ID типа транспорта, от которого хотите отвязать пассажира: ");
            Long typeId = Long.parseLong(scanner.nextLine());
            Type type = session.get(Type.class, typeId);

            if (type == null) {
                System.out.println("Тип транспорта с таким ID не найден.");
                session.getTransaction().commit();
                return;
            }

            // Удаляем связь, если она существует
            boolean removedFromType = type.getPassenger_names().remove(passenger);
            boolean removedFromPassenger = passenger.getTypes().remove(type);

            if (removedFromType || removedFromPassenger) {
                session.saveOrUpdate(type);
                session.saveOrUpdate(passenger);
                System.out.println("Связь между пассажиром и типом транспорта успешно удалена.");
            } else {
                System.out.println("Связь между указанным пассажиром и транспортом не найдена.");
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            showAllData(factory); // Optionally show updated data
        }
    }
}
