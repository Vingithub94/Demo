package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

	public WebDriver driver;
	
	public HomePagePO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='WISHLIST']")
	private WebElement eleWishlist;
	
	public WebElement getEleWishlist()
	{
		
		return eleWishlist;
	}
	
	
	
}
