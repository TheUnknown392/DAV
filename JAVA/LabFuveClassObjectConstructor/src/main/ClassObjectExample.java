package main;

public class ClassObjectExample {
    public static void main(String args[]){
        /** creating object of classes
        * Note: class 'Customer' does not have any constructor
        * so here 'deafault constructor' will be invoked/called while
        * creating the object of 'Custoomer'
        */
        Costumer c1 = new Costumer();
        
        // assigning /storing data in class 'Costumer' attributes
        
        // Note: here all objects c1, c2 & c3 are different objects
        // they will carry different data i.e. state of class 'Costumer'
        
        c1.full_name = "Hira Lal Bajahain";
        c1.email = "hirab@gmail.com";
        c1.address = "Bharatpur";
        c1.contact = "+977 9876543210";
        c1.gender = "Male";
        c1.dob = "1990-02-15";
        
        Costumer c2 = new Costumer();
        
        c2.full_name = "Hira mam";
        c2.email = "hira@mam.com";
        c2.address = "Nepal";
        c2.contact = "+977 9032165478";
        c2.gender = "Female";
        c2.dob = "2000-12-01";
        
        Costumer c3 = new Costumer();
        
        c3.full_name = "Karnatak Naagraj";
        c3.email = "damayantilover@snake.com";
        c3.address = "Nepal";
        c3.contact = "+977 9555555555";
        c3.gender = "Male";
        c3.dob = "0500-10-25";
        
        //invoking/calling class 'method'
        c1.displayCustomerInfo();
        System.out.println();
        c2.displayCustomerInfo();
        System.out.println();
        c3.displayCustomerInfo();
        System.out.println();
        // calling/invoking 'method' with parameter & return type
        // method one: storing value return by method in any variable
        // note: datatype of variable must be same as return type
        boolean result = c1.cheakEmailState("harilal@gmail.com");
        // we can use either condition statetment or simply terary operator 
        // in this case: we are using ternary operator
        System.out.println("Email Status: " + (result? "Email is correct":"Email is incorrect"));
        
        // method two: direct use of conditional statetment
        if(c2.cheakEmailState("hira@mam.com")){
            System.out.println("Email is matching");
        }else{
            System.out.println("Email is not matching");
        }
        
        //method three: direct printing
        System.out.println("Email status: " + c3.cheakEmailState("this is not email"));
        
        Product p = new Product();
        
        System.out.println();
        p.displayProduct();
    }
}