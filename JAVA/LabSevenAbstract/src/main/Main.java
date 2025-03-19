package main;

public class Main {

    public static void main(String args[]) {
        // creating object with parent class
        // here we are not able toaccess child class variable
        Shape c1 = new Circle();
        Shape r1 = new Circle();
        System.out.println("Area of Circle: " + c1.area());
        System.out.println("perimeter of Circle: " + c1.perimeter());
        System.out.println("Area of rectangle: " + r1.area());
        System.out.println("Perimeter of rectangle: " + r1.perimeter() + "\n");

        // creating object with child class
        // here we casn access child class variable
        // class object
        Circle c2 = new Circle();
        c2.RADIUS = 12.25;
        System.out.println("Area of Circle: " + c2.area());
        System.out.println("perimeter of Circle: " + c2.perimeter());

        // rectangle object 
        Rectangle r2 = new Rectangle();
        r2.length = 11;
        r2.breadth = 8;
        System.out.println("Area of rectangle: " + r2.area());
        System.out.println("Perimeter of rectangle: " + r2.perimeter());

    }
}
