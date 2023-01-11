package TestCases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import flipkart.Pages.BasePage;
import flipkart.Pages.GiftCardsPage;
import flipkart.Pages.loginPage;

public class GiftCardsTestPage extends BasePage {
	@SuppressWarnings("deprecation")
	@Test(priority=1)
	public void giftcards() {
		 
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // click on gift card btn link
        driver.findElement(GiftCardsPage.gift_card_btn).click();
        System.out.println(driver.getTitle());
        

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // search for digital gift card
        driver.findElement(GiftCardsPage.Buynow_page).click();
        System.out.println(driver.getTitle());
        

	}
	@Test(priority=2)
	@SuppressWarnings("deprecation")
	public void giftcard2Testcase() {
		 
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // click on gift card btn link
        driver.findElement(GiftCardsPage.gift_card_btn).click();
        System.out.println(driver.getTitle());
        

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // search for digital gift card
        driver.findElement(GiftCardsPage.digital_gift_card).click();
        System.out.println(driver.getTitle());
}
	@Test(priority=3)
	@SuppressWarnings("deprecation")
	public void giftcards3Thirdcase() {
		 
		// For closing the login Banner
		driver.findElement(loginPage.cross_btn).click();
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // click on gift card btn link
        driver.findElement(GiftCardsPage.gift_card_btn).click();
        System.out.println(driver.getTitle());
        

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // search for digital gift card
        driver.findElement(GiftCardsPage.flipkartwalletpage).click();
        System.out.println(driver.getTitle());
}
}
