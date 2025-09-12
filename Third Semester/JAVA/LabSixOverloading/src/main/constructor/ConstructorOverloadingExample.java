/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.constructor;

/**
 *
 * @author user
 */
public class ConstructorOverloadingExample {
    public String full_name;
    public String username;
    public String role;
    public int reg_no;
    public boolean status;
    
    /** Constructor overloading
     * defining multiple constructor with different
     * parameter inside same class
     */
    
    // 1. default constructor
    public ConstructorOverloadingExample(){
        this.full_name="Rajesh Hamal";
        this.role="manager";
        this.username="rajesh";
        this.status=true;
        this.reg_no=11;
    }
    
    // 2. constructor with single parameter
    // Note: here 'param_username' is the parameter &
    // this.username is the class variable i.e class attribute
    public ConstructorOverloadingExample(String param_username){
        this.username=param_username;
        // here the data that param_username carries is assigned to username
    }
    
    // 3. constructor with multiple parameter
    public ConstructorOverloadingExample(String full_name, String role){
        this.full_name=full_name;
        this.role=role;
        // Note: here this.full_name referes to class variable whreeas
        // full_name is local variable and data that full_name holds
        // assigned to class variable full_name is refrenced using 'this' keyword
    }
    
}
