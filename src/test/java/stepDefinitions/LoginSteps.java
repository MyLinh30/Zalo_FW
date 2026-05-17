package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage;

    @Given("user launches Zalo app")
    public void launch_app() {
        loginPage = new LoginPage(Hooks.driver);
    }

    @When("user clicks login button")
    public void click_login() {
        loginPage.clickLogin();
    }

    @When("user enters valid phone number {string}")
    public void enter_phone(String phone) {
        loginPage.enterPhone(phone);
    }

    @When("user clicks Agree and Continue button")
    public void click_agree_and_continue_btn() {
        loginPage.clickAgreeAndContinueBtn();
    }

    @When("user enters password {string}")
    public void enter_password(String pass) {
        loginPage.enterPassword(pass);
    }

    @When("user clicks continue button")
    public void click_continue_btn() {
        loginPage.clickContinueBtn();
    }

    @Then("user should see home screen")
    public void verify_home() {
        System.out.println("Verify home screen displayed");
    }
}
