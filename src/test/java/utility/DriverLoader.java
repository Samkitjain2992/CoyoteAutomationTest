package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverLoader {
    public static WebDriver driver;
    public WebDriver getDriver(){
        String browserName = PropertyLoader.getPropertyLoader().getValue("browser");
        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +
                   PropertyLoader.getPropertyLoader().getValue("CHROME_DRIVER_DIRECTORY"));
            driver = new ChromeDriver();}
        else if (browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
                    PropertyLoader.getPropertyLoader().getValue("GECKO_DRIVER_DIRECTORY"));
        }else if (browserName.equals("ie")){
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
                    "src/test/java/Drivers/geckodriver.exe");
        }else {
            System.out.println("Unable to load browser: " );
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        return driver;


    }
}
