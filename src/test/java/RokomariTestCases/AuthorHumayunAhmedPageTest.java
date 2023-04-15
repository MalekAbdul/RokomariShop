package RokomariTestCases;

import org.testng.annotations.Test;
import RokomariPages.HumayunAhmedBooksPage;
import RokomariPages.RokomariAddToCartPage;
import RokomariPages.RokomariHomePage;
import Utilities.BaseDriverSetup;
import java.util.ArrayList;

public class AuthorHumayunAhmedPageTest extends BaseDriverSetup {
	RokomariHomePage rokomariHomePage = new RokomariHomePage();
	HumayunAhmedBooksPage humayunAhmedBooksPage = new HumayunAhmedBooksPage();
	RokomariAddToCartPage rokomariAddToCartPage = new RokomariAddToCartPage();
	
	@Test
	public void rokomariTest()
	{
		goHumayunAhmedBookListTest();
		//filterByCatagoryTest();
		//goNextPageTest();
		//goPreviousPageTest();
		clickOnHumayunAhmedBook();
		rokomariAddToCartPage.switchToNewTab();
		bookAddToCartTest();
	}
	public void goHumayunAhmedBookListTest()
	{
	    getDriver().get(rokomariHomePage.HOMEPAGE_URL);
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}

		rokomariHomePage.closedPopup(rokomariHomePage.POPUP_CLOSED);
		rokomariHomePage.moveOnElement(rokomariHomePage.WRITTER_BUTTON);
	    rokomariHomePage.clickOnElement(rokomariHomePage.WRITTER_NAME_HUMAYUN_AHMED);
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}

	}

	public void filterByCatagoryTest()
	{
		humayunAhmedBooksPage.scrollToElemnt(humayunAhmedBooksPage.SHOP_BY_CATAGORY);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		humayunAhmedBooksPage.clickOnElement(humayunAhmedBooksPage.CATAGORY_SOMOKALIN_UPANNAS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		humayunAhmedBooksPage.scrollToElemnt(humayunAhmedBooksPage.SHOP_BY_CATAGORY);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		humayunAhmedBooksPage.clickOnElement(humayunAhmedBooksPage.CATAGORY_GOLPO_SOMOGRA);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		humayunAhmedBooksPage.scrollToElemnt(humayunAhmedBooksPage.SHOP_BY_CATAGORY);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		humayunAhmedBooksPage.clickOnElement(humayunAhmedBooksPage.CATAGORY_CHITRANATTA);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}
	public void goNextPageTest()
	{

		humayunAhmedBooksPage.scrollToElemnt(humayunAhmedBooksPage.NEXT_PAGE_BUTTON);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
		humayunAhmedBooksPage.clickOnElement(humayunAhmedBooksPage.NEXT_PAGE_BUTTON);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	
	}
	public void goPreviousPageTest()
	{

		humayunAhmedBooksPage.scrollToElemnt(humayunAhmedBooksPage.PREVIOUS_PAGE_BUTTON);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		humayunAhmedBooksPage.clickOnElement(humayunAhmedBooksPage.PREVIOUS_PAGE_BUTTON);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
	}
	@Test
	public void clickOnHumayunAhmedBook()
	{

		humayunAhmedBooksPage.scrollToElemnt(humayunAhmedBooksPage.BOOKNAME_AYNAGHOR);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		humayunAhmedBooksPage.clickOnElement(humayunAhmedBooksPage.BOOKNAME_AYNAGHOR);
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	@Test
	public void bookAddToCartTest()
	{

		rokomariHomePage.closedPopup(rokomariHomePage.POPUP_CLOSED);
		rokomariAddToCartPage.clickOnElement(rokomariAddToCartPage.ADD_TOCART_BUTTON);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
