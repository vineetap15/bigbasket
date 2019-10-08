package bigbasket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetail {
    WebDriver driver;
    
    public ProductDetail(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    public @FindBy(css ="div._2yfKw h1.GrE04")
    WebElement productTitle;

    public @FindBy(css ="#price tr:nth-child(2)  td.IyLvo")
    WebElement firstItemPrice;

    public @FindBy(css ="div.Cs6YO.rippleEffect")
    WebElement addToBasketButton;

    public @FindBy(css ="div.eubx4")
    WebElement myBasket;

    public @FindBy(css ="div._287jQ a[data-qa*='viewBasketCheckout']")
    WebElement viewBasketAndCheckout;

    public @FindBy(css="button.sc-11342g5-0-button__Btn-kljfud.jCocyc")
    WebElement loginButtonFromProductView;

    public @FindBy(css="input[name*='email']")
    WebElement emailTextFieldFromProductView;

    

    

    
}