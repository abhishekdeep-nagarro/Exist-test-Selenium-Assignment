package TestCases;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import flipkart.Pages.BasePage;
import flipkart.Pages.GroceryPage;
import flipkart.Pages.loginPage;

public class GroceryTestPage  extends BasePage {
	@SuppressWarnings("deprecation")
	@Test(priority = 1,groups = "Main")
	public void groceryitems() {
		
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // click on grocery page link
		driver.findElement( GroceryPage.grocery_link).click();
		

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// search for corn 
		driver.findElement( GroceryPage.search_box).sendKeys("corn");
		

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// click on search link
		driver.findElement( GroceryPage.search_link ).click();
		 	

}
	@SuppressWarnings("deprecation")
	@Test(priority = 2,groups = "Sub")
	public void groceryitems2() {
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        // click on grocery page link 
		driver.findElement( GroceryPage.grocery_link).click();
		

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// search for Rice
		driver.findElement( GroceryPage.search_box).sendKeys("Rice");
		

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// click on search link
		driver.findElement( GroceryPage.search_link ).click();
		
		// close the driver
		driver.close();
		 	
}	 	
}
