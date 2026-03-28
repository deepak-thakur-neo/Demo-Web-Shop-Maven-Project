package Module1;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.WebDriverUtility;
import objectRepository.ComputerDesktopPagePOM;
import objectRepository.ComputersPagePOM;
import objectRepository.HomePagePOM;
import objectRepository.ShopingCartPagePOM;
import objectRepository.SimpleComputerPagePOM;

public class TC01Test extends BaseClass{
	@Test
	public void verifyDesktopinCart() throws IOException, InterruptedException {
		HomePagePOM hp = new HomePagePOM(driver);
		ComputersPagePOM cp = new ComputersPagePOM(driver);
		ComputerDesktopPagePOM cdp = new ComputerDesktopPagePOM(driver);
		SimpleComputerPagePOM scp = new SimpleComputerPagePOM(driver);
		ShopingCartPagePOM sc = new ShopingCartPagePOM(driver);
		hp.getComputersLink().click();
		cp.getDesktopsLink().click();
		cdp.getSimpleComputer().click();
		Thread.sleep(3000);
		scp.getRam4GB();scp.getSlowProcessor().click();
		scp.getStorage400GB().click();
		scp.getSoftwareOfficeSuite().click();
		scp.getQuantity().clear();
		scp.getQuantity().sendKeys("3");
		scp.getAddToCartButton().click();	
		Assert.assertTrue(hp.getShopingcart().isDisplayed(),"Cart button is not displayed");
		hp.getShopingcart().click();
		Assert.assertTrue(sc.getProductInCart().isDisplayed(), "Products are not present");
		WebDriverUtility wu = new WebDriverUtility();
		wu.getPhoto(driver);
		
		
		
		
		
	}
}
