package PageObjects;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LandingPage extends BasePage{

    public LandingPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath="//button[normalize-space()='Forgot Password']") WebElement Forgot_Password_link;
    @FindBy(xpath="//input[@placeholder='Enter your email']") WebElement Email_txt;
    @FindBy(xpath="//input[@placeholder='Enter your password']") WebElement Password_txt;
    @FindBy(xpath="//a[normalize-space()='Sign Up']") WebElement Signup_link;
    @FindBy(xpath="//h5[@class='text-xl font-bold text-white']") WebElement Sign_In_Btn;
    @FindBy(xpath="//p[@class='text-red-500 text-center']") WebElement error_message;

    private static boolean isAlertPresent(WebDriver driver) {
        try {
            driver.switchTo().alert();  // Try switching to the alert
            return true;  // If no exception is thrown, alert is present
        } catch (NoAlertPresentException e) {
            return false;  // If exception is thrown, alert is not present
        }
    }


    // Create methods for all elements

    public void setEmail_txt(String email_txt) {
        Email_txt.clear();Email_txt.sendKeys(email_txt);
    }
    //Registration
    //*************************************


    public void setForgot_Password_link() {
        Forgot_Password_link.click();
    }

    public void setSignup_link() {
        Signup_link.click();
    }

    public void setSign_In_Btn() {
        Sign_In_Btn.click();
    }

    public void setPassword_txt(String password_txt) {
        Password_txt.clear();
        Password_txt.sendKeys(password_txt);
    }

    public String setError_message() {
      String message = error_message.getText();
      return message;
    }
}
