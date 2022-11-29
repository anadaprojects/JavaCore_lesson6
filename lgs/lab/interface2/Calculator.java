package lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class Calculator implements Numerable {
    double a;
    double b;
    Calculator(double a, double b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double devide() {
        return this.a/this.b;
    }

    @Override
    public double minus() {
        return this.a-this.b;
    }

    @Override
    public double multiply() {
        return this.a*this.b;
    }

    @Override
    public double plus() {
         return this.a+this.b;
    }
    static void viewCalcResult(double result) {
        System.out.println("Результат " + result);
    }
}
