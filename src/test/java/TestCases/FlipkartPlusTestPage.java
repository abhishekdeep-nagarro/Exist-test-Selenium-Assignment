package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import flipkart.Pages.BasePage;
import flipkart.Pages.FlipkartPlusPage;
import flipkart.Pages.loginPage;

public class FlipkartPlusTestPage extends BasePage {
	@SuppressWarnings("deprecation")
	@Test
	public void flipkartplus() {
		
	 

		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        // click on flipkartplus option link
        driver.findElement(FlipkartPlusPage.flipkartplus_link ).click();
        
        // To get the Tittle of the page 
        System.out.println(driver.getTitle());
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Go to reward store page
        driver.findElement(FlipkartPlusPage.reward_store_link ).click();
        // To get the Tittle of the page 
        System.out.println(driver.getTitle());
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Go to flipkart plus viewaal option
        driver.findElement(FlipkartPlusPage.viewcoin_activities ).click();
      
	}

}
