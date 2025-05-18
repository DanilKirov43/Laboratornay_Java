package org.example;
public abstract class Transportabstract {
    //Переопределяющий метод - Ускорить
    public abstract void Speed_up();
    //Переопределяющий метод - Расчтать данные движения
    public abstract void Movement_data();
//Наследуемые методы
    public void StartEngine() {
        System.out.println("Запуск двигателя...");
        for (int i=0; i<=5; i++) {
            System.out.print("*");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println(" Запущен 100%");
    }

    public void StopEngine() {
        System.out.println("Остановка двигателя...");
        for (int i=0; i<=5; i++) {
            System.out.print("*");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" Остановлен 0%");
    }
}
