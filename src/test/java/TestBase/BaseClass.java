package TestBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.ExtentReportManager;

//*********************************

import java.util.Properties;
import java.io.File;

import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;
    protected static WebDriverWait wait;
    protected static ExtentReports extent;
    protected static ExtentTest test;

    @BeforeClass
    public void setupdriver() {
        // Set Chrome options for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Enables headless mode
        options.addArguments("--disable-gpu"); // Required for Windows OS
        options.addArguments("--window-size=1920,1080"); // Set screen size for proper rendering
        options.addArguments("--disable-dev-shm-usage"); // Overcomes limited resources in containers
        options.addArguments("--no-sandbox"); // Bypass OS security model

        driver = new ChromeDriver(options);
        driver.get("https://cms-frontend-qa.ashywater-c985e63f.southafricanorth.azurecontainerapps.io/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        extent = ExtentReportManager.getExtentReports();
    }

    @AfterClass
    public void teardownd() {
        if (driver != null) {
            driver.quit();
        }
        extent.flush(); // Generate the report after all tests

        // Send Email After Test Execution
        sendEmailReport();
    }

    //
    //
    private void sendEmailReport() {
        final String fromEmail = "sbun.gift@gmail.com"; // Sender's email
        final String password = "sibusiso"; // App Password (Enable in Gmail)
        final String toEmail = "sbun.gift@gmail.com"; // Recipient email

        // SMTP Configuration
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP Server
        props.put("mail.smtp.port", "587"); // Port (TLS)
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true"); // TLS Encryption

        // Authenticator for email credentials
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            // Create Email Message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Automation Test Report");
            message.setText("Hi,\n\nPlease find the attached automation test report.\n\nRegards,\nAutomation Team");

            // Attach the Extent Report
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            Multipart multipart = new MimeMultipart();
            messageBodyPart.setText("Test execution completed. Find the attached report.");
            multipart.addBodyPart(messageBodyPart);

            // Attach Report
            MimeBodyPart attachPart = new MimeBodyPart();
            String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
            attachPart.attachFile(new File(reportPath));
            multipart.addBodyPart(attachPart);

            message.setContent(multipart);

            // Send Email
            Transport.send(message);
            System.out.println("✅ Email Sent Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("❌ Failed to send email.");
        }
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
