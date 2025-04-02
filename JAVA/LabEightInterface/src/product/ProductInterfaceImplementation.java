package product;

/**
 *
 * @author user
 */
public class ProductInterfaceImplementation implements ProductInterface{
    // overriding all abstract methods of ProductInterface
    public String product_title;
    public double product_price;
    public String product_category;
    public double discount_percent;
    public double vat_percent;
    public int product_quantity;
    public double total_price;
    
    public ProductInterfaceImplementation(String title, double price, String category, double discount, double vat, int quantity){
        this.product_title=title;
        this.product_category=category;
        this.product_price=price;
        this.product_quantity=quantity;
        this.discount_percent=discount;
        this.vat_percent=vat;
    }
    
    @Override
    public void calculateProductPrice(){
//      this.total_price=(this.product_price-this.calculateDiscount())+this.calculateVatAmount();
        //calculation price using method as well  
        // we can directlyuse the method as it returs double value but in this case
        // we aare creating variables
        
        double discount_price = this.calculateDiscount();
        double vat_amount = this.calculateVatAmount();
        this.total_price = ((this.product_price-discount_price)+vat_amount);
        System.out.println("Actual Price: Rs."+this.product_price);
        System.out.println("Discount in Percent: "+this.discount_percent+"%");
        System.out.println("Discount in amount: "+discount_price);
        System.out.println("Vat in Percent: "+this.vat_percent);
        System.out.println("Vat in amount: Rs."+vat_amount);
        System.out.println("Total unit Price: Rs."+this.total_price);
        System.out.println("Total Price : Rs."+this.total_price*this.product_quantity);
    }
    @Override
    public double calculateDiscount(){
        return (this.product_price*(this.discount_percent*0.01));
    }
    @Override
    public double calculateVatAmount(){
        return ((this.product_price-this.calculateDiscount())*(this.vat_percent*0.01));
    }
}
