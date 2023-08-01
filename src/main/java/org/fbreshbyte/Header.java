package org.fbreshbyte;

public class Header {

    private final String cartCounter = "1";
    private final String loginIcon ="Login Icon";
    private final String cartIcon = "Cart Icon";

    public String getGreetingsMsg() {
        String greetingsMsg = "Hello quest";
        return greetingsMsg;
    }

    public String getClickOnTheLoginIcon() {
        return "Click on the  " + loginIcon + "from header";

    }

    public void clickOnTheCartIcon(){
        System.out.println("Click on the " +cartIcon + "from header");
    }

    public String getCartCounter() {
        return cartCounter;
    }
}
