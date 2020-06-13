package stepDefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.StorePage;
import java.io.IOException;
public class StoreSD {
    StorePage storePage = null;
    @Before(order = 5)
    public void before_method() throws IOException {

        storePage = new StorePage();
    }
    @When("^Click on Store option$")
    public void click_on_Store_option() throws IOException, InterruptedException {
        storePage.clickStoreOption();
    }

    @Then("^Check the Store Page URL as \"([^\"]*)\"$")
    public void checkTheStorePageURLAs(String URL) throws InterruptedException {
        Assert.assertEquals("Store page",URL,storePage.getStorePageUrl());
    }

    @Then("^Verify content of Store page$")
    public void verifyContentOfStorePage() {

    }

    @And("^Click on Store add button$")
    public void clickOnStoreAddButton() throws IOException, InterruptedException {
        storePage.clickOnStoreAddButton();
    }

    @Then("^Check the add Store page$")
    public void checkTheAddStorePage() {
    }

    @Then("^Verify content of add Store page$")
    public void verifyContentOfAddStorePage() {

    }

    @And("^Enter the Store code field as \"([^\"]*)\"$")
    public void enterTheStoreCodeFieldAs(String arg0)  {

    }


}
