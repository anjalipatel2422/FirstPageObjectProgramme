package org.example;

import org.openqa.selenium.By;

public class DigitalStromPage extends Util {
    private By _EmailAFriendButton =By.xpath("//input[@value=\"Email a friend\"]");//path of email a friend button
    public void clickemailfriendbutton(){
        clickonElement(_EmailAFriendButton);//click on email a friend button
    }
}
