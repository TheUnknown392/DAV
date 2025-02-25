package main;

public class Product {
    public int product_id;
    public String name;
    public String category;
    public double price;
    public String brand;
    public String product_description;
    
    // initializing default constructor
    // Note: constructor name must be asme as class name an
    // must be of without any return type
    public Product(){
        // initializing value/data to attributes inside colstructor
        // that mean whenever the object of this class is created
        // the below initialized data are assigned automatically
        this.product_id = 001;
        this.category="candy";
        this.name="Kitkat";
        this.product_description = "this is a yummy candy";
        this.brand="Nesle";
        this.price=50;
    }
    /**
     * displays the attribute of class 'product'
     */
    public void displayProduct(){
        System.out.println("Product ID: "+ this.product_id);
        System.out.println("Name: "+ this.name);
        System.out.println("Category: "+ this.category);
        System.out.println("Price: "+ this.price);
        System.out.println("Product Description: "+ this.product_description);
        System.out.println("Brand: "+ this.brand);
    }
}
