package flipkart.Pages;

import org.openqa.selenium.By;

public class TravelViewPage {
	public static By travel_link = By.xpath("//div[contains(text(),'Travel')]");
	public static By from_search_link = By.xpath("//*[@name='0-departcity']");
	public static By To_search_link = By.xpath("//*[@name='0-arrivalcity']");
	public static By search_link = By.xpath("//span[contains(text(),'SEARCH')]");
}
