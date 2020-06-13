package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.RolesPage;

import java.io.IOException;

public class RolesSD {
    RolesPage rolesPage = null;
    @Before(order = 6)
    public void before_method() throws IOException {

        rolesPage = new RolesPage();
    }
    @Given("^Coyote application dashboard \"([^\"]*)\"$")
    public void coyote_application_dashboard(String URL) throws InterruptedException {
        Assert.assertEquals("No navigation on Coyote Dashboard",URL,rolesPage.getDashboardURL());
    }

    @When("^Click on Roles option$")
    public void click_on_Roles_option() throws IOException, InterruptedException {
        rolesPage.selectRoles();
    }

    @Then("^Check the Roles page \"([^\"]*)\"$")
    public void checkTheRolesPage(String URL) throws InterruptedException {
        Assert.assertEquals("No navigation on Roles Page",URL,rolesPage.getURL());
    }

    @Then("^Verify content of Roles page like\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void verifyContentOfRolesPageLike( String newRole, String status, String name, String type, String action)
    {
        Assert.assertEquals("",newRole,rolesPage.getRolesNewRoleButton());
        Assert.assertEquals("",status,rolesPage.getRolesStatusText());
        Assert.assertEquals("",name,rolesPage.getRolesNameText());
        Assert.assertEquals("",type,rolesPage.getRolesTypeText());
        Assert.assertEquals("",action,rolesPage.getRolesActionText());
    }

    @And("^Click on NewRole$")
    public void clickOnNewRole() throws IOException, InterruptedException {
        rolesPage.clickNewRoleButton();
    }

    @Then("^Check the add Role Page \"([^\"]*)\"$")
    public void checkTheAddRolePage(String URL) throws InterruptedException {
        Assert.assertEquals("No navigation on add Roles Page",URL,rolesPage.getURL());
    }

    @Then("^Verify content of add Role page$")
    public void verifyContentOfAddRolePage() {

    }

    @And("^Enter the RoleName field as \"([^\"]*)\"$")
    public void enterTheRoleNameFieldAs(String roleName) throws Exception {
        rolesPage.setRoleName(roleName);
    }

    @And("^Enter the RoleCode field as \"([^\"]*)\"$")
    public void enterTheRoleCodeFieldAs(String roleCode) throws Exception {
        rolesPage.setRoleCode(roleCode);
    }

    @And("^Enter the RoleType field as \"([^\"]*)\"$")
    public void enterTheRoleTypeFieldAs(String roleType) throws Exception {
        rolesPage.setRoleType(roleType);
    }

    @And("^Select the RoleStatus as \"([^\"]*)\"$")
    public void selectTheRoleStatusAs(String roleStatus) throws InterruptedException {
           rolesPage.setRoleStatus(roleStatus);
           Thread.sleep(3000);
    }

    @And("^Click on All Permission$")
    public void clickOnAllPermission() throws IOException, InterruptedException {
        rolesPage.setPermission();
        Thread.sleep(3000);
    }

    @And("^Click on submit button$")
    public void clickOnSubmitButton() throws IOException, InterruptedException {
        rolesPage.clickOnSubmitButton();
    }

    @Then("^Check the Role Created successful message is \"([^\"]*)\"$")
    public void checkTheRoleCreatedSuccessfulMessageIs(String message)  {
        Assert.assertEquals(" Successful message is not displaying", message, rolesPage.getRoleCreateSuccessfulMessage());
    }

    @And("^Verify added new Role like \"([^\"]*)\" \"([^\"]*)\"$")
    public void verifyAddedNewRoleLike(String roleName, String roleType)  {
        Assert.assertEquals("", roleName, rolesPage.getNewRoleName());
        Assert.assertEquals("", roleType, rolesPage.getNewRoleType());
    }
}
