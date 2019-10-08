package bigbasket.steps.e2e;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import bigbasket.pages.HomePage;
import bigbasket.pages.Login;
import bigbasket.utils.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSuccess extends Util{
    Util util = new Util();
    
    WebDriver driver = util.getDriver();
    HomePage hp = new HomePage(driver);
    Login login = new Login(driver);

    @Given("User enter email {string} and otp")
    public void user_enter_email_and_otp(String email) {
        hp.loginLink.click();
        login.emailTextField.sendKeys(email);
    }
    
    @When("user click the login button")
    public void user_click_the_login_button() throws InterruptedException {
        login.loginButton.click();
        Thread.sleep(3000);
    }
    
    @Then("User should be redirected to home screen {string}")
    public void user_should_be_redirected_to_home_screen(String url) {
        String actual_current_url = driver.getCurrentUrl();
        System.out.println("current_URL - " +actual_current_url);
        Assert.assertEquals(actual_current_url, url);
    }

}