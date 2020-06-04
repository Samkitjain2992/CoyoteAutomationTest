package stepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.PropertyLoader;
import utilities.ScreenShotHandle;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;


    @Before(order=1)
    public void before_method  (){
        String browserName = PropertyLoader.getPropertyLoader().getValue("browser");
        if (browserName.equals("chrome")){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +
                "/src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();}
        else if (browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
                    "src/test/java/Drivers/geckodriver.exe");
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Before(order = 2)
    public void getUrl(){
       driver.get(PropertyLoader.getPropertyLoader().getValue("coyoteURL"));
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);

    }


    @After(order = 1)
    public void closeWindow(){
        driver.quit();
    }


}
