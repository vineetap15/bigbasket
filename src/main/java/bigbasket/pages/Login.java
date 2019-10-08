package bigbasket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;
    
    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public @FindBy(css = "input#otpEmail")
    WebElement emailTextField;

    public @FindBy(css = "a.gplusBtn.smGlobalBtn")
    WebElement googleButton;



    public @FindBy(css = "button[ng-click^='$ctrl.loginWithOTPLinkClicked']")
    WebElement loginButton;

    public @FindBy(css = "input.otp:nth-child(2)")
    WebElement otpTextField;

    public @FindBy(css = "button.btn:nth-child(4)")
    WebElement loginButton_OTP;

    

    
}