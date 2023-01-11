package TestCases;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.Test;
import flipkart.Pages.BasePage;
import flipkart.Pages.Contactuspage;
import flipkart.Pages.loginPage;

public class ContactusTestpage extends BasePage {
	@Test
	
	public void contactus() {
		
	 
        
        
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		
		// using wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		// click on the contact us page link
		driver.findElement(Contactuspage.contact_us_link).click(); 
	    System.out.println(driver.getTitle());
	    
	    // click on track order page link 
	    driver.findElement(Contactuspage.track_order_link).click(); 
	    //click on flipkart order page link
	    driver.findElement(Contactuspage.track_flipkart_order_link).click(); 
	    
	    //click on the go to my order page link
	    driver.findElement(Contactuspage.go_to_my_order_link).click(); 
	    
	}
	 

}
