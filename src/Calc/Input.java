package Calc;
import java.util.ArrayList;
import java.util.Scanner;
class Input {
    protected Double x;
    protected Double y;
//    Log log;
    ArrayList<Double> log = new ArrayList<>();

    public Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите A: ");
        this.x = scanner.nextDouble();
        log.add(x);
        System.out.println("Введите B: ");
        this.y = scanner.nextDouble();
    }

    public Double getX() {
        return x;
    }
    public Double getY() {
        return y;
    }
}
