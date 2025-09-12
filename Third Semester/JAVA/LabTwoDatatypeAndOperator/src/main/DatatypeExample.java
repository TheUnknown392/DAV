/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
public class DatatypeExample {
    public static void main(String args[]){
        int reg_no = 22314;
        int page_no =223;
        int roll_no = 125;

        float price = 2459.2f;
        float result =212.1f;

        double discount = 123.23;
        double vat = 0.13;

        System.out.println("registration No: "+reg_no);
        System.out.println("Page No: "+page_no);
        System.out.println("roll No: "+roll_no);
        System.out.println("price No: "+price);
        System.out.println("result : "+result);
        System.out.println("discount : "+discount);       
        System.out.println("vat : "+vat);   
       
        String name ="Lab Two";
        String faculty = "BCA";
        String module = "OOP in JAVA";
        String  date = "2025-02-05";
        
        System.out.println("Session name :"+name);
        System.out.println("Faculty: "+faculty);
        System.out.println("Module: "+module);
        System.out.println("Session Date: "+date);
        
        /*
        * True or False and 1 or 0
        * we ude 'boolean' to store such data
        */
        
        boolean status = true;
        boolean present = false;
        boolean active = true;
        System.out.println("Course status: "+ status);
        System.out.println("Student Attendance: " + present);
        System.out.println("Application Active status: "+ active);
        
    }
}
