package TestCases;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.Test;

import flipkart.Pages.BasePage;
import flipkart.Pages.loginPage;

public class loginTest extends BasePage {
	@Test
	public void login() { 
		
	 
        
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		
		  // Using Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        // click on login btn
		driver.findElement(loginPage.login_btn).click();
		
		// search for mobile number
		driver.findElement(loginPage.enter_mobile_number).sendKeys("9523907624");
		
}
}
