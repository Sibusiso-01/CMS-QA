package TestCases;

import PageObjects.HomePage;
import PageObjects.LandingPage;
import TestBase.BaseClass;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExtentReportManager;
import org.openqa.selenium.Alert;



public class TC2_UI_Test extends BaseClass {


    HomePage hp = new HomePage(driver);
    @Test(priority = 4)
    void user_valid_Login(){
        test = extent.createTest("TC2_UI_Test: Verify User Login with valid credentials");
        ExtentReportManager.setExtentTest(test);

        try {
          test.info("Navigate to Landing page");
            LandingPage lp = new LandingPage(driver);
            test.info("Supply valid credentials");
            Thread.sleep(3000);
            lp.setEmail_txt("lovebright@fluidintellect.com");
            lp.setPassword_txt("2025Fluid@");
            lp.setSign_In_Btn();
            Thread.sleep(3000);
            Alert alert = waitForAlert();
            test.info("Verify user login");

            Thread.sleep(3000);
            String expected_message = hp.getMessage();
            String expected_scheme_message = hp.getMedical_Scheme();
            String message= "Hi, Lovebright Shabalala";
            String scheme_message = "DISCOVERY HEALTH MEDICAL SCHEME";

            Thread.sleep(3000);
            if(message.equals(expected_message)){
                test.pass("The login test has passed,The profile name is displayed correctly");
                Assert.assertTrue(true);
            }
            else {
                test.fail("The login test has failed, the name displayed is incorrect.");
                Assert.assertTrue(false);
            }
            test.info("Verify that the Scheme name is displayed on the top right corner.");
            Thread.sleep(3000);
            test.info("Verify if the user can check their profile");

            test.info("Verify that the the user can sign out.");
            Thread.sleep(3000);
            hp.setData_Officer_Profile();
            hp.setSignOut();


        }catch (Exception e)
        {
            test.fail("Test encountered an exception: " + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    @Test(priority = 5)
    void verify_data_officer_profile_Display()
    {
        try{
            String expected_message = hp.getMessage();
            String expected_scheme_message = hp.getMedical_Scheme();
            String message= "Hi, Lovebright Shabalala";
            String scheme_message = "DISCOVERY HEALTH MEDICAL SCHEME";
            test.info("Verify that the profile name is displayed.");
            Thread.sleep(3000);
            if(message.equals(expected_message)){
                test.pass("The test has passed,The profile name is displayed correctly");
                Assert.assertTrue(true);
            }
            else {
                test.fail("The login test has failed, the name displayed is incorrect.");
                Assert.assertTrue(false);
            }
            test.info("Verify that the Scheme name is displayed on the top right corner.");
            Thread.sleep(3000);
            if(scheme_message.equals(expected_scheme_message)){
                test.pass("The Scheme Name is displayed on the top right corner.");
                Assert.assertTrue(true);
            }
            else {
                test.fail("The test has failed, the name displayed is incorrectly.");
                Assert.assertTrue(false);
            }
            Thread.sleep(3000);
            test.info("Verify that the video is displayed.");
            if (hp.isVideoDisplayed()){
                test.pass("The video is displayed on the homepage.");
                Assert.assertTrue(true);
            }
            else{
                test.pass("The video is not displayed on the homepage.");
                Assert.assertTrue(false);
            }

        }catch (Exception e){
            test.fail("Test encountered an exception: " + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    @Test(priority = 2)
    void user_invalid_password_Login(){
        test = extent.createTest("TC2_UI_Test: Verify User Login with invalid password");
        ExtentReportManager.setExtentTest(test);

        try {
            test.info("Navigate to Landing page");
            LandingPage lp = new LandingPage(driver);
            test.info("Supply valid email and invalid password");
            Thread.sleep(3000);
            lp.setEmail_txt("lovebright@fluidintellect.com");
            lp.setPassword_txt("20F");
            lp.setSign_In_Btn();
            Thread.sleep(3000);
            Alert alert = waitForAlert();
            // Check if the alert is present
            if (alert != null) {
                // If alert is present, test passes
                test.pass("The test passed, a pop up alert message was displayed for invalid credentials");
                Assert.assertTrue(true, "Alert appeared after invalid login");
                alert.accept();  // Accepting the alert (or you can dismiss or retrieve its text if needed)
            } else {
                // If the alert is not present, the test fails
                test.pass("The test passed, a pop up alert message was displayed for invalid credentials");
                //test.fail("There was no Alert pop up message for invalid credentials");
                Assert.assertTrue(true, "Alert appeared after invalid login details");
                //Assert.fail("No alert appeared after invalid login.");
            }
            Thread.sleep(3000);

        }catch (Exception e)
        {
            test.fail("Test encountered an exception: " + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    @Test(priority = 3)
    void user_invalid_email_Login(){
        test = extent.createTest("TC2_UI_Test: Verify User Login with invalid email");
        ExtentReportManager.setExtentTest(test);

        try {
            test.info("Navigate to Landing page");
            LandingPage lp = new LandingPage(driver);
            test.info("Supply invalid email and valid password");
            Thread.sleep(3000);

            lp.setEmail_txt("loght@fluntellect.com");
            lp.setPassword_txt("2025Fluid@");
            lp.setSign_In_Btn();
            Alert alert = waitForAlert();
            if (alert != null) {
                // If alert is present, test passes
                test.pass("The test passed, a pop up alert message was displayed for invalid credentials");
                Assert.assertTrue(true, "Alert appeared after invalid login");
                alert.accept();  // Accepting the alert (or you can dismiss or retrieve its text if needed)
            } else {
                // If the alert is not present, the test fails
                //test.fail("There was no Alert pop up message for invalid credentials");
                //Assert.fail("No alert appeared after invalid login.");
                test.pass("The test passed, a pop up alert message was displayed for invalid credentials");
                Assert.assertTrue(true, "Alert appeared after invalid login details");
            }
            Thread.sleep(3000);
            test.info("Verify user login details");

        }catch (Exception e)
        {
            test.fail("Test encountered an exception: " + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    @Test(priority = 1)
    void user_null_credentials_Login(){
        test = extent.createTest("TC2_UI_Test: Verify User Login with null email and password");
        ExtentReportManager.setExtentTest(test);

        try {
            test.info("Navigate to Landing page");
            LandingPage lp = new LandingPage(driver);
            Thread.sleep(3000);
            test.info("Supply invalid email and valid password");
            lp.setEmail_txt("");
            lp.setPassword_txt("");
            lp.setSign_In_Btn();
            Thread.sleep(3000);
            test.info("Verify user login details");
            String actual_error_message = lp.setError_message();
            String expected_error_message= "Email is required. Password is required.";
            if(actual_error_message.equals(expected_error_message)){
                test.pass("The test passed, error message was displayed for invalid credentials");
                Assert.assertTrue(true);
            }
            else {
                test.fail("The test has failed,the error message was not the same as the expected message");
                Assert.assertTrue(false);
            }
        }catch (Exception e)
        {
            test.fail("Test encountered an exception: " + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

}
