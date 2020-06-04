package pageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BaseClass;
import utilities.WaitHelper;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(BaseClass.driver, this);

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


    public String PageTitle() {
        return BaseClass.driver.getTitle();
    }

    public void setEmailId(String emailId) {
        WaitHelper.WaitForElement(BaseClass.driver, emailIdBox, 20);
        emailIdBox.click();
        WaitHelper.WaitForElement(BaseClass.driver, emailIdBox, 20);
        emailIdBox.sendKeys(emailId);
    }

    public void setPassword(String password) {
        passwordBox.click();
        passwordBox.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickLogoutButton() throws InterruptedException {
        Thread.sleep(15000);
        clickPerform.click();
        Thread.sleep(5000);
        logoutButton.click();
    }

    public String unregisteredCredentialMessage() throws InterruptedException {
       // Thread.sleep(3000);
        return errorMessage.getText();
    }

    public String errorMessageColor() {
        String textBoxColor = colorEmailIdBox.getCssValue("border-color");
        String hexColor = Color.fromString(textBoxColor).asHex();

        return hexColor;
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

    public String errorMessageWrongPassword() throws InterruptedException {
        Thread.sleep(5000);
        return errorMessageWrongPassword.getText();

    }

}
