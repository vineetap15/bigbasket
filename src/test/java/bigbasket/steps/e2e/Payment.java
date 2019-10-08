
package bigbasket.steps.e2e;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;

import bigbasket.pages.CategoryNav;
import bigbasket.pages.HomePage;
import bigbasket.pages.Login;
import bigbasket.pages.MyBasket;
import bigbasket.pages.ProductDetail;
import bigbasket.pages.ProductList;
import bigbasket.utils.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Payment extends Util{
    Util util = new Util();
    
    // WebDriver driver = util.getDriver();
    HomePage hp = new HomePage(driver);
    Login login = new Login(driver);
    MyBasket mb = new MyBasket(driver);
    ProductDetail pd = new ProductDetail(driver);
    ProductList pl = new ProductList(driver);
    CategoryNav cn = new CategoryNav(driver);
    Actions action = new Actions(driver);

@Given("User selects a category")
public void user_selects_a_category() throws InterruptedException {
        cn.shopByCategory.click();
        Thread.sleep(2000);
        util.explicitWait(cn.kitchenGardenCategory, Duration.ofSeconds(10));
        action.moveToElement(cn.kitchenGardenCategory).build().perform();
        System.out.println("moved to kitchen category");
         util.explicitWait(cn.storageAndAccessoriesoption, Duration.ofSeconds(15));
        action.moveToElement(cn.storageAndAccessoriesoption).build().perform();
        cn.storageAndAccessoriesoption.click();
        //System.out.println("moved to storage category");
        // util.explicitWait(cn.lunchBoxoption, Duration.ofSeconds(15));
        // action.moveToElement(cn.lunchBoxoption).build().perform();
        // System.out.println("moved to lunch category");
        // cn.lunchBoxoption.click();
        util.explicitWait(pl.firstItem, Duration.ofSeconds(15));
        System.out.println("price in list- " +pl.firstItemPrice.getText());
        System.out.println("title in list- "+pl.productTitle.getText());

        System.out.println("clicking 1st item");
        pl.firstItem.click();
        System.out.println("clicked 1st item");
        
        //Thread.sleep(4000);
        
}

@When("User adds  the product in his basket")
public void user_adds_the_product_in_his_basket() throws InterruptedException {
        System.out.println("price in product details- " +pd.firstItemPrice.getText());
        System.out.println("title in product details- "+pd.productTitle.getText());
        pd.addToBasketButton.click();
        pd.myBasket.click();
        pd.viewBasketAndCheckout.click();
        util.explicitWait(pd.emailTextFieldFromProductView, Duration.ofSeconds(15));
        pd.emailTextFieldFromProductView.sendKeys("vineetapandey24194@gmail.com");
        // util.explicitWait(pd.loginButtonFromProductView, Duration.ofSeconds(15));
        // pd.loginButtonFromProductView.click();
        Thread.sleep(4000);
        System.out.println("price in basket page - " +mb.productPrice.getText());
        System.out.println("title in basket page - "+mb.productTitle.getText());
        util.explicitWait(mb.checkoutButton, Duration.ofSeconds(15));

        mb.checkoutButton.click();
}

@Then("user should be able to complete the payment")
public void user_should_be_able_to_complete_the_payment() {
    
}

}