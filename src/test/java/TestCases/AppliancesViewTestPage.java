package TestCases;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import flipkart.Pages.AppliancesViewPage;
import flipkart.Pages.BasePage;
import flipkart.Pages.loginPage;

public class AppliancesViewTestPage extends BasePage {
	@Test
	public void applliances(){
 
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		
        // Using Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // search the product
        driver.findElement(AppliancesViewPage.applience).click();
     
        System.out.println(driver.getTitle());

        driver.findElement(AppliancesViewPage.search_Box).sendKeys("TVs" + Keys.ENTER);
      
        // Get Product Name
        String ProductName = driver.findElement(AppliancesViewPage.productname).getText();
        System.out.println(ProductName);

        // Verify that correct Product is displaying after search
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle().substring(0, 18), "Tvs And Appliances");


        if (driver.getTitle().contains("Tvs")) {
            System.out.println("Results Matched;Test Case Passed");
        } else {
             
            System.out.println("Results NotMatched;Test Case Failed");
        }
   }

}
