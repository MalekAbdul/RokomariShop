package RokomariPages;

import org.openqa.selenium.By;

import CustomMethods.MyMethods;

public class RokomariSignUpPage extends MyMethods {
	
	public String SIGNIN_PAGE_URL = "https://www.rokomari.com/login";
	public By SIGN_UP_BUTTON = By.xpath("//p[contains(text(),'Sign up')]");
	public By GOOGLE_LINK_BUTTON = By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/button[2]");
	
}
