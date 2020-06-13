package stepDefinitions;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.DriverLoader;
import utility.PropertyLoader;
import utility.ScreenShotHandle;

import java.util.concurrent.TimeUnit;

public class BaseClass extends DriverLoader {


    @Before(order = 1)
    public void before_method() {
        driver = getDriver();
    }

    @Before(order = 2)
    public void getUrl() {
        driver.get(PropertyLoader.getPropertyLoader().getValue("coyoteURL"));
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

    }

    @After
    public void tearDownAndScreenshotOnFailure(Scenario scenario) {
        try {
            if (driver != null && scenario.isFailed()) {
                scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
                ScreenShotHandle.captureScreenshot();
                driver.manage().deleteAllCookies();
                driver.quit();
                driver = null;
            }
            if (driver != null) {
                driver.manage().deleteAllCookies();
                driver.quit();
                Thread.sleep(5000);
                driver = null;
            }
        } catch (Exception e) {
            System.out.println("Methods failed: tearDownAndScreenshotOnFailure, Exception: " + e.getMessage());
        }
    }


}
