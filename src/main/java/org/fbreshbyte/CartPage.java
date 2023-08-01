package org.fbreshbyte;

import java.util.ArrayList;
import java.util.List;

public class CartPage {
    private final String greetingMessage = "How about adding some products in your cart?";
     private final List<ProductInCart> productInCarts =new ArrayList<>();
     public void withProduct(ProductInCart product){
         productInCarts.add(product);
     }

    public String getGreetingMessage() {
        return greetingMessage;
    }

    public List<ProductInCart> getProductInCarts() {
        return productInCarts;
    }
}
