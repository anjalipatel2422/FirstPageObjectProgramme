package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Util {
    BrowserManager browserManager = new BrowserManager();

    @Before
    public void openBrowser(){
        browserManager.setUpBrowser();
    }
    @After
    public void closebrowser(){
        browserManager.closeBrowser();
    }
}
