package flipkart.Pages;

import org.openqa.selenium.By;

public class ReportViewPage {
	public static By reportpage_link = By.xpath("//a[contains(text(),'Report Infringement')]");
	public static By cross_btn = By.xpath("//div[@id='app']//div//section//header//span//*[name()='svg']");
	public static By fee_struckture_link = By.xpath("//a[normalize-space()='Fee Structure']");
	public static By services_link = By.xpath("(//a[contains(text(),'Services')])[1]");
	public static By resources_link = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]");
	public static By Faq_link = By.xpath("//a[normalize-space()='FAQs']");
	public static By shopsy_link = By.xpath("//a[normalize-space()='Shopsy']");

}
