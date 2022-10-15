package Calc;

import java.io.*;
import java.util.ArrayList;

class Log {
//    Calc calc;
    Input input;
    Input log;

    public Log() {
    }

    public void logAdd() {
//        log.add(input.getX());
//        log.add(input.getY());
//        log.add(calc.z);
        try (FileWriter writer = new FileWriter("/Users/romanversinin/IdeaProjects/GB_OOP_Homework_5/src/Calc/log.txt", true)) {
            writer.write(String.valueOf(log.log.get(0)));
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
