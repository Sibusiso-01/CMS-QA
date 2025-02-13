package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserProfilePage extends BasePage{
    public UserProfilePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath="//button[normalize-space()='Home']")
    WebElement Home_Link;
    @FindBy(xpath="//h3[normalize-space()='Lovebright Shabalala']") WebElement profile_name;
    @FindBy(xpath="//p[@class='text-lg text-") WebElement profile_email;
    @FindBy(xpath="//input[@id='currentPassword']") WebElement current_password;
    @FindBy(xpath="//input[@id='newPassword']") WebElement new_password;
    @FindBy(xpath="//input[@id='confirmPassword']") WebElement confirm_password;
    @FindBy(xpath="//button[normalize-space()='Update Password']") WebElement Update_Password_Btn;


    public void setHome_Link(){Home_Link.click();}
    public String check_Profile_Display(){
        String actual = profile_name.getText();
        return actual;
    }
    public String check_email(){
        String Actual_email = profile_email.getText();
        return  Actual_email;
    }

    public void setCurrent_password(String password)
    {
        current_password.sendKeys(password);
    }
    public void setNew_password(String New_password)
    {
        new_password.sendKeys(New_password);
    }
    public void setConfirm_password(String Confirm_password)
    {
        confirm_password.sendKeys(Confirm_password);
    }
    public void setUpdate_Password_Btn(){Update_Password_Btn.click();}


}
