package org.fbreshbyte;

public class ProductInCart {

    private final int count;
    private final Product product;

    private final String deleteFromCart = "Remove form cart";

    public ProductInCart(int count, Product product) {
        this.count = count;
        this.product = product;
    }

    public void clickOnTheDeleteFromCart(){
        System.out.println("Click on the " +deleteFromCart+ "icon" );

    }
}
