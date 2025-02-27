package main;

public class Costumer {
    
    // attributes/members of class 'customer'
    
    public String full_name;
    public String email;
    public String contact;
    public String gender;
    public String address;
    public String dob;
    
    // behavior/method of class 'Customer'
    public void displayCustomerInfo(){
        System.out.println("Name: " + this.full_name);
        System.out.println("Email: " + this.email);
        System.out.println("Contact: " + this.contact);
        System.out.println("Gender: " + this.gender);
        System.out.println("Address: " + this.address);
        System.out.println("Date of Birth: " + this.dob);
    }
    
    /**
     * This method check if the email is already available
     * in the system or not before registering the customer
     * @param parm_email
     * @return boolean
     */
    public boolean cheakEmailState (String parm_email){
       return  (this.email==parm_email);
    }
    
    
}
