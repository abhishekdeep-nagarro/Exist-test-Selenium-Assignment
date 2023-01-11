package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import flipkart.Pages.AddToCartPage;
import flipkart.Pages.BasePage;
import flipkart.Pages.loginPage;

public class AddToCartTestPage extends BasePage { 
	 @Test(priority=1) 
	 @SuppressWarnings("deprecation")
	public void cartpagemethod1() {
		 
		// For closing the login Banner
			driver.findElement(loginPage.cross_btn).click();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        // click on travel link page
	        driver.findElement(AddToCartPage.cartpagebtn).click();
	        System.out.println(driver.getTitle());
	        
	    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.findElement(AddToCartPage.Termsofusess_plicies).click();
	        driver.close();
	 }
	 
	 @Test(priority=2) 
	 @SuppressWarnings("deprecation")
	public void cartpagemethod2() {
		 
			// For closing the login Banner
				driver.findElement(loginPage.cross_btn).click();
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        // click on travel link page
		        driver.findElement(AddToCartPage.cartpagebtn).click();
		        System.out.println(driver.getTitle());
		        
		    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        driver.findElement(AddToCartPage.securitypolicies).click();
		        driver.close();

    }
	 
	 @Test(priority=3) 
	 @SuppressWarnings("deprecation")
	public void cartpagemethod3() {
		 
			// For closing the login Banner
				driver.findElement(loginPage.cross_btn).click();
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        // click on travel link page
		        driver.findElement(AddToCartPage.cartpagebtn).click();
		        System.out.println(driver.getTitle());
		        
		    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        driver.findElement(AddToCartPage.returnpolicy).click();
		        driver.close();
	 }
	 
	 @Test(priority=4) 
	 @SuppressWarnings("deprecation")
	public void cartpagemethod4() {
		 
			// For closing the login Banner
				driver.findElement(loginPage.cross_btn).click();
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        // click on travel link page
		        driver.findElement(AddToCartPage.cartpagebtn).click();
		        System.out.println(driver.getTitle());
		        
		    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        driver.findElement(AddToCartPage.privacy_policies).click();
		        driver.close();
	 }
}
