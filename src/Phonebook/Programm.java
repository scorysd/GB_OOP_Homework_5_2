package Phonebook;
import java.io.Console;
import java.io.IOException;
import java.util.Scanner;
class Programm {
    private DB DB;
    public Programm() {
    }
    public void start() throws IOException {
        while (true) {
            System.out.println("Добро пожаловать в телефонную книгу!\n Введите необходимую операцию:\n" +
                    "1 >>>> показать все записи\n 2 >>>> добавить запись\n 3 >>>> выйти");
            DB db = new DB();
            db.read();
            Scanner scanner = new Scanner(System.in);
            String action = scanner.nextLine();
            switch (action) {
                case "1":
                    db.view();
                    break;
                case "2":
                    db.add(new Person());
                    db.export();
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Введен недопустимый символ!");
            }
        }
    }
}
