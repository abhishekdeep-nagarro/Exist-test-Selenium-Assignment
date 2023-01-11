package TestCases;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import flipkart.Pages.BasePage;
import flipkart.Pages.FlipkartStoriesViewPage;
import flipkart.Pages.loginPage;

public class FlipkartStoriesTestViewPage extends BasePage {
	@SuppressWarnings("deprecation")
	@Test
	 public void Flipkartstories() {
		
		    // For closing the login Banner
			driver.findElement(loginPage.cross_btn).click();
			

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            
	        //click on flipkart stories page link
	        driver.findElement(FlipkartStoriesViewPage.flipkart_stories_link).click();
	     
	        System.out.println(driver.getTitle());
	        

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        // click on new more option page link
	        driver.findElement(FlipkartStoriesViewPage.news_more_option).click();
	        System.out.println(driver.getTitle());
	        

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        //click on coverage page link 
	        driver.findElement(FlipkartStoriesViewPage.coverage_link).click();
	        System.out.println(driver.getTitle());
	        

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        // click on about section page option
	        driver.findElement(FlipkartStoriesViewPage.About_section).click();
	     

	 }
			 

}
