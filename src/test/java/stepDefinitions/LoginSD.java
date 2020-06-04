package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPage;
import utilities.ScreenShotHandle;

import java.io.IOException;

public class LoginSD {
    LoginPage lp = null;
    ScreenShotHandle screenShotHandle=null;

    @Before(order = 3)
    public void before_method() {
        lp = new LoginPage();
        screenShotHandle = new ScreenShotHandle();
    }

    @Given("^User navigates to \"([^\"]*)\"$")
    public void user_navigates_to(String pageTitle)  {
        Assert.assertEquals(pageTitle, lp.PageTitle());

    }

    @When("^User enter emailID as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enter_emailID_as_and_password_as(String emailId, String password) throws InterruptedException {
        lp.setEmailId(emailId);
        Thread.sleep(5000);
        lp.setPassword(password);
    }

    @When("^User click on login button$")
    public void user_click_on_login_button() throws InterruptedException {
        lp.clickLoginButton();
        Thread.sleep(3000);
    }


    @Then("^login should be successful$")
    public void login_should_be_successful()  {
        Assert.assertEquals("Coyote Software",lp.PageTitle());
    }

    @Then("^User click on logout button$")
    public void user_click_on_logout_button() throws InterruptedException {
        lp.clickLogoutButton();

    }

    @Then("^validate email field and password field for mandatory field$")
    public void validateEmailFieldAndPasswordFieldForMandatoryField() {
        Assert.assertEquals("Error icon is not displaying", true, lp.errorIconBlankEmailId());
        Assert.assertEquals("Error icon is not displaying",true,lp.errorIconBlankPassword());
    }


    @Then("^Error message for unregistered credential is \"([^\"]*)\"$")
    public void errorMessageForUnregisteredCredentialIs(String message) throws InterruptedException {
        Assert.assertEquals(message, lp.unregisteredCredentialMessage());
    }

    @When("^User enter emailId as \"([^\"]*)\"$")
    public void userEnterEmailIdAs(String emailId)  {
        lp.setEmailId(emailId);
    }


//    @Then("^Error message for invalid email id is \"([^\"]*)\"$")
//    public void errorMessageForInvalidEmailIdIs(String message) throws InterruptedException {
//        Thread.sleep(5000);
//        Assert.assertEquals(message,lp.errorMessageColor());
//    }

    @Then("^validate email field for invalid email id is$")
    public void validateEmailFieldForInvalidEmailIdIs() throws IOException, InterruptedException {
        Assert.assertEquals("Error icon is not displaying", true, lp.errorIconForInvalidEmailId());
        Thread.sleep(3000);
    }


    @Then("^Validate password field for invalid password is \"([^\"]*)\"$")
    public void validatePasswordFieldForInvalidPasswordIs(String message) throws InterruptedException {
        Assert.assertEquals("Error message is not displaying",message,lp.errorMessageWrongPassword());
    }
}
