package TestCases;

import PageObjects.HomePage;
import PageObjects.LandingPage;

import TestBase.BaseClass;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExtentReportManager;

public class TC5_Epic3  extends BaseClass {

    //Flat Contribution --
    //************************************
    String member_risk_con = "150";
    String adult_risk_con = "150";
    String child_risk_con = "150";
    String member_savings_con = "50";
    String adult_savings_con = "50";
    String child_savings_con = "50";

    int member_saving = Integer.parseInt(member_savings_con);
    int member_risk = Integer.parseInt(member_risk_con);
    int adult_risk = Integer.parseInt(adult_risk_con);
    int adult_savings = Integer.parseInt(adult_savings_con);
    int child_risk = Integer.parseInt(child_risk_con);
    int child_savings = Integer.parseInt(child_savings_con);
    int sum_member = member_risk + member_saving;
    int sum_adult = adult_risk + adult_savings;
    int sum_child = child_risk + child_savings;

    String member_sum = Integer.toString(sum_member);
    String adult_sum = Integer.toString(sum_adult);
    String child_sum = Integer.toString(sum_child);

    //Income Band Contribution
    //************************************

    public void setFlatAmounts() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        hp.setMember_Risk_Contribution(member_risk_con);
        hp.setMember_Saving_Con(member_savings_con);
        hp.setTotal_Member_Contribution(member_sum);
        Thread.sleep(2000);
        hp.setAdult_Dependent_Risk_Con(adult_risk_con);
        hp.setAdult_Savings_Con(adult_savings_con);
        hp.setTotal_Adult_Contribution(adult_sum);
        Thread.sleep(2000);
        hp.setChild_Dependent_Risk_Con(child_risk_con);
        hp.setChild_Savings_Con(child_savings_con);
        hp.setTotal_Child_Contribution(child_sum);
    }

    //*******************************************
//    void verifyOptionNameDisplay(){
//        HomePage hp = new HomePage(driver);
//        String actual = "Select Option:";
//        if(actual.equals(hp.setOptionNameText())){
//            test.info("The verification test passed the option name is diplayed");
//            Assert.assertTrue(true);
//        }else{
//            test.info("The verification test failed the option name is not displayed");
//            Assert.assertTrue(false);
//        }
//    }
//    void setCurrentYear(){
//        HomePage hp = new HomePage(driver);
//        String Year = "2026";
//        if(Year.equals(hp.setYear()))
//        {
//            test.info("Test has passed the year displayed is correct");
//            Assert.assertTrue(true);
//        }
//
//    }

    // Create a method that will verify the scheme name
    //***********************************************************8
    @Test(priority = 3)
    void Confinements_Test() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        test = extent.createTest("TC5_Epic3 Step: Verify functionality for confinements");
        //Confinements options
        //*************************************************
        try{
            test.info("Click on confinement and test the functionality.");
        hp.setConfinement_Check();
        Thread.sleep(2000);
        hp.setBenefitCeiling__Check();
        Thread.sleep(2000);
        hp.setBenefit_Member_Amount();
        Thread.sleep(2000);
        hp.setBenefit_Family_Amount();
        Thread.sleep(3000);
        hp.setNetwork();
        hp.setSetting_General();
        Thread.sleep(2000);
        hp.setConfinement_drop();
        Thread.sleep(2000);
        hp.setSave_Continue_btn();
        Thread.sleep(2000);
            test.pass("The Homeophatic functionality test has passed,The user is able to fill in all fields and move to the next buket");
            Assert.assertTrue(true);
         }catch (Exception e){
        test.fail("Test encountered an exception: " + e.getMessage());
        Assert.fail(e.getMessage());
        }
    }
    @Test(priority = 4)
    void HPV_Vaccine_Test () throws InterruptedException {
        HomePage hp = new HomePage(driver);
        test = extent.createTest("TC5_Epic3 Step: Verify functionality HPV Vaccine");
        ExtentReportManager.setExtentTest(test);
        try{
        //HPV OPTION
        //******************************************************
            test.info("Click on HPV Vaccine and test the functionality.");
        hp.setHPV_Vaccine();
        Thread.sleep(5000);
        hp.setHPV_BenefitCeiling__Check();
        Thread.sleep(2000);
        hp.setHPV_Benefit_Member_Amount();
        Thread.sleep(2000);
        hp.setHPV_Benefit_Family_Amount();
        Thread.sleep(2000);
        hp.setSave_Continue_btn();
            test.pass("The HPV Vaccine functionality test has passed,The user is able to fill in all fields and move to the next buket");
            Assert.assertTrue(true);
         }catch (Exception e){
        test.fail("Test encountered an exception: " + e.getMessage());
        Assert.fail(e.getMessage());
    }
    }
    @Test(priority = 5)
    void Physio_Test() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        test = extent.createTest("TC5_Epic3 Step: Verify functionality for Physiotherapy");
        ExtentReportManager.setExtentTest(test);
        try{
        //Physiotherapy test
        //*********************************************************
            test.info("Click on Physiotherapy and test the functionality.");
        Thread.sleep(2000);
        hp.setPhysiotherapy();
        Thread.sleep(3000);
        hp.setPhysio_Benefit_Check();
        Thread.sleep(3000);
        hp.setPhysio_Member_amount();
        Thread.sleep(3000);
        hp.setPhysio_Family_Amount();
        hp.setSave_Continue_btn();
            test.pass("The Physiotherapy functionality test has passed,The user is able to fill in all fields and move to the next buket");
            Assert.assertTrue(true);
         }catch (Exception e){
        test.fail("Test encountered an exception: " + e.getMessage());
        Assert.fail(e.getMessage());
        }
    }
    @Test(priority = 6)
    void HomeOphatic_Test(){
        HomePage hp = new HomePage(driver);
        test = extent.createTest("TC5_Epic3 Step: Verify functionality Home Ophathic.");
        ExtentReportManager.setExtentTest(test);
        try{
            //Home Ophatic test
            //***********************************************************
            test.info("Click on Homeophatic and test the functionality.");
            Thread.sleep(2000);
            hp.setHomeophatic_check();
            Thread.sleep(2000);
            hp.setHome_Benefit_Check();
            Thread.sleep(2000);
            hp.setHome_Benefit_Member_ammout();
            Thread.sleep(2000);
            hp.setHome_Benefit_Family_Amount();
            Thread.sleep(2000);
            Thread.sleep(2000);
            hp.setSave_Continue_btn();
            Thread.sleep(2000);
            hp.setSave_Continue_btn();
            Thread.sleep(2000);
            hp.setSave_Continue_btn();
            test.pass("The Homeophatic functionality test has passed,The user is able to fill in all fields and move to the next buket");
            Assert.assertTrue(true);
        }catch (Exception e){
            test.fail("Test encountered an exception: " + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    @Test(priority = 2)
    void Benefit_Option_Name_Test(){
        HomePage hp = new HomePage(driver);
        test = extent.createTest("TC5_Epic3 Step 2: Verify functionality for Benefit option name");
        ExtentReportManager.setExtentTest(test);
        try{

            Thread.sleep(2000);
            hp.setFlex_3();
            Thread.sleep(2000);
            hp.Option_Status();
            Thread.sleep(2000);
            hp.setActiveStatus();
            Thread.sleep(2000);
            hp.setContinuation();
            Thread.sleep(2000);
            hp.setEfficiency_Discounted_Option();
            Thread.sleep(2000);
            hp.setFlat_Contribution();
            Thread.sleep(2000);
            setFlatAmounts();
            Thread.sleep(2000);
            hp.setSave_Continue_btn();
            Thread.sleep(2000);
            test.pass("The Benefit option name functionality test has passed, the user is able to choose" +
                    " an benefit option name, perform require tasks then move to the option basket.");
            Assert.assertTrue(true);

        } catch (Exception e) {
            test.fail("Test encountered an exception: " + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    @Test(priority = 1)
    void Data_Officer_login_Test(){
        HomePage hp = new HomePage(driver);
        test = extent.createTest("TC5_Epic3 Step 1: Verify Login functionality for Data Officer");
        ExtentReportManager.setExtentTest(test);

        try {
            test.info("Navigate to Landing page");
            LandingPage lp = new LandingPage(driver);
            test.info("Supply valid credentials");
            Thread.sleep(3000);
            lp.setEmail_txt("Sbun.gift@gmail.com");
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



        }catch (Exception e)
        {
            test.fail("Test encountered an exception: " + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }


}


