package TestCases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import flipkart.Pages.BasePage;
import flipkart.Pages.TravelViewPage;
import flipkart.Pages.loginPage;

public class TravelViewTestPage extends BasePage {
	@SuppressWarnings("deprecation")
	@Test
	public void Travel() throws Exception { 
	 
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
	 
        // click on travel link page
        driver.findElement(TravelViewPage.travel_link ).click();
        System.out.println(driver.getTitle());
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Enter the departure details
        driver.findElement(TravelViewPage.from_search_link).sendKeys("New delhi, DEL - Indira Gandhi Airport, India");
        System.out.println(driver.getTitle());
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Enter the arrival details
        driver.findElement(TravelViewPage.To_search_link ).sendKeys("Singapore, SIN - Changi Singapore");
        
        
        // click on search link
        driver.findElement(TravelViewPage.search_link).click();
        
         
        }
	}



