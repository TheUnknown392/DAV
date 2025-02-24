/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
public class MethodExample {
    /**
     * method examples java
     * Two types of method: 1. User-defined method 2. built-in method
     * User-defined method:method that are defined by the user i.e programmer
     * developer in the customized requirements inside the class
     * We can define method in different ways. Such as:
     * 1. With return type and without parameter
     * 2. Without return type and without parameter
     * 3. With return type and with parameter
     * 4. Without return type and with parameter
     * 
     * a. return type: it holds the data type of the method
     * that means which type of data it is going to return
     * example: int, double, boolean, String[
     * b. without return type: it is defined as type 'void'
     * c. parameters:L variable/value defined inside method's parenthesis
     * while defining the method
     * d. argument: variable/value passed inside method's parenthesis
     * while invoking/calling the method
     * 
     * syntax of method:
     * access-specifier datatype(return type) method_name(){}
     * eg: public int doSum(){}
     */
    
    //1. method with return type and without parameter
    
    /**
     * this method returns the area of circle
     * @return double
     */
    public double calculateArea(){
        double pi = 3.14258;
        double radius = 26;
        double area = pi * radius *radius; // area of circle
        return area;
    }
    
    /**
     * Give you the status of user
     * @return boolean
     */
    public boolean getUserStatus(){
        boolean status = false;
        String username = "DAV";
        if(username == "DAV"){
            status = true;
        }else{
            status = false;
        }
        return status;
    }
    
    //2. without return type and without parameter
    // here method will be type: 'void'
    
    public void helloWorld(){
        System.out.println("Hello, World!");
    }
    
    public void displayQuote(){
        String quote = "Happy Day brings Happy Moment!";
        System.out.println("Quote: "+ quote);
    }
    
    public void showPerimeter(){
        double pi = 3.1428;
        double radius = 15;
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
    
    public void showStudentDetail(){
        String full_name = "TheUnknown";
        String email = "Email@email.com";
        String gender = "any";
        String address = "Asia";
        System.out.println("Details of student:\nName: " + full_name + "\nEmail: " + email +"\ngender: " + gender + "\naddress: " + address);
    }
    
    public void sellingPirce(){
        double mp = 50000;
        double discount = 10;
        double vat = 13;
        double afterVat = mp+((mp*(vat/100)));
        double total = afterVat-(afterVat*(discount/100));
        System.out.println("Market price: " + mp + "\ndiscount: " + discount + "%"+"\nvat: " +vat+ "%" + "\nafter vat: " + afterVat + "\nafter discount (selling price): " + total);
    }
    
    //3. method with return type and with parameter
    
    /**
     * adds two int numbers and returns the sum
     * @param a
     * @param b
     * @return int
     */
    public int sumTwoInt(int a, int b){
        return a+b;
    }
    /**
     * 
     * returns selling price after vat and discount
     * @param mp
     * @param discount
     * @return double
     */
    public double sellingPirce(double mp, double discount){
        double vat = 13;
        double afterVat = mp+((mp*(vat/100)));
        double total = afterVat-(afterVat*(discount/100));
        return total;
    }
    
    /**
     * grades students based on marks
     * @param obtained_marks
     * @return String
     */
    public String getStudenPotision(double obtained_marks){
        double full_marks = 100;
        String position;
        double obtained_percent = (obtained_marks/full_marks)*100;
        if(obtained_percent<=39.99){
            position = "fail";
        }else if(obtained_percent>=40 && obtained_percent<=59.99){
            position = "third division";
        }else if(obtained_percent>=60 && obtained_percent<=69.99){
            position = "second division";
        }else if (obtained_percent>=70 && obtained_percent<=84.99){
            position = "first division";
        }else{
            position = "distinction";
        }
        return position;
    }
    
    // last 4. create a method without return type and with parameter
    
    
    public void guessName(String str){
        System.out.println("I guess your name to be " + str + "Who is most likely a human at this time");
    }
    
    
    
    public static void main(String args[]){
        MethodExample a=new MethodExample();
        
        
        a.displayQuote();
        a.sellingPirce();
        a.showStudentDetail();
        
        System.out.println(a.sumTwoInt(1, 1));
        System.out.println(a.calculateArea());
        System.out.println(a.getStudenPotision(50));
    }
}
