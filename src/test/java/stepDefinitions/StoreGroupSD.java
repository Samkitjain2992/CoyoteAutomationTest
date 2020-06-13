package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.StoreGroupPage;

import java.io.IOException;

public class StoreGroupSD {
    StoreGroupPage storeGroupPage = null;

    @Before(order = 4)
    public void before_method() throws IOException {

        storeGroupPage = new StoreGroupPage();
    }

    @Given("^Coyote application dashboard$")
    public void coyote_application_dashboard() {

    }

    @When("^Admin click on left navigation panel Entry setup '\\+' icon$")
    public void adminClickOnLeftNavigationPanelEntrySetupIcon() throws IOException, InterruptedException {
        storeGroupPage.clickOnLeftNavigationPanelButton();
        storeGroupPage.clickEntrySetupIcon();
        // Thread.sleep(10000);
    }

    @And("^Click on Store Group option$")
    public void clickOnStoreGroupOption() throws IOException, InterruptedException {
        storeGroupPage.clickStoreGroupText();
    }

    @Then("^Check the Store Group page$")
    public void checkTheStoreGroupPage() {
        storeGroupPage.storeGroupPageTitle();
    }

    @Then("^Verify content of Store Group page$")
    public void verifyContentOfStoreGroupPage() {
//        boolean display;
//
//      display=storeGroupPage.getStoreGroupAddButton();
//      if (!display){
//          System.out.println("Add button is not displaying on page");
//      }
//      storeGroupPage.getStoreGroupPrintButton();
//      storeGroupPage.getStoreGroupExportButton();
//      storeGroupPage.getStoreGroupStatusText();
//      storeGroupPage.getStoreGroupCodeText();
//      storeGroupPage.getStoreGroupDescriptionText();
//      storeGroupPage.getStoreGroupActionText();
//      storeGroupPage.getStoreSearchTextBox();
        storeGroupPage.contentOfStoreGroupPage();
    }

    @And("^Click on add button$")
    public void clickOnAddButton() throws IOException, InterruptedException {
        storeGroupPage.clickOnAddButton();
    }

    @Then("^Check the add Store Group page$")
    public void checkTheAddStoreGroupPage() {
    }

    @Then("^Verify content of add Store Group page$")
    public void verifyContentOfAddStoreGroupPage() {

    }

    @And("^Enter the code field as \"([^\"]*)\"$")
    public void enterTheCodeFieldAs(String code) throws Exception {
        storeGroupPage.setCodeField(code);
        Thread.sleep(5000);
    }

    @And("^Enter the description field as \"([^\"]*)\"$")
    public void enterTheDescriptionFieldAs(String description) throws Exception {
        storeGroupPage.setDescription(description);
        Thread.sleep(5000);
    }


    @And("^Select the status as \"([^\"]*)\"$")
    public void selectTheStatusAs(String value) throws InterruptedException {
        storeGroupPage.setStatus(value);
        Thread.sleep(5000);
    }

    @And("^Admin click on ok button$")
    public void adminClickOnOkButton() throws IOException, InterruptedException {
        storeGroupPage.clickOkButton();
        Thread.sleep(5000);
    }

    @Then("^Check the successful message is \"([^\"]*)\"$")
    public void checkTheSuccessfulMessageIs(String message) throws InterruptedException {
        Assert.assertEquals(" Successful message is not displaying", message, storeGroupPage.successfulMessageStoreGroupCreated());

    }



    @Then("^Verify added new Store Group like \"([^\"]*)\" \"([^\"]*)\"$")
    public void verifyAddedNewStoreGroupLike(String code, String description) {
        Assert.assertEquals("Text is not displaying", code, storeGroupPage.newStoreGroupCodeField());
        Assert.assertEquals("Text is not displaying", description, storeGroupPage.newStoreGroupDescriptionField());
        storeGroupPage.newStoreGroupStatusIcon();
    }
    @When("^Click on new added Store Group edit button$")
    public void clickOnNewAddedStoreGroupEditButton() throws IOException, InterruptedException {
        storeGroupPage.clickEditButton();
    }

    @Then("^Check the updated successful message is \"([^\"]*)\"$")
    public void checkTheUpdatedSuccessfulMessageIs(String message) {
        Assert.assertEquals(" Successful message is not displaying", message, storeGroupPage.successfulMessageUpdateStoreGroup());
    }

    @And("^Click on Delete button$")
    public void clickOnDeleteButton() throws IOException, InterruptedException {
        storeGroupPage.clickOnDeleteButton();
    }

    @And("^Click on ok button$")
    public void clickOnOkButton() throws IOException, InterruptedException {
        storeGroupPage.clickOnDeleteOkButton();
    }


    @Then("^Check the delete record on Store Group as \"([^\"]*)\"$")
    public void checkTheDeleteRecordOnStoreGroupAs(String code)  {
        Assert.assertNotEquals(code,storeGroupPage.newStoreGroupCodeField());
    }
}
