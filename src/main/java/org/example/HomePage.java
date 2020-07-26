package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Currency;
import java.util.List;

public class HomePage extends Util{
    private By _NopcommerceSymbol=By.xpath("//img[@alt=\"nopCommerce demo store\"]");
    private By _registerButton=By.xpath("//a[text()=\"Register\"]");

    private By _Computer=By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/a[1]");//path of computer button
    private By _Electronics=By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]/a[1]");//path of electronics
    private By _Search=By.xpath("//input[@type=\"submit\"]");//path of search button


    private By _NewonlineStoreIsOpen =By.linkText("New online store is open!");//text of newonline store is open
    private By _FaceBook=By.xpath("//a[text()=\"Facebook\"]");//click on facebook
    private By _CurrencySelector=By.xpath("//select[@aria-label=\"Currency selector\"]");//path of currency selector box
    private  By _USD =By.xpath("//select[@aria-label=\"Currency selector\"]/option[1]");//path of us dollar
    private By _Euro=By.xpath("//select[@aria-label=\"Currency selector\"]/option[2]");//path of Euro
    public void clickonnopcommertext(){
    clickonElement(_NopcommerceSymbol);
    }

    public void clickOnRegisterButton(){//create method
        waituntilElementisclickble(_registerButton,20);//apply explicit wait
        clickonElement(_registerButton);//click on register button

    }
    public void clickOnComputer(){ //create method
        clickonElement(_Computer); //click on computer

    }public void clickOnElectronics(){ //create method

        clickonElement(_Electronics);//click on electronics
    }
    public void clickOnSearch(){
        clickonElement(_Search);//click on searchbutton

    }
    public void AlertpopwindowTextverify(){
        Alert alert = driver.switchTo().alert();//switching to Alert
        String ActualPopWindow=driver.switchTo().alert().getText();//getting alert message
        System.out.println(ActualPopWindow);
        String ExpectedPopWindow="Please enter some search keyword";
        Assert.assertEquals((ActualPopWindow),ExpectedPopWindow);//compare actual with expected
        alert.accept();//accepting alert

    }
    public void clickonNewLineStoreIsOpen(){
        clickonElement(_NewonlineStoreIsOpen);
    }//click on new online store open
    public void clickonFaceBook(){
        clickonElement(_FaceBook);
    }//clik on facebook
    public void VerifyCustomerSelectCurrency(String currency){
        selectfromdropdownbyvisibletext(_CurrencySelector,"Euro");//selecting currency
        selectfromdropdownbyvisibletext(_CurrencySelector,"US Dollar");
        //creating list to store the product title
        //List<WebElement> productlist = driver.findElements(By.xpath("//div[contains(@class,\"product\")]/div[2]/div/div/div[2]/h2/a"));//create variable store the xpath
       //pring statement
       //System.out.println(" product " +productlist.size());

        //creating variable and storing path
        List<WebElement>PriceOfProduct=driver.findElements(By.xpath("//div[@class=\"item-grid\"]//div[@class=\"prices\"]"));
        //compare actual with expected
        //Assert.assertEquals(productlist.size(),PriceOfProduct.size());
       //apply for each loop
        for (WebElement Currency:PriceOfProduct) {

            if (currency.equals("Euro")) {
                Assert.assertTrue(Currency.getText().contains("€"), "Currency of the price does not match expected symbol");
            } else if (currency.equals("US Dollar")){
                Assert.assertTrue(Currency.getText().contains("$"), "Currency of the price does not match expected symbol");

            }
        }
    }}

