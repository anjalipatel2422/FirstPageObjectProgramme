package org.example;

import org.openqa.selenium.By;

public class DesktopPage extends Util {
    private By _DigitalStrom=By.linkText("Digital Storm VANQUISH 3 Custom Performance PC");//path of digital strom
    public void clickonDigitalStrom(){ //create method
        clickonElement(_DigitalStrom);//click on digitalstrom
    }
}
