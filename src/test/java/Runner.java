import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import bigbasket.utils.Util;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    monochrome = true, 
    features = "src/test/resources/features", 
    glue = "bigbasket/steps", 
    plugin = {"pretty", "json:target/cucumber.json" }, 
    tags = { "@checkMainCategories" }
    )

public class Runner extends AbstractTestNGCucumberTests {
    Util util = new Util();
    

    @BeforeSuite(alwaysRun = true)
    public void setUp() throws IOException {
        
        util.LaunchBrowser();
        util.openURL();
        util.deleteCookie();
        util.maximizeWindow();
        util.implicitWait(4000);
    }

    @AfterSuite(alwaysRun = true)
    public void quit(){
        //util.quit();
    }

}