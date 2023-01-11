package flipkart.Pages;

import org.openqa.selenium.By;

public class BecomeSellerPage {
	public static By becomesellerlink = By.xpath("(//span[contains(text(),'Become a Seller')])[1]");
    public static By startsellinglink = By.xpath("(//input[@placeholder='Enter 10 digit phone number here'])[1]");
    public static By servicesbtn = By.xpath("(//a[contains(text(),'Services')])[2]");
    public static By resourcesbtn = By.xpath("(//a[normalize-space()='Resources'])[2]");
    public static By contactusbtn = By.xpath("(//a[normalize-space()='sell@flipkart.com'])[1]");
}
