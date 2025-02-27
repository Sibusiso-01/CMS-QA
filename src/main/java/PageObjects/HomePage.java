package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    //
    //********************************************************
    @FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div[1]" +
            "/div/div/div/table/tbody/tr[1]/td[2]/span") WebElement ActiveStatus;
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]" +
            "/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/span[1]") WebElement InactiveStatus;


    //WebElements for all messages displayed
    //*****************************************************
    @FindBy(xpath="//h3[normalize-space()='Hi, Sibusiso Nyundu']")
    WebElement Displayed_Name;
    @FindBy(xpath="//div[@class='text-green-600 text-center text-lg']") WebElement Option_Name_Text;
    @FindBy(xpath="//h1[normalize-space()='DISCOVERY HEALTH MEDICAL SCHEME']") WebElement Medical_Scheme_Txt;
    @FindBy(xpath="//video[normalize-space()='Your browser does not support the video tag.']") WebElement video_element;
    @FindBy(xpath="//button[normalize-space()='LS']") WebElement Data_Officer_Profile;
    @FindBy(xpath="//button[normalize-space()='Logout']") WebElement Sign_Out_Btn;
    @FindBy(xpath="//a[normalize-space()='Profile']") WebElement Profile;
    @FindBy(xpath="//td[@class='py-3 px-6 text-lg text-gray-800 text-end']") WebElement Year;
    @FindBy(xpath="//li[6]") WebElement Custom;
    @FindBy(xpath="//span[normalize-space()='FLEXIFED 3']") WebElement Flexi_Fed;

    //Common xpath for option status
    //***********************************************
    @FindBy(xpath="//td[@class='py-3 px-6 text-sm " +
            "text-gray-800 text-end cursor-pointer flex items-center " +
            "justify-end']//*[name()='svg']") WebElement Option_Status;

    // WebElements for All Options
    //*******************************************************
    @FindBy(xpath="//td[@class='py-3 px-6 text-gray-800 text-start']" +
            "//span[@class='inline-block " +
            "w-4 h-4 rounded-full bg-gray-500']") WebElement Efficiency_Discounted_Option;
    @FindBy(xpath="//input[@name='totalMemberContribution']") WebElement Total_Member_Contribution;
    @FindBy(xpath="//input[@name='totalAdultContribution']") WebElement Total_Adult_Contribution;
    @FindBy(xpath="//input[@name='childTotalContribution']") WebElement Total_Child_Contribution;
    @FindBy(xpath="//input[@name='memberSavingsContribution']") WebElement MemberSavingContribution;

    @FindBy(xpath="//input[@name='adultDependentSavingsContribution']")WebElement AdultSavingContribution;
    @FindBy(xpath="//input[@name='childDependentSavingsContribution']")WebElement ChildSavingContribution;
    //@FindBy(xpath="/html/body/div/div/div/div/main/div/div/div[2]/table/tbody/tr[2]/td[3]/div[2]/svg")WebElement Confinement_drop;



    //????????????
    //******************************************************************************88
    public void setActiveStatus(){ActiveStatus.click();}
    public void setInactiveStatus(){InactiveStatus.click();}
    public void setEfficiency_Discounted_Option(){Efficiency_Discounted_Option.click();}
    public void  setTotal_Member_Contribution(String total){Total_Member_Contribution.sendKeys(total);}
    public void  setTotal_Adult_Contribution(String total){Total_Adult_Contribution.sendKeys(total);}
    public void  setTotal_Child_Contribution(String total){Total_Child_Contribution.sendKeys(total);}
    //WebElements for All Option Statuses
    //********************************************************************8

    @FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div" +
            "[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/span[1]") WebElement restructuring;

    @FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]" +
            "/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/" +
            "tbody[1]/tr[1]/td[2]/span[1]") WebElement Continuation;

    @FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]" +
            "/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]") WebElement Flat_Contribution;
    @FindBy(xpath="//span[@class='inline-block w-4 h-4 rounded-full bg-gray-500']") WebElement Income_Band_Contribution;


    // WebElements for Flat Contribution
    //**************************************************************************************

    @FindBy(xpath="//input[@name='memberRiskContribution']") WebElement Member_Risk_Contribution;
    @FindBy(xpath="//input[@name='adultDependentRiskContribution']") WebElement Adult_Dependent_Risk_Con;
    @FindBy(xpath="//input[@name='childDependentRiskContribution']") WebElement Child_Dependent_Risk_Con;
    @FindBy(xpath="//input[@name='memberSavingsContribution']") WebElement Member_Saving_Con;
    @FindBy(xpath="//input[@name='adultDependentSavingsContribution']") WebElement Adult_Savings_Con;
    @FindBy(xpath="//input[@name='childDependentSavingsContribution']") WebElement Child_Savings_Con;
   // @FindBy(xpath="//button[normalize-space()='Save & Continue']") WebElement Save_Continue_Btn;
   @FindBy(xpath="//button[normalize-space()='Save & Continue']") WebElement Save_Continue_Btn;
    @FindBy(xpath="//img[@alt='CMS Logo']") WebElement CMS_LOGO;


    //WebElements for Income Band Contribution
    //********************************************************************************************
    //*[@id="root"]/div/div/div/main/div/div/div/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/input
    @FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/input") WebElement Max_Contribution_Member;
    @FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div[1]/div/div[3]/table/tbody/tr[2]/td[2]/input") WebElement Max_Contribution_Adult;
    @FindBy(xpath="//input[@name='maxContributionChildDependent']")WebElement Max_Contribution_Child;
    @FindBy(xpath="//input[@name='medianContributionMember']") WebElement Median_Contribution_Member;
    @FindBy(xpath="//input[@name='medianContributionAdultDependent']") WebElement MedianContributionAdultDependent;
    @FindBy(xpath="//input[@name='minContributionAdultDependent']") WebElement minContributionAdultDependent;
    @FindBy(xpath="//input[@name='minContributionChildDependent']") WebElement minContributionChildDependent;
    @FindBy(xpath="//input[@name='minContributionMember']") WebElement minContributionMember;
    @FindBy(xpath="//input[@name='medianContributionChildDependent']") WebElement medianContributionChildDependent;

    //
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]" +
            "/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/input[1]") WebElement Confinement_Check;
    @FindBy(xpath="//tbody/tr[2]/td[3]/div[2]//*[name()='svg']") WebElement Confinement_drop;
    @FindBy(xpath="/html/body/div/div/div/div/main/div/div/div[2]/table/" +
            "tbody/tr[3]/td/div/div[1]/table/tbody/tr[2]/td[1]/input") WebElement BenefitCeiling__Check;
    @FindBy(xpath="/html/body/div/div/div/div/main/div/div/div[2]/table" +
            "/tbody/tr[5]/td/div/div[1]/table/tbody/tr[2]/td[1]/input")WebElement HPV_BenefitCeiling__Check;

    @FindBy(xpath="//tbody/tr[2]/td[4]/div[1]/input[1]")WebElement Benefit_Member_Amount;

    @FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div/div/div[2]/table/tbody/" +
            "tr[3]/td/div/div[1]/table/tbody/tr[2]/td[5]/div/input") WebElement Benefit_Family_Amount;
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/" +
            "div[1]/div[1]/div[2]/table[1]/tbody[1]/" +
            "tr[3]/td[1]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/input[1]") WebElement Co_Payment_Drop;
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]" +
            "/div[2]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[1]" +
            "/tbody[1]/tr[5]/td[4]/div[1]/input[1]") WebElement Co_Payment_Member_Per;
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]" +
            "/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td" +
            "[1]/div[1]/table[1]/tbody[1]/tr[5]/td[5]/div[1]/input[1]") WebElement Co_Payment_Fam_Per;
    @FindBy(xpath="//td[@class='border-b py-2 border-gray-300" +
            " text-gray-600 text-start w-16']//input[@name='service-" +
            "Setting General Hospital-1']") WebElement Setting_General;
    @FindBy(xpath="//td[@class='border-b py-2 border-gray-300 text-gray-600" +
            " text-start w-16']//input[@name='service-Network-0']") WebElement Network;

    @FindBy(xpath="//tbody/tr[4]/td[1]/input[1]")WebElement HPV_Vaccine;
    @FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div/div/div[2]/table/" +
            "tbody/tr[3]/td/div/div[1]/table/tbody/tr[3]/td[1]/input")WebElement Threshold_Check;
    @FindBy(xpath="/html/body/div/div/div/div/main/div/div/div[2]/table/tbody/" +
            "tr[3]/td/div[1]/table/tbody/tr[3]/td[4]/div/input")WebElement Threshold_Member;
    @FindBy(xpath="/html/body/div/div/div/div/main/div/div/div[2]/table/" +
            "tbody/tr[3]/td/div[1]/table/tbody/tr[3]/td[5]/div/input")WebElement Threshold_Fam;
    @FindBy(xpath="//td[@class='border-b py-2 border-gray-300 text-gray-600 text-start w-16']" +
            "//input[@name='service-Setting Specialised Hospital-2']")WebElement Set_Specialised;

//____________________________________________________________
@FindBy(xpath="//tbody/tr[2]/td[4]/div[1]/input[1]") WebElement HPV_Benefit_Member_Amount;
    @FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div/div/div[2]" +
            "/table/tbody/tr[5]/td/div/div[1]/table/tbody/tr[2]/td[5]/div/input")
    WebElement HPV_Benefit_Family_Amount;
    @FindBy(xpath="/html/body/div/div/div/div/main/div/div/div[2]/table/tbody/tr[9]/td[1]/input") WebElement Physiotherapy;
    @FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div/div/div[2]" +
            "/table/tbody/tr[10]/td/div/div[1]/table/tbody/tr[2]/td[1]/input") WebElement Physio_Benefit_Check;
    @FindBy(xpath="/html/body/div/div/div/div/main/" +
            "div/div/div[2]/table/tbody/tr[10]/td/div/div[1]/table/tbody/tr[2]/td[4]/div/input") WebElement Physio_Member_amount;
    @FindBy(xpath="//tbody/tr[2]/td[4]/div[1]/input[1]") WebElement Physio_Family_Amount;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/" +
            "div[2]/table[1]/tbody[1]/tr[4]/td[1]/input[1]")WebElement Homeophatic_check;
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]" +
            "/main[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]" +
            "/tr[5]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]") WebElement Home_Benefit_Check;
    @FindBy(xpath="(//input[@placeholder='0'])[1]") WebElement Home_Benefit_Member_ammout;
    @FindBy(xpath="(//input[@placeholder='0'])[2]")WebElement Home_Benefit_Family_Amount;
    @FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div/" +
            "div/div[2]/table/tbody/tr[10]/td/div/div[1]/table/tbody/tr[4]/td[1]/input")WebElement Above_Thresh_Check;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]" +
            "/div[2]/table[1]/tbody[1]/tr[5]/td[1]/div[1]/table[1]/tbody[1]/tr[4]/td[4]/div[1]/input[1]")WebElement Above_Thresh_Member_Amount;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div" +
            "[2]/table[1]/tbody[1]/tr[5]/td[1]/div[1]/table[1]/tbody[1]/tr[4]/td[5]/div[1]/input[1]")WebElement Above_Thres_Family_Amount;
    @FindBy(xpath="//td[@class='border-b py-2 border-gray-300 text-gray-600 text-start w-16']//" +
            "input[@name='service-Setting Sub Acute Facility-3']")WebElement Setting_Sub_Acute;
    @FindBy(xpath="//span[normalize-space()='FLEXI FED 3 GRID']") WebElement Flex_3;
//__________________________________________________________________
    public void setFlex_3(){Flexi_Fed.click();}
    public void setHomeophatic_check(){Homeophatic_check.click();}
    public void setAbove_Thresh_Check(){Above_Thresh_Check.click();}
    public void setAbove_Thresh_Member_Amount(){Above_Thresh_Member_Amount.sendKeys("150");}
    public void setAbove_Thres_Family_Amount(){Above_Thres_Family_Amount.sendKeys("150");}
    public void setSetting_Sub_Acute(){Setting_Sub_Acute.click();}
    public void setHome_Benefit_Member_ammout(){Home_Benefit_Member_ammout.sendKeys("200");}
    public void setHome_Benefit_Family_Amount(){Home_Benefit_Family_Amount.sendKeys("200");}
    public void setHome_Benefit_Check(){Home_Benefit_Check.click();}
    public void setPhysio_Family_Amount(){Physio_Family_Amount.sendKeys("100");}
    public void setPhysio_Member_amount(){Physio_Member_amount.sendKeys("100");}
    public void setPhysio_Benefit_Check(){Physio_Benefit_Check.click();}
    public void setPhysiotherapy(){Physiotherapy.click();}
    public void setHPV_Benefit_Member_Amount(){HPV_Benefit_Member_Amount.sendKeys("100");}
    public void setHPV_Benefit_Family_Amount(){HPV_Benefit_Family_Amount.sendKeys("100");}

    public void setNetwork(){Network.click();};
    public void setHPV_BenefitCeiling__Check(){HPV_BenefitCeiling__Check.click();}
    public void setSet_Specialised(){Set_Specialised.click();};
    public void setHPV_Vaccine(){HPV_Vaccine.click();}
    public void setThreshold_Check(){Threshold_Check.click();}
    public void setThreshold_Member(){Threshold_Member.sendKeys("100");}
    public void setThreshold_Fam(){Threshold_Fam.sendKeys("100");}
    public void setConfinement_Check(){Confinement_Check.click();}
    public void setConfinement_drop(){Confinement_drop.click();}
    public void setBenefitCeiling__Check(){BenefitCeiling__Check.click();}
    public void setBenefit_Member_Amount(){Benefit_Member_Amount.sendKeys("100");}
    public void setBenefit_Family_Amount(){Benefit_Family_Amount.sendKeys("100");}
    public void setCo_Payment_Drop(){Co_Payment_Drop.click();}
    public void setCo_Payment_Member_Per(){Co_Payment_Member_Per.sendKeys("10");}
    public void setCo_Payment_Fam_Per(){Co_Payment_Fam_Per.sendKeys("5");}
    public void setSetting_General(){Setting_General.click();}
    public void setFlexi_Fed(){Flexi_Fed.click();}

    //*************************************
    public void setCustom(){Custom.click();}
    public void setHome(){CMS_LOGO.click();}
    public  void setSign_up_btn(){Sign_Out_Btn.click();}
    //Verification Methods
    //********************************
    public String setOptionNameText(){
        String actual = Option_Name_Text.getText();
        return actual;
    }
    public String setYear(){
        String actual_year = Year.getText();
        return actual_year;
    }
    public void setData_Officer_Profile(){Data_Officer_Profile.click();}
    public void setProfile(){Profile.click();}
    public String getMessage(){
       String message = Displayed_Name.getText();
        return message;
    }
    public void setSignOut(){Sign_Out_Btn.click();}
    public String getMedical_Scheme(){
        String message= Medical_Scheme_Txt.getText();
        return message;
    }
    public boolean isVideoDisplayed(){

        return video_element.isDisplayed();
    }
    public void clickPayButton(){
        video_element.click();
    }
    public boolean isVideoPlaying(){
        String paused = video_element.getAttribute("paused");
        return paused.equals(false);
    }

    //Methods for all option status
    //***************************************
    public  void setContinuation(){Continuation.click();}

    public void setRestructuring(){restructuring.click();}

    //Methods for all Options
    //********************************
//    public  void setClassic_Delta_Core()
//    {Classic_Delta_Core.click();}
//
//    public void setClassic_Core(){Classic_Core.click();}
//
//    public void setKeyCare_Core() {
//        KeyCare_Core.click();
//    }
//    public void setKeyCare_Start_Edo()
//    {KeyCare_Start_Edo.click();}
   

    //Methods for Income Band Contribution
    //********************************
    public void setIncome_Band_Contribution(){Income_Band_Contribution.click();}
    public void setMax_Contribution_Member(String Amount1){Max_Contribution_Member.sendKeys();}
    public void setMax_Contribution_Adult(String Amount1){Max_Contribution_Adult.sendKeys();}
    public void setMax_Contribution_Child(String Amount1){Max_Contribution_Child.sendKeys();}
    public void setMedian_Contribution_Member(String Amount1){Median_Contribution_Member.sendKeys();}
    public  void setMedianContributionAdultDependent(String Amount1){MedianContributionAdultDependent.sendKeys();}
    public void setMedianContributionChildDependent(String Amount1){medianContributionChildDependent.sendKeys();}
    public void setMinContributionMember(String Amount1){minContributionMember.sendKeys();}
    public void setMinContributionChildDependent(String Amount1){minContributionChildDependent.sendKeys();}
    public void setMinContributionAdultDependent(String Amount1){minContributionAdultDependent.sendKeys();}


    //Methods for flat contribution
    //*********************************************
    public void setFlat_Contribution() {Flat_Contribution.click();}
    public void setMember_Risk_Contribution(String MRC_Amount){
        Member_Risk_Contribution.sendKeys(MRC_Amount);
    }
    public void setAdult_Dependent_Risk_Con(String adult_risk_con){Adult_Dependent_Risk_Con.sendKeys(adult_risk_con);}
    public void setChild_Dependent_Risk_Con(String child_risk_con){Child_Dependent_Risk_Con.sendKeys(child_risk_con);}
    public void setMember_Saving_Con(String member_saving_con){Member_Saving_Con.sendKeys(member_saving_con);}
    public void setAdult_Savings_Con(String adult_saving_con){Adult_Savings_Con.sendKeys(adult_saving_con);}
    public void setChild_Savings_Con(String child_saving_con){Child_Savings_Con.sendKeys(child_saving_con);}

    //Methods for all modules
    //***************************************
    public void Option_Status() {
        Option_Status.click();
    }
    public void setSave_Continue_btn() {
        Save_Continue_Btn.click();
    }





}
