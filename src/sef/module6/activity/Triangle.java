package sef.module6.activity;

public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;




    Triangle () {

    }
    Triangle (double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;

    }

    public double calculationSideC(double sideA, double sideB) {
        return sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }



    @Override
    public double calculatePerimeter() {
        return sideA + sideB + calculationSideC(sideA, sideB);
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(pp() * (pp() - sideA) * (pp() - sideB) * (pp() - sideC));
    }

    public double getSideC() {
        return sideC;
    }
    public double pp() {
        return (sideA + sideB +sideC) / 2;
    }

}
