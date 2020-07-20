package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FaceBookPage extends Util
{
    private String ExpectedFaceBookUrl="https://www.facebook.com/nopCommerce";//expected Url of facebook page
    private By _CraeatePageButton=By.xpath("//button[@class=\"_4jy0 _4jy3 _4jy2 _51sy selected _42ft\"]");//path of create page button
    String ExpectedCretePageButton="Create a Page";
    String ActualColourValue="rgba(66, 183, 42, 1)";//actual value of create page button colour
    String ExpectedcolorValue="rgba(66, 183, 42, 1)";//expected value of create page button colour




    public void VerifyFacebookPopUpWindow(){

        String MainWindow=driver.getWindowHandle();//to handle mainwindow

        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {
                driver.switchTo().window(ChildWindow);// Switching to Child window
                String ActualFacebookUrl=  driver.getCurrentUrl();
                Assert.assertEquals(ActualFacebookUrl,ExpectedFaceBookUrl,"get facebookpage");//compare actual with expected

                //createpagebutton verification
                Assert.assertEquals(getText1(_CraeatePageButton),ExpectedCretePageButton);

                //verify colour of createpage button
                String colour=driver.findElement(_CraeatePageButton).getCssValue("background-color");
                System.out.println(colour);

                //verify colour value
                Assert.assertEquals(ActualColourValue,ExpectedcolorValue);

                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
    }

}











