package Phonebook;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DB {
    ArrayList<String> DB = new ArrayList<>();

    public void add(Person person) {
        DB.add(Person.getFirstName());
        DB.add(Person.getLastName());
        DB.add(Person.getNumber());
    }

    public void export() throws IOException {
        FileWriter writer = new FileWriter("/Users/romanversinin/IdeaProjects/GB_OOP_Homework_5/src/Phonebook/DB.txt", false);
        {
            try {
                for (int i = 0; i < DB.size(); i++) {
                    writer.write(DB.get(i).toString());
                    writer.append('\n');
                }
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public void read() throws IOException {
        FileReader reader = new FileReader("/Users/romanversinin/IdeaProjects/GB_OOP_Homework_5/src/Phonebook/DB.txt");
        Scanner scan = new Scanner(reader);
        while (scan.hasNextLine()) {
            DB.add(scan.nextLine());

        }
        reader.close();
    }

    public void size() {
        System.out.println(DB.size());
    }

    public void view() throws IOException {
        FileReader reader = new FileReader("/Users/romanversinin/IdeaProjects/GB_OOP_Homework_5/src/Phonebook/DB.txt");
        Scanner scan = new Scanner(reader);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        reader.close();
    }
}


