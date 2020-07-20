package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class FrameExample extends Util {
    private By FrameText=By.xpath("//h1[text()=\"Frames Examples in Selenium Webdriver\"]");//path of frame text
    String ExpectedText="Frames Examples in Selenium Webdriver";
    private By _Topic=By.xpath("//input[@type=\"text\"]");//path of topic text box
    private By _CheckBox=By.xpath("//input[@type=\"checkbox\"]");//path nof check box
    private By _SelectAnimal=By.xpath("//select[@class=\"col-lg-3\"]");//path of  animal selector

     public void VerifyUserIsonFrameExample()
     {
         Assert.assertEquals(getText1(FrameText),ExpectedText);//compare actual with expected
     }
     public void VerifyUserEnterAllDetails(){
         driver.switchTo().frame("frame1");//switch to first frame
         waituntilElementToBeVisible(_Topic,30);//apply explicit wait
         typeText(_Topic,"Test");//type any topic in topic box
         driver.switchTo().frame("frame3");//switch to third frame
         JavaScriptclickonElement(_CheckBox);//click on check box
         driver.switchTo().defaultContent();//switch to main frame
         driver.switchTo().frame("frame2");//switch to second frame
         selectfromdropdownbyvisibletext(_SelectAnimal,"Avatar");//select animal type as Avatar


     }
}
