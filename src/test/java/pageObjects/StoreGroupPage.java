package pageObjects;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class StoreGroupPage extends BasePage {
    public StoreGroupPage() throws IOException {
        super();
        PageFactory.initElements( driver, this);
    }
    @FindBy(xpath = "//img[@alt='Icon']")
    WebElement leftNavigationPanelButton;

    @FindBy(xpath = "//span[text()='Entry Setup']")
    WebElement entrySetupButton;

    @FindBy(xpath = "//a[text()='Store Groups']")
    WebElement storeGroupText;

    @FindBy(xpath = "//h4[@class='title flex-grow-1 mb-0']")
    WebElement storeGroupTitle;

    @FindBy(xpath = "//a[text()=' Add']")
    WebElement storeGroupAddButton;

    @FindBy(xpath = "//button[text()=' Print']")
    WebElement storeGroupPrintButton;

    @FindBy(xpath = "//button[text()=' Export']")
    WebElement storeGroupExportButton;

    @FindBy(xpath = "//th[text()='Status']")
    WebElement storeGroupStatusText;

    @FindBy(xpath = "//th[text()='Code']")
    WebElement storeGroupCodeText;

    @FindBy(xpath = "//th[text()='Description']")
    WebElement storeGroupDescriptionText;

    @FindBy(xpath = "//th[text()='Action']")
    WebElement storeGroupActionText;

    @FindBy(xpath = "//input[@type='search']")
    WebElement storeGroupSearchTextBox;

    @FindBy(xpath = "//input[@ng-reflect-name='code']")
    WebElement storeGroupCodeField;

    @FindBy(xpath = "//input[@ng-reflect-name='name']")
    WebElement storeGroupDescriptionField;

    @FindBy(xpath = "//select[@ng-reflect-name='status']")
    WebElement storeGroupStatusDropDownList;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement storeGroupOkButton;

    @FindBy(xpath = "//a[@class='btn width-80']")
    WebElement storeGroupCancelButton;

    @FindBy(xpath = "//button[@class='tbHover-btn trash-btn'][1]")
    WebElement storeGroupEditButton;

    @FindBy(xpath = "//p[text()='Store group created successfully']")
    WebElement addNewStoreGroupSuccessful;

    @FindBy(xpath = "//p[text()='Store group updated successfully']")
    WebElement  updatedStoreGroupSuccessfulMessage;

    @FindBy(xpath = "//button[@tooltip='Delete']")
    WebElement storeGroupDeleteButton;

    @FindBy(xpath = "//*[@id=\"store-group-table\"]/tbody/tr[1]/td[2]")
    WebElement addNewStoreGroupCodeFieldValidation;

    @FindBy(xpath = "//*[@id=\"store-group-table\"]/tbody/tr[1]/td[3]")
    WebElement addNewStoreGroupDescriptionFieldValidation;

    @FindBy(xpath = "//span[@class='status-check status-true']")
    WebElement addNewStoreGroupStatusValidation;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    WebElement deleteOkButton;

    @FindBy(xpath = "//p[text()='Deleted successfully']")
    WebElement deletedStoreGroupSuccessfulMessage;

    @FindBy(xpath = "//button[@class='notifier__notification-button']")
    WebElement toastLoginMessage;







    public void clickOnLeftNavigationPanelButton() throws IOException, InterruptedException {
        waitAndClickElement(toastLoginMessage);
        waitAndClickElement(leftNavigationPanelButton);
    }

    public void clickEntrySetupIcon() throws IOException, InterruptedException {
        waitAndClickElement(entrySetupButton);
    }

    public void clickStoreGroupText() throws IOException, InterruptedException {
        waitAndClickElement(storeGroupText);
    }
    
    public void storeGroupPageTitle(){
        isDisplay(storeGroupTitle);
    }
    public boolean getStoreGroupAddButton(){
       return isDisplay(storeGroupAddButton);
    }
    public void getStoreGroupPrintButton(){
        isDisplay(storeGroupPrintButton);
    }
    public void getStoreGroupExportButton(){
        isDisplay(storeGroupExportButton);
    }
    public void getStoreGroupStatusText(){
        isDisplay(storeGroupStatusText);
    }
    public void getStoreGroupCodeText(){
        isDisplay(storeGroupCodeText);
    }
    public void getStoreGroupDescriptionText(){
        isDisplay(storeGroupDescriptionText);
    }
    public void getStoreGroupActionText(){
        isDisplay(storeGroupActionText);
    }
    public void getStoreSearchTextBox(){
        isDisplay(storeGroupSearchTextBox);
    }

    public void contentOfStoreGroupPage(){
        LinkedList<WebElement> contentStoreGroup = new LinkedList<>();
        contentStoreGroup.add(storeGroupAddButton);
        contentStoreGroup.add(storeGroupPrintButton);
        contentStoreGroup.add(storeGroupExportButton);
        contentStoreGroup.add(storeGroupStatusText);
        contentStoreGroup.add(storeGroupCodeText);
        contentStoreGroup.add(storeGroupDescriptionText);
        contentStoreGroup.add(storeGroupActionText);
        contentStoreGroup.add(storeGroupSearchTextBox);
        for (int i = 0; i < contentStoreGroup.size(); i++) {
            if (isDisplay(contentStoreGroup.get(i))){
                System.out.println("Store Group Content Is Displaying ");
//                Assert.assertEquals(contentStoreGroup.get(i),isDisplay(contentStoreGroup.get(i)));
            }else {
                System.out.println("This Content Of Store Group Is Not Displaying  " + contentStoreGroup.get(i));
            }
        }
    }
    public void clickOnAddButton() throws IOException, InterruptedException {
        waitAndClickElement(storeGroupAddButton);
    }



    public void setCodeField(String code) throws Exception {
     sendKeysToWebElement(storeGroupCodeField,code);
    }

    public void setDescription(String description) throws Exception {
        sendKeysToWebElement(storeGroupDescriptionField,description);
    }
    public void setStatus(String value){
        selectDropDown(storeGroupStatusDropDownList,value);
    }
    public void clickOkButton() throws IOException, InterruptedException {
        waitAndClickElement(storeGroupOkButton);
    }
    public String successfulMessageStoreGroupCreated() throws InterruptedException {

        return addNewStoreGroupSuccessful .getText();
    }

    public void clickEditButton() throws IOException, InterruptedException {
        waitAndClickElement(storeGroupEditButton);
    }

    public String newStoreGroupCodeField(){
      return addNewStoreGroupCodeFieldValidation.getText();
    }

    public String newStoreGroupDescriptionField(){
        return  addNewStoreGroupDescriptionFieldValidation.getText();
    }
    public void newStoreGroupStatusIcon(){
        isDisplay(addNewStoreGroupStatusValidation);
    }

    public String successfulMessageUpdateStoreGroup(){
        return updatedStoreGroupSuccessfulMessage.getText();
    }

    public void clickOnDeleteButton() throws IOException, InterruptedException {
        Thread.sleep(3000);
        waitAndClickElement(storeGroupDeleteButton);
    }

    public void clickOnDeleteOkButton() throws IOException, InterruptedException {
        waitAndClickElement(deleteOkButton);
    }

    public String successfulMessageDeleteStoreGroup() throws InterruptedException {

        return deletedStoreGroupSuccessfulMessage.getText();
    }








}
