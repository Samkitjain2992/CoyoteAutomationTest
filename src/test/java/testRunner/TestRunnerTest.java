package testRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"classpath:Login.feature","classpath:StoreGroup.feature"},
        glue = "stepDefinitions",
        monochrome = true,
        dryRun = false,
        strict = true,

         //tags = {"@Smoke"},
        plugin = {"pretty",
                "html:target/cucumber",
                "json:target/cucumber-report.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/Report.html"

        }
        )

public class TestRunnerTest {
}
