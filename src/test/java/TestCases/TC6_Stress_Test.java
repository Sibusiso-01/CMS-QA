package TestCases;
import PageObjects.HomePage;
import PageObjects.LandingPage;
import TestBase.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import utilities.ExtentReportManager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TC6_Stress_Test extends BaseClass{

    // Set up Chrome options (optional)

    //Flat Contribution
    //************************************
    String member_risk_con = "2000";
    String adult_risk_con = "1900";
    String child_risk_con = "1500";
    String member_savings_con = "1900";
    String adult_savings_con = "1500";
    String child_savings_con = "500";
    //Income Band Contribution
    //************************************

    public void setFlatAmounts(){
        HomePage hp = new HomePage(driver);
        hp.setMember_Risk_Contribution(member_risk_con);
        hp.setAdult_Dependent_Risk_Con(adult_risk_con);
        hp.setChild_Dependent_Risk_Con(child_risk_con);
        hp.setMember_Saving_Con(member_savings_con);
        hp.setAdult_Savings_Con(adult_savings_con);
        hp.setChild_Savings_Con(child_savings_con);
    }
    void StreesTest(){
        HomePage hp = new HomePage(driver);
        test = extent.createTest("TC6_Stress/Load Test : This ensures that the system is scalable");
        ExtentReportManager.setExtentTest(test);

        try {
            test.info("Navigate to Landing page");
            LandingPage lp = new LandingPage(driver);
            test.info("Supply valid credentials");
            Thread.sleep(3000);
            lp.setEmail_txt("sbun.gift@gmail.com");
            lp.setPassword_txt("Sbudalo@N93");
            lp.setSign_In_Btn();
            Thread.sleep(3000);
            Alert alert = waitForAlert();
            test.info("Verify user login");

            Thread.sleep(3000);
            String expected_message = hp.getMessage();

            String message= "Hi, Sibusiso Nyundu";


            Thread.sleep(3000);
            if(message.equals(expected_message)){
                test.pass("The login test has passed,The profile name is displayed correctly");
                Assert.assertTrue(true);
            }
            else {
                test.fail("The login test has failed, the name displayed is incorrect.");
                Assert.assertTrue(false);
            }

//
//          test.info("Verify that the data officer can change their password");
            Thread.sleep(3000);
            hp.setCustom();
            Thread.sleep(2000);
            hp.Option_Status();
            Thread.sleep(3000);
            hp.setContinuation();
            Thread.sleep(3000);
            hp.setFlat_Contribution();
            Thread.sleep(3000);
            setFlatAmounts();
            Thread.sleep(3000);
            hp.setSave_Continue_btn();
            Thread.sleep(3000);
            hp.setConfinement_Check();
            Thread.sleep(3000);
            hp.setBenefitCeiling__Check();
            Thread.sleep(3000);
            hp.setBenefit_Member_Amount();
            Thread.sleep(3000);
            hp.setBenefit_Family_Amount();
            Thread.sleep(3000);
            hp.setThreshold_Check();
            Thread.sleep(3000);
            hp.setThreshold_Member();
            hp.setThreshold_Fam();
            Thread.sleep(3000);
            hp.setNetwork();
            hp.setSetting_General();
            hp.setSave_Continue_btn();
            Thread.sleep(3000);
            hp.setHPV_Vaccine();
            Thread.sleep(3000);
            hp.setBenefitCeiling__Check();
            hp.setBenefit_Member_Amount();
            Thread.sleep(3000);
            hp.setBenefit_Family_Amount();
            hp.setNetwork();
            Thread.sleep(3000);
            hp.setSet_Specialised();
            Thread.sleep(3000);
            hp.setSave_Continue_btn();







//
//            hp.setSignOut();


        }catch (Exception e)
        {
            test.fail("Test encountered an exception: " + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
}
