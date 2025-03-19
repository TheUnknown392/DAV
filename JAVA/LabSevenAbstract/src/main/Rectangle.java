package main;

public class Rectangle extends Shape{
    public double length;
    public double breadth;
    
    @Override
    public double area(){
        return this.length*this.breadth;
    }
    
    @Override
    public double perimeter(){
        return 2.0*(this.length+this.breadth);
    }
}
