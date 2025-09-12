/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Prajwal Maharjan
 */
public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog Barks");
    }
    public static void main(String args[]){
        Animal dg = new Dog();
        dg.makeSound();
    }
}
