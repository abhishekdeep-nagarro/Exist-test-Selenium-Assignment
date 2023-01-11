package flipkart.Pages;

import org.openqa.selenium.By;

public class GroceryPage {
	public static By grocery_link = By.xpath("//div[contains(text(),'Grocery')]");
	public static By search_box = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]");
    public static By search_link = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]");
}
