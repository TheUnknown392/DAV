package main;
// since our ConstructorOverloadingExample class is in different package
// we need to import the class
import main.constructor.ConstructorOverloadingExample;
import main.method.MethodOverloadingExample;
/**
 *
 * @author user
 */
public class Main {
    public static void main(String args[]){
        /** constructor overloading example
        * creating object with constructor having parameter and parameterless
        * 1. default constructor i.e. parameterless constructor
        */
        ConstructorOverloadingExample eg_one = new ConstructorOverloadingExample();
        /** we already have initialized the data to class variable inside
         * default constructor so whenever we create object using default
         * constructor, the data are passed automatically but if any of the attributes
         * are not assigned value inside constructor then they will hold 'null' value
         * during the time of object creation
         */
        //acessing data i.e attribute using object
        System.out.println("Name: " + eg_one.full_name);
        System.out.println("Username: " + eg_one.username);
        System.out.println("role: " + eg_one.role);
        
        /** 2. creating object with single parameter
         * in case of our example we have assigned value to 'username' only so
         * except 'username' other attributes will have 'null' value during
         * creating object using this constructor
         */
        ConstructorOverloadingExample eg_two = new ConstructorOverloadingExample("useradmin");
        // acessing value:
        System.out.println("Name: " + eg_two.full_name);
        System.out.println("Username: " + eg_two.username);
        System.out.println("role: " + eg_two.role);
        
        // 3. creating object with multiple parameter constructor
        ConstructorOverloadingExample eg_three = new ConstructorOverloadingExample("Himal Rai", "director");
        // accessing data of class attributes:
        System.out.println("Name: " + eg_three.full_name);
        System.out.println("Username: " + eg_three.username);
        System.out.println("role: " + eg_three.role);
        
        // Method Overloading Examples
        // creating object: 
        MethodOverloadingExample arOne = new MethodOverloadingExample();
        // outputting functions
        
        System.out.println("int return type and no parameter: " + arOne.area());
        System.out.println("double return type and double parameter: " + arOne.area(5));
        System.out.println("int return type and two int parameter: " + arOne.area(10, 10));
        
        // void return type and two double parameter
        arOne.area(13, 14);
    }
}
