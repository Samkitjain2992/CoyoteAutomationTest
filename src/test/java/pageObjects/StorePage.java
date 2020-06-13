package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class StorePage extends BasePage {
    public StorePage() throws IOException {
        super();
        PageFactory.initElements( driver, this);
    }


    @FindBy(xpath = "//a[text()='Stores']")
    WebElement storeTextOption;

    @FindBy(xpath = "//a[text()=' Add']")
    WebElement storeAddButton;

    @FindBy(xpath = "//button[text()=' Print']")
    WebElement storePrintButton;

    @FindBy(xpath = "//button[text()=' Export']")
    WebElement storeExportButton;

    @FindBy(xpath = "//th[text()='Status']")
    WebElement storeStatusText;

    @FindBy(xpath = "//th[text()='Description']")
    WebElement storeDescriptionText;

    @FindBy(xpath = "//th[text()='Address 1']")
    WebElement storeAddress1Test;

    @FindBy(xpath = "//th[text()='Address 2']")
    WebElement storeAddress2Text;

    @FindBy(xpath = "//th[text()='Address 3']")
    WebElement storeAddress3Text;

    @FindBy(xpath = "//th[text()='Action']")
    WebElement storeActionText;

    @FindBy(xpath = "//input[@formcontrolname='code']")
    WebElement storeCodeField;

    @FindBy(xpath = "//select[@formcontrolname='status']")
    WebElement storeStatusSelect;

    @FindBy(xpath = "//input[@formcontrolname='desc']")
    WebElement storeDescriptionField;

    @FindBy(xpath = "//input[@formcontrolname='address1']")
    WebElement storeAddress1Field;

    @FindBy(xpath = "//input[@formcontrolname='address2']")
    WebElement storeAddress2Field;

    @FindBy(xpath = "//input[@formcontrolname='address3']")
    WebElement storeAddress3Field;

    @FindBy(xpath = "//input[@formcontrolname='postCode']")
    WebElement storePostCodeField;

    @FindBy(xpath = "//input[@formcontrolname='phoneNumber']")
    WebElement storePhoneNumberField;

    @FindBy(xpath = "//input[@formcontrolname='fax']")
    WebElement storeFaxField;

    @FindBy(xpath = "//input[@formcontrolname='delName']")
    WebElement storeNameField;

    @FindBy(xpath = "//input[@formcontrolname='delAddr1']")
    WebElement storeDelAddress1Field;

    @FindBy(xpath = "//input[@formcontrolname='delAddr2']")
    WebElement storeDelAddress2Field;

    @FindBy(xpath = "//input[@formcontrolname='delAddr3']")
    WebElement storeDelAddress3Field;

    @FindBy(xpath = "//input[@formcontrolname='delPostCode']")
    WebElement storeDelPostCodeField;

    @FindBy(xpath = "//select[@formcontrolname='groupId']")
    WebElement storeSelectStoreGroup;

    @FindBy(xpath = "//input[@formcontrolname='abn']")
    WebElement storeABNField;

    @FindBy(xpath = "//textarea[@class='form-control']")
    WebElement storeOutletsTillsField;





    public void clickStoreOption() throws IOException, InterruptedException {
        waitAndClickElement(storeTextOption);
    }

    public String getStorePageUrl() throws InterruptedException {
        Thread.sleep(2000);
        return getCurrentURL();
    }



    public void clickOnStoreAddButton() throws IOException, InterruptedException {
        waitAndClickElement(storeAddButton);
    }

    public void setStoreCodeField(){

    }

}
