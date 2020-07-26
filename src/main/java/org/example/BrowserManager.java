package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util {
    public  void setUpBrowser() {
        //setting up chromedriver path
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDrivers\\chromedriver.exe");

        //creating chromdriver object to open google chrome browser
        driver = new ChromeDriver();
        //maximising screen
        driver.manage().window().maximize();
        //applying implicity wait of 30 sec to the driver instance
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //open url
        driver.get("https://demo.nopcommerce.com/");
    }

    public  void closeBrowser() {
        driver.close();
    } //reusable method to close browser

}
