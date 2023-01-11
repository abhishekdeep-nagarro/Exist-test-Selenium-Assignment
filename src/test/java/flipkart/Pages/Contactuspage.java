package flipkart.Pages;

import org.openqa.selenium.By;

public class Contactuspage {
	public static By contact_us_link = By.xpath("//a[contains(text(),'Contact Us')]");
    public static By track_order_link = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]");
    public static By track_flipkart_order_link = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]");
    public static By go_to_my_order_link = By.xpath("//a[contains(text(),'My Orders')]");
    
}
