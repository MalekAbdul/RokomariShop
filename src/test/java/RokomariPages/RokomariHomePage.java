package RokomariPages;

import org.openqa.selenium.By;

import CustomMethods.MyMethods;

public class RokomariHomePage extends MyMethods {

	public String HOMEPAGE_URL = "https://www.rokomari.com/";
	public By SIGN_IN_BUTTON = By.xpath("//a[contains(text(),'Sign in')]");
	public By WRITTER_BUTTON = By.linkText("লেখক");
	public By WRITTER_NAME_HUMAYUN_AHMED = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
	
	public By POPUP_CLOSED = By.xpath("//button[contains(@class, 'popup-modal__close')]");
	
}
