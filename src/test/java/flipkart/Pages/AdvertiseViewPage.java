package flipkart.Pages;

import org.openqa.selenium.By;

public class AdvertiseViewPage {
	public static By advertisepage_link = By.xpath("//span[contains(text(),'Advertise')]");
	public static By search_box_btn = By.xpath("//body/app-root[1]/flipscore-ext[1]/div[1]/div[1]/div[1]/div[3]/search[1]/div[1]/input[1]");
	public static By realme_brand_mobile_link = By.xpath(" //body/app-root[1]/flipscore-ext[1]/div[1]/div[1]/div[1]/div[3]/search[1]/div[1]/div[2]/infinite-scroll[1]/div[1]/div[1]/div[1]/div[1]/brand-desc[1]/div[1]/div[1]/div[2]/div[1]");
	
	/* second test case*/
	
	public static By awareness_know_more_link = By.xpath("//body/app-root[1]/flipscore-ext[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
	public static By aboutus_link = By.xpath("//a[contains(text(),'About Us')]");
	public static By terms_link = By.xpath("//a[contains(text(),'Terms')]");

}
