package main;

public class Bill {
    double discountPercent;
    double vatPercent;
    double discount_Amount;
    double vat_Amount;
    double grand_total;
    
    public Bill(){
    this.discountPercent=0.05;
    this.vatPercent=0.13;
    }
    
    public Bill(double vatPercent, double discountPercent){
        this.discountPercent=discountPercent;
        this.vatPercent=vatPercent;
    }
    
    double calculateBill(Product p){
        this.vat_Amount=(p.price*this.vatPercent);
        this.discount_Amount=((p.price-this.vat_Amount)*this.discountPercent);
        this.grand_total=(p.price+vat_Amount)-discount_Amount;
        return this.grand_total;
    }
    
}
