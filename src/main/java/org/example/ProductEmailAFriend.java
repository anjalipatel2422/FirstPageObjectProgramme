package org.example;

import org.openqa.selenium.By;

public class ProductEmailAFriend extends Util{

    private By _FriendsEmail=By.xpath("//input[@placeholder=\"Enter friend's email.\"]");//path of friends email
    private By _YourEmail=By.xpath("//input[@placeholder=\"Enter your email address.\"]");//path of your email
   private By _PersonalMessage= By.xpath("//textarea[@name=\"PersonalMessage\"]");//path of personal message
   private  By _SendEmailButton=By.xpath("//input[@name=\"send-email\"]");//path of send button

   public void UserEntersEmailDetails(){
       typeText(_FriendsEmail,"Text+" + timestamp() + "@gmail.com");//type  friends email
       typeText(_YourEmail,"Text+" + timestamp() + "@gmail.com");//type your email
       typeText(_PersonalMessage,"hghjfghfgh");//type personal message
       clickonElement(_SendEmailButton);// click on send button

   }
}
