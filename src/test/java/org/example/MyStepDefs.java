package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();

    @Given("^user is on homepage$")
    public void user_is_on_homepage()  {
        homePage.clickonnopcommertext();

    }

    @When("^user clicks on register button$")
    public void user_clicks_on_register_button()  {
        homePage.clickOnRegisterButton();

    }

    @When("^user enters all required registration deatils$")
    public void user_enters_all_required_registration_deatils()  {

        registerPage.UserEntersRegistrationDetails();
        registerPage.userclickonregistersubmitbutton();
    }

    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully()  {

        registerSuccessPage.verifyUserRegisteredSuccessfully();

    }



}
