package TestCases;

import PageObjects.HomePage;
import PageObjects.LandingPage;
import TestBase.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExtentReportManager;

public class TC4_Functional_Test extends BaseClass {

    HomePage hp = new HomePage(driver);
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
    String Maximum_Contribution_Member = "2000";
    String Maximum_Contribution_Adult_Dependent  = "1000";
    String Maximum_Contribution_Child_Dependent = "500";
    String Median_Contribution_Member = "2000";
    String Median_Contribution_Adult_Dependent = "1500";
    String Median_Contribution_Child_Dependent = "1000";
    String Minimum_Contribution_Member = "1000";
    String Minimum_Contribution_Adult_Dependent = "500";
    String Minimum_Contribution_Child_Dependent ="200";
    public void setFlatAmounts(){
        HomePage hp = new HomePage(driver);
        hp.setMember_Risk_Contribution(member_risk_con);
        hp.setAdult_Dependent_Risk_Con(adult_risk_con);
        hp.setChild_Dependent_Risk_Con(child_risk_con);
        hp.setMember_Saving_Con(member_savings_con);
        hp.setAdult_Savings_Con(adult_savings_con);
        hp.setChild_Savings_Con(child_savings_con);
    }
    void setIncomeBandAmounts(){
        HomePage hp = new HomePage(driver);
        hp.setMax_Contribution_Member(Maximum_Contribution_Member);
        hp.setMax_Contribution_Adult(Maximum_Contribution_Adult_Dependent);
        hp.setMax_Contribution_Child(Maximum_Contribution_Child_Dependent);
        hp.setMedian_Contribution_Member(Median_Contribution_Member);
        hp.setMedianContributionAdultDependent(Median_Contribution_Adult_Dependent);
        hp.setMedianContributionChildDependent(Median_Contribution_Child_Dependent);
        hp.setMinContributionMember(Minimum_Contribution_Member);
        hp.setMinContributionAdultDependent(Minimum_Contribution_Adult_Dependent);
        hp.setMinContributionChildDependent(Minimum_Contribution_Child_Dependent);
    }
    void setOptionsStatus() throws InterruptedException {
        HomePage hp = new HomePage(driver);

        Thread.sleep(2000);
        hp.Option_Status();
        Thread.sleep(2000);
        hp.setContinuation();
        Thread.sleep(5000);
        hp.Option_Status();
        Thread.sleep(2000);
        hp.setRestructuring();
    }
    @Test(priority = 1)
    void Classic_Delta_Core_Test(){
        test = extent.createTest("TC4 Functional Test:To Verify Classic Delta Core Option's Functionalities");
        ExtentReportManager.setExtentTest(test);

        try{
            test.info("Navigate to landing page to login");
            LandingPage lp= new LandingPage(driver);
            test.info("Supply valid credentials");

            lp.setEmail_txt("lovebright@fluidintellect.com");
            lp.setPassword_txt("2025Fluid@");
            lp.setSign_In_Btn();
            Thread.sleep(2000);

            HomePage hp = new HomePage(driver);
            test.info("Click Classic Delta Core option to Test all the functionalities");
            Thread.sleep(2000);
           // hp.setClassic_Delta_Core();
            Thread.sleep(2000);
            hp.Option_Status();
            test.info("Systematically select each option status individually to verify the functionality.");
            setOptionsStatus();
            test.info("Systematically choose a contribution type");
            hp.setFlat_Contribution();
            test.info("Systematically populate the contribution amounts individually to validate the functionality.");

            Thread.sleep(2000);
            setFlatAmounts();

            Thread.sleep(2000);
            hp.setIncome_Band_Contribution();
            Thread.sleep(5000);
            test.info("Systematically populate the contribution amounts individually to validate the functionality.");
            setIncomeBandAmounts();
            Thread.sleep(3000);


        }catch (Exception e){
            test.fail("Test encountered an exception: " + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    }



