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

    }




}