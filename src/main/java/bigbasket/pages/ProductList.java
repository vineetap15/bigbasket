package bigbasket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductList {
    WebDriver driver;
    
    public ProductList(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public @FindBy(css = "div.items > div:nth-child(1)")
    WebElement firstItem;

    public @FindBy(css ="div.items > div:nth-child(1) div.col-sm-12.col-xs-7.prod-name a")
    WebElement productTitle;

    public @FindBy(css ="div.items > div:nth-child(1) div.po-markup span.discnt-price span.ng-binding")
    WebElement firstItemPrice;

    

    

    
}