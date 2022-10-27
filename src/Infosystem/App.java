package Infosystem;

public class App {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Иванов", "Иван", 2.0);
        Worker worker2 = new Worker("Петров", "Петр", 2.3);
        Worker worker3 = new Worker("Вершинин", "Роман", 4.8);
        Department accounting = new Department("Бухгалтерия", 15000);
        Department market = new Department("Марктеинг", 10000);
        Department it = new Department("IT", 30000);
        Payplatform pay = new Payplatform();
        pay.Pay(worker1,accounting);
        pay.Pay(worker2,market);
        pay.Pay(worker3,it);
        pay.Pay(worker3,accounting);
    }
}
