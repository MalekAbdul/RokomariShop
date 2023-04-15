package RokomariPages;

import org.openqa.selenium.By;
import CustomMethods.MyMethods;

public class HumayunAhmedBooksPage extends MyMethods {
	
	public String HUMAYUNAHMED_BOOKPAGE_URL = "https://www.rokomari.com/book/author/1/humayun-ahmed?ref=mm_p0";
	
	public By PREVIOUS_PAGE_BUTTON = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[3]/a[2]");
	public By NEXT_PAGE_BUTTON = By.xpath("//a[contains(text(),'Next')]");
	
	public By PAGENO_ONE = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[3]/a[1]");
	public By PAGENO_TWO = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[3]/a[2]");
	public By PAGENO_THREE = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[3]/a[3]");
	public By PAGENO_FOUR = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[3]/a[4]");
	public By PAGENO_FIVE = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[3]/a[5]");
	public By PAGENO_SIX = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[3]/a[6]");
	public By PAGENO_SEVEN = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[3]/a[7]");
	public By PAGENO_EIGHT = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[3]/a[8]");
	public By PAGENO_NINE = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[3]/a[9]");
	
	
	public By SHOP_BY_CATAGORY = By.xpath("//p[contains(text(),'Filter')]");
	public By CATAGORY_SOMOKALIN_UPANNAS = By.xpath("//label[@for=\"rok-filter-categoryIds-677\"]");
	public By CATAGORY_GOLPO_SOMOGRA = By.xpath("//label[contains(text(),'গল্প সমগ্র')]");
	public By CATAGORY_CHITRANATTA = By.xpath("//label[contains(text(),'চিত্রনাট্য')]");
	
	//আমাদের শাদা বাড়ি হুমায়ূন আহমেদ
	public By BOOKNAME_AMADERSADABARI = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[1]");
	//এবং হিমু হুমায়ূন আহমেদ
	public By BOOKNAME_ABONGHIMU = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[2]/div[1]");
	//আয়নাঘর হুমায়ূন আহমেদ
	public By BOOKNAME_AYNAGHOR = By.xpath("//a[contains(@href, '/book/1330/aynaghor')]");
	

}
