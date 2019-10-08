package bigbasket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyBasket {
    WebDriver driver;
    
    public MyBasket(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    public @FindBy(css ="div#cart-items div.express_basket a[id^=p_name_]")
    WebElement productTitle;

    public @FindBy(css ="div#cart-items div.express_basket  span.uiv2-unit-price")
    WebElement productPrice;

    public @FindBy(css ="button#checkout")
    WebElement checkoutButton;

   

    

    

    
}