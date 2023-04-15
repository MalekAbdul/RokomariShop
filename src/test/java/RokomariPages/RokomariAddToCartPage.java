package RokomariPages;

import org.openqa.selenium.By;
import CustomMethods.MyMethods;

public class RokomariAddToCartPage extends MyMethods{
	public String cart_url = "https://www.rokomari.com/book/1333/amader-shada-bari";

	public By ADD_TOCART_BUTTON = By.xpath("(//span[@id='js--add-to-cart-button'])[2]");
}
