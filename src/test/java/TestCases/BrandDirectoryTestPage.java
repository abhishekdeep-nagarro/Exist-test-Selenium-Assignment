package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import flipkart.Pages.BasePage;
import flipkart.Pages.BrandDirectoryPage;
import flipkart.Pages.loginPage;

public class BrandDirectoryTestPage extends BasePage {
	@SuppressWarnings("deprecation")
	@Test(priority=1)
	public void brandirectorymethod1() {
	 
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        // click on brandpage link
        driver.findElement(BrandDirectoryPage.branddirectorypapge_link).click();
        System.out.println(driver.getTitle());
        
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // search for iphone products
        driver.findElement(BrandDirectoryPage.search_bar).sendKeys("iphone");
        
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //  click on search option 
        driver.findElement(BrandDirectoryPage.searchLink).click();
        
        // close the windows
        driver.close();
        
	}
	@Test(priority=2)
	@SuppressWarnings("deprecation")
	public void brandirectorymethod2() {
		 
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        // click on brandpage link
        driver.findElement(BrandDirectoryPage.branddirectorypapge_link).click();
        System.out.println(driver.getTitle());
        
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // search for iphone products
        driver.findElement(BrandDirectoryPage.search_bar).sendKeys("TV");
        
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //  click on search option 
        driver.findElement(BrandDirectoryPage.searchLink).click();
        
        // close the windows
        driver.close();
        
	}
	@Test(priority=3)
	@SuppressWarnings("deprecation")
	public void brandirectorymethod3() {
		 
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        // click on brandpage link
        driver.findElement(BrandDirectoryPage.branddirectorypapge_link).click();
        System.out.println(driver.getTitle());
        
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // search for iphone products
        driver.findElement(BrandDirectoryPage.search_bar).sendKeys("Appliances");
        
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //  click on search option 
        driver.findElement(BrandDirectoryPage.searchLink).click();
        
        // close the windows
        driver.close();
        
	}
	@Test(priority=4)
	@SuppressWarnings("deprecation")
	public void brandirectorymethod4() {
		 
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        // click on brandpage link
        driver.findElement(BrandDirectoryPage.branddirectorypapge_link).click();
        System.out.println(driver.getTitle());
        
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // search for iphone products
        driver.findElement(BrandDirectoryPage.search_bar).sendKeys("Google pixel");
        
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //  click on search option 
        driver.findElement(BrandDirectoryPage.searchLink).click();
        
        // close the windows
        driver.close();
        
	}

}
