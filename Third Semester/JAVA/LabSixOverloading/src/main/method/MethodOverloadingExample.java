package main.method;

public class MethodOverloadingExample {
    /** method overloading example:
     * same method with different return type and parameter
     */
    
    /** 1. return type: void & two parameter double
     * @param length
     * @param breadth 
     */
    public void area(double length, double breadth){
        double area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
    
    /** 2. return type: double & single parameter with type double
     * @param radius
     * @return double
     */
    public double area(double radius){
        double pi = 3.1428;
        double area = pi * radius * radius;
        return area; // it will return area of circle
    }
    
    /** 3. return type int & parameterless
     * @return int
     */
    public int area(){
        int length = 12;
        int area = length * length;
        return area; // it will return area of square
    }
    
    /** 4. return type int & single parameterless
     * @param base
     * @param height
     * @return int 
     */
    public int area(int base, int height){
        int area = 1/2 * (base*height);
        return area; // it will return area of equalateral triangle
    }
}