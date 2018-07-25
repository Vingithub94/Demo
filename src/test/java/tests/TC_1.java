package tests;

import org.testng.annotations.Test;

import POM.EaringsPagePO;
import POM.HomePagePO;
import generics.BaseTest;

public class TC_1 extends BaseTest{

	
	@Test
	public void checkHomePage()
	{
			HomePagePO homePagePO=new HomePagePO(driver);
			EaringsPagePO earingsPagePO=new EaringsPagePO();
			
			
			homePagePO.getEleWishlist().click();
			earingsPagePO.
	}
}
