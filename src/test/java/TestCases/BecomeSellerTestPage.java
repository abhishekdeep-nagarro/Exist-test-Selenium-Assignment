package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import flipkart.Pages.BasePage;
import flipkart.Pages.BecomeSellerPage;
import flipkart.Pages.loginPage;

public class BecomeSellerTestPage extends BasePage {
	@SuppressWarnings("deprecation")
	@Test(priority = 1)
	public void Sellerfirstmethod(){  
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // search the product
        driver.findElement(BecomeSellerPage.becomesellerlink).click();
        System.out.println(driver.getTitle());
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(BecomeSellerPage.startsellinglink).sendKeys("9523907624",Keys.ENTER);
 		 
    }
	@Test(priority = 2)
	@SuppressWarnings("deprecation")
	public void Sellersecondmethod(){  
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // search the product
        driver.findElement(BecomeSellerPage.becomesellerlink).click();
        System.out.println(driver.getTitle());
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(BecomeSellerPage.servicesbtn).click();
	}
	@Test(priority = 3)
	@SuppressWarnings("deprecation")
	public void Sellerthirdmethod(){  
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // search the product
        driver.findElement(BecomeSellerPage.becomesellerlink).click();
        System.out.println(driver.getTitle());
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(BecomeSellerPage.resourcesbtn).click();
	
	}	
	
	@Test(priority = 4)
	@SuppressWarnings("deprecation")
	public void Sellerfourthmethod(){  
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // search the product
        driver.findElement(BecomeSellerPage.becomesellerlink).click();
        System.out.println(driver.getTitle());
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(BecomeSellerPage.contactusbtn).click();
	
    }

}
