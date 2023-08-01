package org.fbreshbyte;

public class DemoShopTAU {

    public static final String HOMEPAGE_URL = "https://fasttrackit-test.netlify.app/#/";

    public static void main(String[] args) {

        Page demoPage = new Page();
        demoPage.openPage();

        Header header = new Header();
        String greetingsMsg = header.getGreetingsMsg();
        System.out.println(greetingsMsg + "! message displayed in header");
        header.getClickOnTheLoginIcon();

        Modal loginModal = new Modal();

        loginModal.clickOnTheUsernameField();
        String username = "dino";
        loginModal.typeIn(username);


        loginModal.clickOnThePasswordField();
        String password = "choochoo";
        loginModal.typeInPasswordField(password);


        loginModal.clickOnTheLoginButton();
        greetingsMsg = header.getGreetingsMsg();

        System.out.println("Expected result: " + greetingsMsg + " message displayed in header");

        System.out.println("----------------------------");
        System.out.println("Add one product to cart");
        Product awesomeGraniteChips = new Product("Awesome Granite Chips", 15.99);
        String name = awesomeGraniteChips.getName();
        System.out.println("Product is " + name);
        awesomeGraniteChips.addToCart();
        String counter = header.getCartCounter();
        System.out.println("Header Cart counter is " + counter);
        System.out.println("Expected results: Header count 1 ");

        System.out.println("----------------------------");
        System.out.println("Delete the added product from cart");
        header.clickOnTheCartIcon();

        CartPage cartPage = new CartPage();
        ProductInCart productInCart = new ProductInCart(1, awesomeGraniteChips);
        cartPage.withProduct(productInCart);
        ProductInCart deletedProductFromCart = cartPage.getProductInCarts().get(0);
        deletedProductFromCart.clickOnTheDeleteFromCart();


    }


}