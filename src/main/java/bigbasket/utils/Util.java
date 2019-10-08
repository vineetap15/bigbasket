package bigbasket.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Util {
    public static Properties prop = null;
    public static WebDriver driver = null;

    public WebDriver getDriver(){
        return driver;
    }

    public void loadConfigProperties() throws IOException {
        prop = new Properties();
        String path = "src/main/java/bigbasket/config/config.properties";
        try {
            FileInputStream fis = new FileInputStream(path);
            prop.load(fis);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Property file is not found in the given path: " + path);
        }
    }

    public void setDriverPath(){
        String path = System.getProperty("user.dir")+"/src/test/resources/drivers";
        if(System.getProperty("os.name").startsWith("Linux")){
            String firfoxDriver = path+"/linux/geckodriver";
            String chromeDriver = path+"/linux/chromedriver";
            System.setProperty("webdriver.gecko.driver", firfoxDriver);
            System.setProperty("webdriver.chrome.driver", chromeDriver);
        }
        if(System.getProperty("os.name").startsWith("Mac")){
            String firfoxDriver = path+"/mac/geckodriver";
            String chromeDriver = path+"/mac/chromedriver";
            System.setProperty("webdriver.gecko.driver", firfoxDriver);
            System.setProperty("webdriver.chrome.driver", chromeDriver);
        }
        if(System.getProperty("os.name").startsWith("Windows")){
            String firfoxDriver = path+"/windows/geckodriver";
            String chromeDriver = path+"/windows/chromedriver";
            System.setProperty("webdriver.gecko.driver", firfoxDriver);
            System.setProperty("webdriver.chrome.driver", chromeDriver);
        }

    }

    public void LaunchBrowser() throws IOException {
        loadConfigProperties();
        setDriverPath();
        String browser = prop.getProperty("browser");
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            driver= new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("ie")){
            driver = new InternetExplorerDriver();
        }
    }

    public void openURL() throws IOException {
        loadConfigProperties();

        String url = prop.getProperty("url");
        driver.get(url);

    }

    public void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public void deleteCookie(){
        driver.manage().deleteAllCookies();
    }

    public void implicitWait(int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public void explicitWait(WebElement element,Duration time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void quit(){
        driver.quit();
    }

}