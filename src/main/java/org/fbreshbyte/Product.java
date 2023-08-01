package org.fbreshbyte;

public class Product {

    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

   public void addToCart(){
        //> Click on the Add to Cart Button (icon)
       System.out.println("Click on the Add to Cart Button");

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
