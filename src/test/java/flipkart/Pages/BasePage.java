package flipkart.Pages;

import java.lang.reflect.Method;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import UtilitiesFolder.ExtentManager;
import UtilitiesFolder.ReadingPropertiesFile;
import UtilitiesFolder.ScreenShot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
public static ExtentReports extent;
public static ExtentTest test;
public static String browser = "chrome";
public static WebDriver driver;

 
	@BeforeMethod
	public void setupApplication(Method method) { 
		
		   if(browser.equals("Firefox"))
	        {
	            WebDriverManager.firefoxdriver().setup();

	            // Setting  options to false so it will run without headless mode
	            // If we make it true then it will run the test code in headless mode

	            FirefoxOptions options = new FirefoxOptions();
	      
	            options.setHeadless(false);

	            driver = new FirefoxDriver(options);
	            driver.manage().window().maximize();
	        }
	        else if(browser.equals("chrome")){

	            WebDriverManager.chromedriver().setup();

	            // Setting  options to false so it will run without headless mode
	            // If we make it true then it will run the test code in headless mode

	            ChromeOptions options = new ChromeOptions();
	            options.setHeadless(false);

	 

	            driver = new ChromeDriver(options);
	            driver.manage().window().maximize();

	        }
        
        extent = ExtentManager.getInstance("reports//Extent_demo.html");
        driver.get(ReadingPropertiesFile.getProperty("url"));
        test = extent.startTest(method.getName());
		
	}
	
	/*---------------screenshot-------------- */
	@AfterMethod
	   public void tearDown(ITestResult result)
	    {
	        if(result.getStatus()==ITestResult.SUCCESS)
	            test.log(LogStatus.PASS, "Test case got passed");
	        else if(result.getStatus()==ITestResult.FAILURE)
	        {
                ScreenShot.takeScreenShot(driver, result.getName());
	            test.log(LogStatus.FAIL, "Test case got failed");
	        }
	        extent.flush();
	        driver.quit();
	    }

}
