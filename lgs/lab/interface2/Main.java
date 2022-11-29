package lgs.lab.interface2;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(7.50,8);
        Calculator.viewCalcResult(c.plus());
        Calculator.viewCalcResult(c.minus());
        Calculator.viewCalcResult(c.multiply());
        Calculator.viewCalcResult(c.devide());
    }
}
