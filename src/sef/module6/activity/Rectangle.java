package sef.module6.activity;

public class Rectangle extends Shape {

    private double lenht;
    private double bredth;

    Rectangle() {

    }

    Rectangle(double triangleLenht, double triangleBredth) {
        this.lenht = triangleLenht;
        this.bredth = triangleBredth;
    }

    @Override
    public double calculateArea() {
        return lenht * bredth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (lenht + bredth);
    }

    public void setLenht(double lenht) {
        this.lenht = lenht;
    }

    public void setBradth(double bradth) {
        this.bredth = bradth;
    }
}
