package TestBase;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.ExtentReportManager;

import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;
    protected static WebDriverWait wait;
    protected static ExtentReports extent;
    protected static ExtentTest test;



    @BeforeClass
    public void setupdriver(){
        driver = new ChromeDriver();
        driver.get("https://cms-frontend-dev.ashywater-c985e63f.southafricanorth.azurecontainerapps.io/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        extent = ExtentReportManager.getExtentReports();



    }

    @AfterClass
    public void teardownd(){

        if (driver != null) {
            driver.quit();
        }
        extent.flush(); // Generate the report after all tests
    }

    // Wait for an alert to appear and return it
    public Alert waitForAlert() {
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            return driver.switchTo().alert();
        } catch (Exception e) {
            return null;  // Return null if no alert appears
        }
    }

}

