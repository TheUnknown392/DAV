package main;

public class Product {
    public String title;
    public double price;
    public String category;
    
    
    public Product(){
        this.price=0;
    }
    
    
    public Product(String title, String category, double Price){
        this.title=title;
        this.category=category;
        this.price=Price;
    }
    
    void showProductDetail(){
        System.out.println("Title: " + this.title);
        System.out.println("Price: " + this.price);
        System.out.println("Category: " + this.category);
    }
}
