package sef.module6.activity;

public class Square extends Shape {

    private double side;

    Square() {

    }

    Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}
