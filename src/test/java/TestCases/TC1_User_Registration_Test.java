package TestCases;


import PageObjects.LandingPage;
import PageObjects.RegisterPage;
import TestBase.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC1_User_Registration_Test extends BaseClass {



    @Test
    void User_Register_Test() throws InterruptedException {
        try {


            LandingPage lp = new LandingPage(driver);
            RegisterPage rp = new RegisterPage(driver);
            Thread.sleep(2000);
            lp.setSignup_link();
            Thread.sleep(2000);
            rp.setTxt_name("Sibusiso");
            Thread.sleep(2000);
            rp.setTxt_lastName("Nyundu");
            Thread.sleep(2000);
            rp.setTxt_email("Sbun.gift@gmail.com");
            Thread.sleep(2000);
            rp.setScheme_name();
            Thread.sleep(2000);
            //rp.setSign_up_btn();
        }catch (Exception e){
            Assert.fail(e.getMessage());        }
    }




}
