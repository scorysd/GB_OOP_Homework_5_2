package Calc;

class Calc {
    private Input input;
    Input log;
    Double z;
    public Calc(){
    }
    Double sum(Input input){
        z = input.x + input.y;
        System.out.println("Результат: " + z);
//        log.;
        return z;
    }
    Double mylt(Input input){
        z = input.x * input.y;
        System.out.println("Результат: " + z);
        return z;
    }
    Double subtr(Input input){
        z = input.x - input.y;
        System.out.println("Результат: " + z);
        return z;
    }
    Double div(Input input){
        z = input.x / input.y;
        System.out.println("Результат: " + z);
        return z;
    }
}
