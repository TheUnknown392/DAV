/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainone;


public class Car {
    public String brand;
    public String model;
    public int year;
    
    public Car(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    /**
     * displays the attributes of Car
     */
    public void displayDetails(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Model: "+this.model);
        System.out.println("Year: "+this.year);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car one = new Car("Honda","kamodia",2005);
        one.displayDetails();
    }
    
}
