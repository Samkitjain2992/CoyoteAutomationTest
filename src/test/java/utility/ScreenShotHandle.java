package utility;

import com.cucumber.listener.Reporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import stepDefinitions.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScreenShotHandle  {
    private static String screenshotName;

    public static String returnDateStamp(String fileExtension) {
        Date d = new Date();
        String date = d.toString().replace(":", "_").replace(" ", "_") + fileExtension;
        return date;
    }

    public static void captureScreenshot() throws IOException, InterruptedException {
        File srcFile = ((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.FILE);

         screenshotName = returnDateStamp(".jpg");

        FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "\\output\\imgs\\" + screenshotName));

        Reporter.addStepLog("Taking a screenshot!");
        Reporter.addStepLog("<br>");
        Reporter.addStepLog("<a target=\"_blank\",href="+ returnScreenshotName() + "><img src="+ returnScreenshotName()+ " height=200 width=300></img></a>");
    }

    public static String returnScreenshotName() {
        return (System.getProperty("user.dir") + "\\output\\imgs\\" + screenshotName).toString();
    }

    public static void main(String[] args) {
        System.out.println(returnScreenshotName());
    }
}
