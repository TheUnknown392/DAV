package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class OperatorExample {
    public static void main(String args[]){
        /** Operators in Java
         * Operators are used to run/execute certain operations
         * 1. Arithmetic Operator
         * sum, multiplication, division, subtraction, modulas
         */
        double price = 15778.23;
        double discount = 1578;
        double vat = 1348;
        
        double price_with_vat = price+vat;
        double price_after_discount = price_with_vat - discount;
        System.out.println("Price = " + price);
        System.out.println("Discount = " + discount);
        System.out.println("Price After Discount = "+ price_after_discount);
        
        int item=5;
        double itemPrice=10.252;
        
        double total = item*itemPrice;
        System.out.println("item quantity="+item+" price = "+itemPrice+" and total is: "+total);
        
        int people=5;
        double payablePerPerson= (total/people);
        System.out.println("total people = "+people+" so the amount payable per person =  "+payablePerPerson);
        
        /**
         * 2. Assignment Operator
         * =, +=, -=, *=
         */
        
        int cart_no=12;
        System.out.println("cart no before adding: "+cart_no);
        cart_no +=4;
        System.out.println("Cart no after adding : "+ cart_no);
        //it will work similar with other assignment operator
                
        /**
         * 3. Compairative Operator
         * ==,!=,<,>,<=,>=
         */
        
        String username="dav";
        String password="1234";
        int roll_no = 12;
        System.out.println("Equal to:" + username=="dav");
        System.out.println("not wquals toL: "+password !="1234");
        System.out.println("Greater than: "+(roll_no>10));
        System.out.println("lesser than: "+(roll_no<10));
        System.out.println("lesser than equals: "+(roll_no<=10));
        System.out.println("greater than equals: "+(roll_no>=10));
        
        /**
         * 4. logical operator
         * && -> AND - all condition must return true
         * || -> OR - if any of the condition is true then returns true
         */
        boolean result_AND = roll_no>=12 && roll_no <= 12;
        System.out.println("Logical AND: "+result_AND);
        boolean result_OR = roll_no>=12 && roll_no <= 13;
        System.out.println("Logical AND: "+result_OR);
        /**
         * 5. Ternary operator 
         * syntax: condition ? "true":"false"
         */
        double sum = 23+12;
        System.out.println("Result: " +(sum==35?"correct":"Wrong"));
    }
}
