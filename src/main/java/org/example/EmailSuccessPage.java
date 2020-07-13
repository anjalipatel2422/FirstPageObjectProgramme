package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailSuccessPage extends Util {
    private By _EmailSuccessMessage=By.xpath("//div[@class=\"result\"]");//path of email success message
    String expectedMessage="Your message has been sent.";//write expected message
    public void verifyUserSentEmailMessageSuccesfully(){ //create method
        Assert.assertEquals(getText1(_EmailSuccessMessage),expectedMessage);//compare expected result to actual result
    }
}
