package bigbasket.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressBook {
    WebDriver driver;
    ArrayList address;
    
    public AddressBook(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public @FindBy(css = "div#uiv2-address-book > div:nth-child(1)")
    WebElement myAddress1;

    public @FindBy(css = "div#uiv2-address-book > div:nth-child(1)>div:nth-child(5)")
    WebElement myAddressName;

    public @FindBy(css ="div#uiv2-address-book > div:nth-child(1)>span:nth-child(6)")
    WebElement myAddressLine1;

    

    

    
}