package TestCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import flipkart.Pages.BasePage;
import flipkart.Pages.CareersViewPage;
import flipkart.Pages.loginPage;

public class CareersViewTestPage extends BasePage {
	@Test(priority = 1)
	public void career() {
		
		 // For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		 
		 // Using Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//click on careers page link 
		driver.findElement(CareersViewPage.careers_link).click();
		System.out.println(driver.getTitle());
		
		//click on the about section page link 
		driver.findElement(CareersViewPage.about_section_link).click();
		
		// To get the tittle of the page
		System.out.println(driver.getTitle());
		
		// close the windows
		driver.close();
		
		 
	}
	@Test(priority = 2)
	public void careers() {
		
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
		
		// using wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		// click on carrers page link 
		driver.findElement(CareersViewPage.careers_link).click();
		System.out.println(driver.getTitle());
		
		// click on flipkartread page link btn
		driver.findElement(CareersViewPage.life_at_flipkartread).click();
		System.out.println(driver.getTitle());
		
		// to close the page
		driver.quit();
	}

}
