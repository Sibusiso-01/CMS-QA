package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//input[@placeholder='Enter your first name']")
    WebElement txt_firstname;
    @FindBy(xpath="//input[@placeholder='Enter your last name']")WebElement txt_lastName;
    @FindBy(xpath="//input[@placeholder='Enter your email']")WebElement txt_email;
    @FindBy(xpath="/html/body/div/div/div/form/div[4]/select")WebElement scheme_name;
    @FindBy(xpath="//input[@value='Sign Up']")WebElement signup_btn;
    @FindBy(xpath="//a[normalize-space()='Sign In']")WebElement sign_In_link;


    public void setTxt_name(String name) {
        txt_firstname.sendKeys(name);

    }
    public  void setSign_up_btn(){signup_btn.click();}
    public void setTxt_email(String email) {
        txt_email.sendKeys(email);
    }
    public void setTxt_lastName(String lastName) {
        txt_lastName.sendKeys(lastName);
    }
    public void setScheme_name() {
        //scheme_name.click();
        Select select = new Select(scheme_name);
        select.selectByVisibleText("MOMENTUM MEDICAL SCHEME");
    }
    public void setSign_In_link(){sign_In_link.click();}

}
