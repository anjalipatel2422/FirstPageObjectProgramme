package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Util {
    BrowserManager browserManager=new BrowserManager();//create object of browser manager class
    @BeforeMethod
    public void openBrowser(){
    browserManager.setUpBrowser();
    }//call setupbrowser method
    @AfterMethod
    public void closeBrowser(){
        browserManager.closeBrowser();
    }//call closebrowser method
}
