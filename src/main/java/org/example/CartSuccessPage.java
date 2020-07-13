package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CartSuccessPage extends Util
{
    private By _HTCOneM8ProductSuccessMessage=By.xpath("//table/tbody/tr[1]/td[@class='product'][1]");//path od product in shopping cart
    String _ExpectedProductAddToCart1="HTC One M8 Android L 5.0 Lollipop";//write expected result
    private By _HTCOneMiniBlueSuccessMessage =By.xpath("//table/tbody/tr[2]/td[@class='product'][1]");//path od product in shopping cart
    String _ExpectedProductAddToCart2="HTC One Mini Blue";//write expected result
    public void VerifyThatUserSeeTwoProductInShoppingCartSuccessfully(){
        waituntilElementisclickble(_HTCOneM8ProductSuccessMessage,20);//apply explicit wait
        Assert.assertEquals(getText1(_HTCOneM8ProductSuccessMessage),_ExpectedProductAddToCart1);//compare expected result with actual result
        waituntilElementisclickble(_HTCOneMiniBlueSuccessMessage,20);
        Assert.assertEquals(getText1(_HTCOneMiniBlueSuccessMessage),_ExpectedProductAddToCart2);//compare expected result with actual result
    }

}
