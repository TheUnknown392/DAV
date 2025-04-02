package main;
import product.ProductInterfaceImplementation;

public class Main {
    public static void main (String args[]){
        ProductInterfaceImplementation product = new ProductInterfaceImplementation("chocolate",10,"chocolate",10, 13, 10);
        product.calculateProductPrice();
    }
}