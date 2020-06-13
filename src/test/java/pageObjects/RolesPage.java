package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RolesPage extends BasePage {
    public RolesPage() throws IOException {
        super();
        PageFactory.initElements( driver, this);
    }

    @FindBy(xpath = "//a[text()='Roles']")
    WebElement   selectRolesOption;

    @FindBy(xpath = "//a[text()=' New Role']")
    WebElement rolesNewRoleButton;

    @FindBy(xpath = "//th[text()='Status']")
    WebElement rolesStatusText;

    @FindBy(xpath = "//th[text()='Name']")
    WebElement rolesNameText;

    @FindBy(xpath = "//th[text()='Type']")
    WebElement rolesTypeText;

    @FindBy(xpath = "//th[text()='Action']")
    WebElement rolesActionText;

    @FindBy(xpath = "//input[@id='name']")
    WebElement rolesNameField;

    @FindBy(xpath = "//input[@id='code']")
    WebElement rolesCodeField;

    @FindBy(xpath = "//input[@id='type']")
    WebElement rolesTypeField;

    @FindBy(xpath = "//select[@id='status']")
    WebElement selectRoleStatus;

    @FindBy(xpath = "//label[@for='customControlppAll']")
    WebElement allPermissionCheckbox;

    @FindBy(xpath = "//button[text()='Submit']")
    WebElement  roleSubmitButton;

    @FindBy(xpath = "//p[text()='Role Created successfully']")
    WebElement roleCreateSuccessfulMessage;

    @FindBy(xpath = "//td[text()='QATesting']")
    WebElement newRoleName;

    @FindBy(xpath = "//td[text()='SuperAdmin']")
    WebElement newRoleType;










    public String getDashboardURL(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return getCurrentURL();
    }
    public void selectRoles() throws IOException, InterruptedException {
        waitAndClickElement(selectRolesOption);
    }
    public String getURL() throws InterruptedException {
        Thread.sleep(2000);
        return getCurrentURL();
    }
    public String getRolesNewRoleButton(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return rolesNewRoleButton.getText();
    }
    public String getRolesStatusText(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return rolesStatusText.getText();
    }
    public String getRolesNameText(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return rolesNameText.getText();
    }
    public String getRolesTypeText(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return rolesTypeText.getText();
    }
    public String getRolesActionText(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return rolesActionText.getText();
    }
    public void clickNewRoleButton() throws IOException, InterruptedException {
        waitAndClickElement(rolesNewRoleButton);
    }

    public void setRoleName(String roleName) throws Exception {
        sendKeysToWebElement(rolesNameField,roleName);
    }
    public void setRoleCode(String roleCode) throws Exception {
        sendKeysToWebElement(rolesCodeField,roleCode);
    }
    public void setRoleType(String roleType) throws Exception {
        sendKeysToWebElement(rolesTypeField,roleType);
    }
    public void setRoleStatus(String roleStatus){
        selectDropDownVisibleText(selectRoleStatus,roleStatus);
    }
    public void setPermission() throws IOException, InterruptedException {
        waitAndClickElement(allPermissionCheckbox);
    }
    public void clickOnSubmitButton() throws IOException, InterruptedException {
        waitAndClickElement(roleSubmitButton);
    }
    public String getRoleCreateSuccessfulMessage(){
        return roleCreateSuccessfulMessage.getText();
    }
    public String getNewRoleName(){
        return newRoleName.getText();
    }
    public String getNewRoleType(){
        return  newRoleType.getText();
    }



}
