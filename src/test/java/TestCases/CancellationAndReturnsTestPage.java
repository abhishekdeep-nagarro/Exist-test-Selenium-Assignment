package TestCases;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.Test;
import flipkart.Pages.BasePage;
import flipkart.Pages.CancellationAndReturnsPage;
import flipkart.Pages.loginPage;

public class CancellationAndReturnsTestPage extends BasePage {
	@Test
	public void CancellationAndReturns() {
 

		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();

		// Using Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// click on cancel and return page link
		driver.findElement(CancellationAndReturnsPage.CancellationAndReturnsPage_Link).click();
		System.out.println(driver.getTitle());

		// click on view more options page link
		driver.findElement(CancellationAndReturnsPage.view_more_options_link).click();
		System.out.println(driver.getTitle());

		// click on picking process page link
		driver.findElement(CancellationAndReturnsPage.picking_process_question_link).click();
		System.out.println(driver.getTitle());

		// click on yes or no option page link
		driver.findElement(CancellationAndReturnsPage.Yes_or_No_option).click();
		System.out.println(driver.getTitle());

		// click on postal addresh page link
		driver.findElement(CancellationAndReturnsPage.postal_addresh_link).click();
		System.out.println(driver.getTitle());

		// click on cross btn to close the btn
		driver.findElement(CancellationAndReturnsPage.cross_btn).click();

		if (driver.getTitle().contains("cancell & return Page")) {
			System.out.println("Results Matched;Test Case Passed");
		} else {

			System.out.println("Results NotMatched;Test Case Failed");
		}
	}

}
