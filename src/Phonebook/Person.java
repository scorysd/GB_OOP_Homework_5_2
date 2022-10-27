package Phonebook;

import java.util.Scanner;

class Person {
    static String firstName;
    static String lastName;
    static String number;
    DB DB;
    Person() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        Person.lastName = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        Person.firstName = scanner.nextLine();
        System.out.println("Введите номер: ");
        Person.number = scanner.nextLine();
    }
    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }
    public void add(){
        Person name = new Person();
    }

    public static String getNumber() {
        return number;
    }
}
