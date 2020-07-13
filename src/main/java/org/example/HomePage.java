package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Util{

    private By _registerButton=By.xpath("//a[@class=\"ico-register\"]");//path of register button
    private By _Computer=By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/a[1]");//path of computer button
    private By _Electronics=By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]/a[1]");//path of electronics

    public void clickOnRegisterButton(){//create method
        waituntilElementisclickble(_registerButton,20);//apply explicit wait
        clickonElement(_registerButton);//click on register button

    }
    public void clickOnComputer(){ //create method
        clickonElement(_Computer); //click on computer

    }public void clickOnElectronics(){ //create method
        clickonElement(_Electronics);//click on electronics
    }
}
