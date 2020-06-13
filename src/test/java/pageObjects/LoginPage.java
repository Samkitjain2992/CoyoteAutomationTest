package pageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;


public class LoginPage extends BasePage  {

    public LoginPage() throws IOException {
        super();
        PageFactory.initElements( driver, this);
    }

    @FindBy(xpath = "//input[@type='text']")
    WebElement emailIdBox;

    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordBox;

    @FindBy(xpath = "//button[@class='btn btn-blue width-80']")
    WebElement loginButton;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutButton;

    @FindBy(xpath = "//p[text()='Invalid email/password combination'][1]")
    WebElement errorMessage;

    @FindBy(xpath = "//input[@type='text']")
    WebElement colorEmailIdBox;

    @FindBy(xpath = "//img[@src='assets/images/logo.png']")
    WebElement clickPerform;

    @FindBy(xpath = "//input[@class='form-control ng-invalid ng-dirty ng-touched is-invalid']")
    WebElement errorIconForInvalidEmailId;

    @FindBy(xpath = "//input[@class='form-control ng-untouched ng-pristine ng-invalid is-invalid']")
    WebElement errorIconForBlankEmailIdBox;

    @FindBy(xpath = "//*[@id=\"wrapper\"]/form/div/div/div/div[3]/div[1]/input")
    WebElement errorIconForBlankPasswordBox;

    @FindBy(xpath = "//p[@class='notifier__notification-message']")
    WebElement errorMessageWrongPassword;

    @FindBy(xpath = "//button[@class='notifier__notification-button']")
    WebElement toastLoginMessage;

    @FindBy(xpath = "//a[text()='Forgot Password?']")
    WebElement forgetPasswordLink;

    @FindBy(xpath = "//input[@type='text']")
    WebElement forgetPageEmailTextBox;

    @FindBy(xpath = "//button[@class='btn btn-blue width-80']")
    WebElement clickOnForgetPageNextButton;

    @FindBy(xpath = "//p[@class='notifier__notification-message'][1]")
    WebElement errorMessageForWrongEmailId;


    public String PageTitle() {
        return waiteForePageTitle();
    }

    public void setEmailId(String emailId) throws Exception {
        sendKeysToWebElement(emailIdBox,emailId);
//        WaitHelper.WaitForElement(driver, emailIdBox, 20);
//        emailIdBox.click();
//        WaitHelper.WaitForElement(driver, emailIdBox, 20);
//        emailIdBox.sendKeys(emailId);
    }

    public void setPassword(String password) throws Exception {
        sendKeysToWebElement(passwordBox,password);
//        passwordBox.click();
//        passwordBox.sendKeys(password);
    }

    public void clickLoginButton() throws IOException, InterruptedException {
        waitAndClickElement(loginButton);

    }

    public void clickLogoutButton() throws InterruptedException, IOException {
        waitAndClickElement(toastLoginMessage);
        //waitAndClickElement(clickPerform);
         Thread.sleep(3000);
        waitAndClickElement(logoutButton);
    }

    public String unregisteredCredentialMessage() {
        // Thread.sleep(3000);
        return errorMessage.getText();
    }

    public String errorMessageColor() {
        String textBoxColor = colorEmailIdBox.getCssValue("border-color");

        return Color.fromString(textBoxColor).asHex();
    }

    public boolean errorIconForInvalidEmailId() {
        try {
            return errorIconForInvalidEmailId.isDisplayed();
        } catch (NoSuchElementException exception) {
            System.out.println("Test case failed due to error icon is not displaying::  " + exception);
            return false;
        }

    }

    public boolean errorIconBlankEmailId() {
        try {
            return errorIconForBlankEmailIdBox.isDisplayed();
        } catch (NoSuchElementException exception) {
            System.out.println("Test case failed due to error icon is not displaying::  " + exception);
            return false;
        }
    }

    public boolean errorIconBlankPassword() {
        try {

            Thread.sleep(5000);
            passwordBox.click();
            return errorIconForBlankPasswordBox.isDisplayed();
        } catch (NoSuchElementException | InterruptedException exception) {
            System.out.println("Test case failed due to error icon is not displaying::  " + exception);
            return false;
        }
    }

    public String errorMessageWrongPassword() {
        return errorMessageWrongPassword.getText();
    }
    public void clickForgetPasswordLink() throws IOException, InterruptedException {
        waitAndClickElement(forgetPasswordLink);
    }

    public void setForgetEmailIdBox(String emailId) throws Exception {
        sendKeysToWebElement(forgetPageEmailTextBox,emailId);
    }
    public void clickForgetPageNextButton() throws IOException, InterruptedException {
        waitAndClickElement(clickOnForgetPageNextButton);
    }

    public String errorMessageInvalidEmailIdForgetPasswordPage() throws InterruptedException {
        Thread.sleep(2000);
        return errorMessageForWrongEmailId.getText();
    }

}
