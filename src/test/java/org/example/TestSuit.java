package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{
    HomePage homePage=new HomePage();//create object of homepage class
    RegisterPage registerPage=new RegisterPage();//create object of RegisterPage class
    RegisterSuccessPage registerSuccessPage=new RegisterSuccessPage();//create object of RegisterSuccessPage class

    ComputerPage computerPage=new ComputerPage();//create object of ComputerPage class
    DesktopPage desktopPage=new DesktopPage();//create object of DesktopPag class
    DigitalStromPage digitalStromPage=new DigitalStromPage();//create object of  DigitalStromPage class
    EmailSuccessPage emailSuccessPage=new EmailSuccessPage();//create object of EmailSuccessPage class
    ProductEmailAFriend productEmailAFriend=new ProductEmailAFriend();//create object of ProductEmailAFriend class

    ElectronicsPage electronicsPage=new ElectronicsPage();//create object of homepage class
    CellPhonesPage cellPhonesPage=new CellPhonesPage();//create object of cellphonespage class
    CartSuccessPage cartSuccessPage=new CartSuccessPage();//create object of cartsuccesspage class


@Test
    public void VerifyUserShouldAbleToRegisterSuccessfully(){


    //click on register button
    homePage.clickOnRegisterButton();
    //user enter registeration details
    registerPage.UserEntersRegistrationDetails();
    //user click son register submit button
    registerPage.userclickonregistersubmitbutton();
    //veify register success message
    registerSuccessPage.verifyUserRegisteredSuccessfully();

}@Test
    public void registerUserShouldBeAbleToReferAProductToaFriendSuccesfully(){
    //click on register button
    homePage.clickOnRegisterButton();
    //verify user is on register page
   // registerPage.VerifyUserisOnRegisterPage();
    //apply explicitwait
    //registerPage.WaitUntilelementtobeclickble();
    //user enter registeration details
    registerPage.UserEntersRegistrationDetails();
    //user click son register submit button
    registerPage.userclickonregistersubmitbutton();
    //veify register success message
    registerSuccessPage.verifyUserRegisteredSuccessfully();



    //verify user click on computer
    homePage.clickOnComputer();
    //verify user click on desktop
    computerPage.clickondesktop();
    //verify user click on digitalstrom
    desktopPage.clickonDigitalStrom();
    //verify user click om email a friend button
    digitalStromPage.clickemailfriendbutton();
    //verify user type all detils of email a friend
    productEmailAFriend.UserEntersEmailDetails();
    //verify user see success Message of emailfrinds
    emailSuccessPage.verifyUserSentEmailMessageSuccesfully();
}
@Test
    public void UserShouldBeAbleToAddProductToBasketSuccesfully() {
    //verify user click on Electronics
    homePage.clickOnElectronics();
    //verify user click on Cellphones
    electronicsPage.ClickOnCellPhones();
    //verify user ADD two product in cart
    cellPhonesPage.VerifyThatUserAddTwoProductInCartSuccessfully();
    cellPhonesPage.VerifyThatUserAddTwoProductInCartSuccessfully();
    //verify that user click on shopping cart button
    cellPhonesPage.VerifYThatUserClickOnShoppingCartButtonSuccessfully();
    //verify that user see two product in cart
    cartSuccessPage.VerifyThatUserSeeTwoProductInShoppingCartSuccessfully();
    }
}
