package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterSuccessPage extends Util {
    private By _registerSuccessMessage =By.xpath("//div[@class='result']");//path of register success message
    String expectedRegisterSuccessMessage="Your registration completed";//write expected message
    public void verifyUserRegisteredSuccessfully(){ //create method
        Assert.assertEquals(getText1(_registerSuccessMessage),expectedRegisterSuccessMessage);//compare expected result with actual result
    }
}

