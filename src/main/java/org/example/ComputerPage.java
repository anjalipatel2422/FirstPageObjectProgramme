package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Util
{
    private By _Desktop=By.xpath("//a[text()=\" Desktops \"]");//path of desktop
 public void clickondesktop(){ //create method
    clickonElement(_Desktop); //click on desktop
}}
