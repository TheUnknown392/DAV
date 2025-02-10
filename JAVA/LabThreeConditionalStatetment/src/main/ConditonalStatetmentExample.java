/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
public class ConditonalStatetmentExample {

    /**
     * if statement 1.if 2. if else 3. if else if 4. nested if syntax:
     * if(condition){ block of code } note: the condition must be true in order
     * to run the code inside if block
     *
     * @param args
     */
    public static void main(String args[]) {
        // 1. if statetment
        int num_one = 23;
        int num_two = 32;
        if (num_one + num_two == 55) {
            System.out.println("The given expression is true");
        }
        //incase of false statetment
        // in the below givencase ouur condition is false so
        // the code inside if statetment will not run
        if (num_one + num_two == 50) {
            System.out.println("The given expression is false.");
        }
        // 2. if else
        // if the conditions inside if statetmet is false
        // then code inside 'else' block will run
        // case one: condition true
        // here code inside if statetment will run
        String college_name = "DAV";
        if (college_name == "DAV") {
            System.out.println("The college name is correct");
        } else {
            System.out.println("The college name is incorrect");
        }
        // case two: condition false
        // here code inside else statement will run
        int reg_no = 15;
        if (reg_no > 16) {
            System.out.println("The given number is greater");
        } else {
            System.out.println("The given number is smaller");
        }
        //3. if else if
        // to cheak conditiond multiple times with differnt output
        int given_number = 23;
        if (given_number >= 0 && given_number <= 9.99) {
            System.out.println("The given number is between 0-10");
        } else if (given_number >= 10 && given_number <= 19.99) {
            System.out.println("The given number is between 10-20");
        } else if (given_number >= 20 && given_number <= 39.99) {
            System.out.println("The given number is between 20-30");
        } else {
            System.out.println("The given number is greater than 30");
        }
        //4. nested if statetment
        // is used when the conditiond need to cheak inside if
        // statetment that means we can use if statetment inside
        // if statetment
        int pin_code = 1234;
        int acc_no = 450012;
        String acc_type = "savings";
        boolean status = true;
        /**
         * Note: no need to compare boolean value in case of if statement
         * simply we can pas the variable in that carry boolean data in if
         * statement eg: boolean attendance = true; here we can do:
         * if(attendance == true){} this same concept works with boolean false
         * value therefore in the below example status is true since it is a
         * boolean type so if(status == true) is equvalent to if(status)
         */
        if (status && acc_no == 450012) {

            System.out.println("Cheaking Account type and pincode");

            if (pin_code == 1234) {

                if (acc_type == "savings") {
                    System.out.println("Welcome to DAV bank");
                } else {
                    System.out.println("Invalid account type");
                }

            } else {

                System.out.println("Invalid pincode or account invalid!!");

            }

        } else {

            System.out.println("The account number: " + acc_no + " is not active at the moment");

        }
    }
}