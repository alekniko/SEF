package sef.module6.activity;

public class AbstructionActivity {

    public static void main(String[] args) {
        Square square = new Square(4);

        square.setColor("Red");
        System.out.println("***Print the information for square ***");
        System.out.println("Color of Square          : " + square.getColor());
        System.out.println("Area of a square         : " + square.calculateArea());
        System.out.println("Perimeter of a square    : " + square.calculatePerimeter());

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 6);

        rectangle.setColor("Blue");
        rectangle2.setColor("Pink");
        rectangle.setLenht(7.5);
        rectangle.setBradth(5.2);

        System.out.println("***Print the information for Rectangle ***");
        System.out.println("Color of Rectangle          : " + rectangle.getColor());
        System.out.println("Area of a Rectangle         : " + rectangle.calculateArea());
        System.out.println("Perimeter of a Rectangle    : " + rectangle.calculatePerimeter());



        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(5, 7);
        triangle2.setColor("Black");

        System.out.println("***Print the information for Tr2 ***");
        System.out.println("Color of T2          : " + triangle2.getColor());
        System.out.println("Area of a T2         : " + triangle2.calculateArea());
        System.out.println("Perimeter of a T2    : " + triangle2.calculatePerimeter());
        System.out.println("Triangle2 side C is  : " + triangle2.getSideC());

    }
}
