package Calc;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Programm {
    private Calc calc;
    Log log;
    public Programm() {
    }
    public void start(Calc calc) throws FileNotFoundException {
        while (true) {
            System.out.println("Добро пожаловать в калькулятор!\n Введите необходимую операцию:\n" +
                    "+ >>>> сложение\n - >>>> вычитание\n / >>>> деление\n * >>>> умножение");
//            Log log = new Log();
//            log.logAdd();
            Scanner scanner = new Scanner(System.in);
            String oper = scanner.nextLine();
            switch (oper) {
                case "+":
                    calc.sum(new Input());
                    Log log = new Log();
                    log.logAdd();
                    break;
                case "-":
                    calc.subtr(new Input());
                    break;
                case "/":
                    calc.div(new Input());
                    break;
                case "*":
                    calc.mylt(new Input());
                    break;
                default:
                    System.out.println("Введен недопустимый символ!");
            }
        }
    }
}
