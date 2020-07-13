package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Util{
    private By _CellPhones=By.xpath("//h2[@class=\"title\"]/a[contains(text(),'Cell phones')]");//path of cellphones
    public void ClickOnCellPhones(){ //create method
        JavaScriptclickonElement(_CellPhones);//click on cellphones
    }


}
