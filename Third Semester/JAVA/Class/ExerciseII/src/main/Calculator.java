/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Prajwal Maharjan
 */
public class Calculator {
    /**
     * @param a
     * @param b
     * @return a+b
     */
    public int add(int a, int b){
        return a+b;
    }
    /**
     * @param a
     * @param b
     * @return a+b
     */
    public double add(double a, double b){
        return a+b;
    }
    /**
     * @param a
     * @param b
     * @param c
     * @return a+b+c
     */
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String arg[]){
        Calculator calc = new Calculator();
        int a = 10;
        int b = 11;
        int c = 12;
        double x = 1.423;
        double y = 2.42;
        System.out.println("a+b: "+calc.add(a,b));
        System.out.println("x+y: "+calc.add(x,y));
        System.out.println("a+b+c: "+calc.add(a,b,c));
    }
}
