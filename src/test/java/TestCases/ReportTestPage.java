package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import flipkart.Pages.BasePage;
import flipkart.Pages.ReportViewPage;
import flipkart.Pages.loginPage;

public class ReportTestPage extends BasePage {
	@SuppressWarnings("deprecation")
	@Test
	public void reportpage() {
		// For closing the login Banner
				driver.findElement(loginPage.cross_btn).click();
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        
		        // click on travel link page
		        driver.findElement(ReportViewPage.reportpage_link ).click();
		        System.out.println(driver.getTitle());
		        
		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        driver.findElement(ReportViewPage.cross_btn ).click();
		        System.out.println(driver.getTitle());
		        
		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        driver.findElement(ReportViewPage.fee_struckture_link).click();
		        System.out.println(driver.getTitle());
		        
		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        driver.findElement(ReportViewPage.resources_link).click();
		     // close the driver
				driver.close();
		        
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void reportpage1() {
		// For closing the login Banner
				driver.findElement(loginPage.cross_btn).click();
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        
		        // click on travel link page
		        driver.findElement(ReportViewPage.reportpage_link ).click();
		        System.out.println(driver.getTitle());
		        
		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        driver.findElement(ReportViewPage.cross_btn ).click();
		        System.out.println(driver.getTitle());
		        
		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        driver.findElement(ReportViewPage.services_link).click();
		        System.out.println(driver.getTitle());
		        
		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        driver.findElement(ReportViewPage.shopsy_link).click();
		     // close the driver
				driver.close();
	}
}
