
class Product{
    constructor(name, price , stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    getName(){
        return this.name;
    }
    getPrice(){
        return this.price;
    }
    getStock(){
        return this.stock;
    }
}

class cartItem{
    constructor(product,quantity){
        this.product = product;
        this.quantity = quantity;
    }
    getProduct(){
        return this.product.name;
    }
    getQuantity(){
        return this.quantity;
    }
    getPrice(){
        return this.quantity * this.product.price;
    }
}

let products = new Array(
    new Product("Colgate",150,100),
    new Product("Dubar-chawanpras",250,3),
    new Product("Chocoze",25,5),
    new Product("Milk",50,20),
    new Product("Bag",111,25),
    new Product("Kulfi",5,40),
    new Product("Kurkure",20,50),
    new Product("Dancer-Doll",100,45),
    new Product("Pen",10,21),
    new Product("Survival Kit",1,100),
    new Product("Copy",100,0)
);


let cart = [];

// function insertProduct(name, price, stock){
//     products.push(new Product(name,price,stock));
// }

function displayProducts(){
    console.log("Available Products:");
    products.forEach((product)=>{
        console.log("\tProduct number " + products.indexOf(product) + ":");
        console.log("\t\tName: " + product.getName());
        console.log("\t\tPrice: " + product.getPrice());
        console.log("\t\tStock: " + product.getStock());       
    });
}

function addCart(product_index,quantity){

    if(products.length-1 < product_index || product_index < 0){ // if out of bounds, exit
        console.log("The item does not exists in product list. Out of bounds");
        return;
    }

    if(products[product_index].stock<quantity){ 
        console.log("Not enough for stock available for: " + products[product_index].name);
        return;
    }

    var index = cart.findIndex(item => item.product == products[product_index]);
    if (index != -1){ // if item already exists

        if(products[product_index].stock < quantity){ // if stock is less than quantity

            cart[index].quantity += products[product_index].stock; // the cart will have maximum available items
            products[product_index].stock = 0; // stock will be empty

            console.log("not enough stock: " + (quantity-products[product_index].stock) + " insuficient items");
        }else{
            cart[index].quantity += quantity;
            products[product_index].stock -= quantity;
        }
        
        
    }else{
        cart.push(new cartItem(products[product_index],quantity)); // push new item
        products[product_index].stock -= quantity;
    }
}

function removeCart(index,quantity){
    
    var a;
    if ((a = cart.findIndex(item => item.product === products[index]))!=-1){ // if item exists in cart
        cart[a].quantity -= quantity; // updating cart quantity

        if(cart[a].quantity<=0){ //removing from cart
            cart.splice(a, 1);
        }

        products[index].stock += quantity; // updating product stock
        return;
    }
    console.log("product item does not exist"); // if item does not exist in cart
}

function displayCart(){
    console.log("Cart: \n");
    cart.forEach((inCart)=>{
        console.log("\tCart number " + cart.indexOf(inCart) + ":");
        console.log("\t\tName: " + inCart.getProduct());
        console.log("\t\tPrice: " + inCart.getPrice());       
        console.log("\t\tQuantity: " + inCart.getQuantity());
    });
}

function menuOption(){
    console.log("Menu: ");
    console.log("\tView Products: displayProducts()");
    console.log("\tAdd to Cart: addCart()");
    console.log("\tremove from Cart: removeCart()");
    console.log("\tView Cart: displayCart()");
    console.log("\tCheckout: ");
    console.log("\tExit: ");
}

function checkout(){
    const PADDING = 25;


    var discount_percent = 0;
    var total_gross_price = 0;
    if(cart.length>=3){
        discount_percent = 5;
    }

    cart.forEach((item)=>{
        total_gross_price+=item.getPrice();
    })

    if(total_gross_price>=500) discount_percent += 10;

    var total_item_quantity=0;
    var total_net_price = total_gross_price + total_gross_price*(discount_percent/100);

    const name = "Name";
    const quantity = "Quantity";
    const price = "Total Price";

    console.log("==========================================================================");
    console.log("\t"+name.padEnd(PADDING)+quantity.padEnd(PADDING)+price.padEnd(PADDING));
    cart.forEach((item) => {
        console.log("\t" + item.getProduct().padEnd(PADDING) + item.getQuantity().toString().padEnd(PADDING) + item.getPrice().toString().padEnd(PADDING));
        total_item_quantity +=item.getQuantity();
    });
    console.log("==========================================================================");
    console.log("\t|| Total Quantity:    " + total_item_quantity);
    console.log("\t|| Total Gross Price: " + total_gross_price);
    console.log("\t|| Total Discount:    " + (total_gross_price*(discount_percent/100)).toFixed(2) + "(" + discount_percent + "%)");
    console.log("\t|| Total Net Price:   " + total_net_price);
    console.log("--------------------------------------------------------------------------");
}
displayProducts();