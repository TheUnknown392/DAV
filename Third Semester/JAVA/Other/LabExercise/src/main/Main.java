package main;

public class Main {
    public static void main(String args[]){
        
        Bill b = new Bill();
        Product p = new Product("hello","hi",1000);
        
        p.showProductDetail();
        System.out.println("Price after vat and discount="+b.calculateBill(p));
    }       
}
