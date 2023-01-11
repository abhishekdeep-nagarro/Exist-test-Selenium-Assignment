package TestCases;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import flipkart.Pages.AdvertiseViewPage;
import flipkart.Pages.BasePage;
import flipkart.Pages.loginPage;

public class AdvertiseTestPage extends BasePage {
	@Test(priority=1)
	public void advertise() {
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		
        // Using Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        // click on advertisepage link btn
        driver.findElement(AdvertiseViewPage.advertisepage_link).click();
     
        // get the tittle of the page
        System.out.println(driver.getTitle());
        
        // click on search box and realme mobile
        driver.findElement(AdvertiseViewPage.search_box_btn).sendKeys("realme" + Keys.ENTER);
      
    
        driver.close();
   
	}
	
	@Test(priority=2)
	public void advertise1() {
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		
        // Using Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.findElement(AdvertiseViewPage.advertisepage_link).click();
     
        System.out.println(driver.getTitle());
        
        // click on awareness know more link  
        driver.findElement(AdvertiseViewPage.awareness_know_more_link).click();
        System.out.println(driver.getTitle());
      
        // click on aboutus link btn
        driver.findElement(AdvertiseViewPage.aboutus_link).click();
   
        //click on terms-option btn
        driver.findElement(AdvertiseViewPage.terms_link).click();
        System.out.println("Completed");
    
	}

}
