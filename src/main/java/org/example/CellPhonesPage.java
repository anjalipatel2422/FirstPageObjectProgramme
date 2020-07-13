package org.example;

import org.openqa.selenium.By;

public class CellPhonesPage extends Util
{
    private By _HTConeM8AddToCart=By.xpath(("//div[@class=\"item-grid\"]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]"));//path of HTC OneM8 add to cart button
    private By _HTCminiAddToCart=By.xpath("//div[@class=\"item-grid\"]/div[2]/div[1]/div[2]/div[3]/div[2]/input[1]");//path of HTCmini add to cart button
    private  By _ShoppingCart=By.xpath("//span[@class='cart-label']");
    public void VerifyThatUserAddTwoProductInCartSuccessfully(){ //create method
        clickonElement(_HTConeM8AddToCart);//click on HTCone add to cart button

        clickonElement(_HTCminiAddToCart);//click on HTCmini add to cart button
    }
    public void VerifYThatUserClickOnShoppingCartButtonSuccessfully() { //create method
        //waituntilElementisclickble(_ShoppingCart,40);
    JavaScriptclickonElement(_ShoppingCart);// click on shopping cart button
}}
