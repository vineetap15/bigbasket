package bigbasket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public @FindBy(css = "li.auth>a:nth-child(4)")
    WebElement loginLink;

    public @FindBy(css = "li.auth>a:nth-child(6)")
    WebElement signUpLink;

    public @FindBy(css ="div#navbar a")
    WebElement shopByCategory;

    

    
}