package Module1;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.FileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.CheckoutPagePOM;
import objectRepository.ComputerDesktopPagePOM;
import objectRepository.ComputersPagePOM;
import objectRepository.GiftCardPagePOM;
import objectRepository.HomePagePOM;
import objectRepository.ShopingCartPagePOM;
import objectRepository.SimpleComputerPagePOM;

public class TC02Test extends BaseClass {
	@Test
	public void verifyVariousCategoriesIteminCartandCheckout() throws IOException, InterruptedException {
	HomePagePOM hp = new HomePagePOM(driver);
	ComputersPagePOM cp = new ComputersPagePOM(driver);
	ComputerDesktopPagePOM cdp = new ComputerDesktopPagePOM(driver);
	SimpleComputerPagePOM scp = new SimpleComputerPagePOM(driver);
	ShopingCartPagePOM sc = new ShopingCartPagePOM(driver);
	GiftCardPagePOM gcp = new GiftCardPagePOM(driver);
	WebDriverUtility wdu = new WebDriverUtility();
	ExcelUtility eu = new ExcelUtility();
	CheckoutPagePOM cpp = new CheckoutPagePOM(driver);
	
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
	
	hp.getGiftCardsLink().click();
	gcp.getGiftCard50().click();
	Thread.sleep(3000);
	gcp.getRecipientNameTextField().sendKeys("Derek Tucker");
	gcp.getAddToCardButton().click();
	Thread.sleep(2000);
	driver.findElement(By.className("close")).click(); //
	Thread.sleep(1000);
	
	hp.getShopingcart().click();
	assertTrue(sc.getProductInCart().isDisplayed(),"Item not present in Cart");
	wdu.getPhoto(driver);
	
	wdu.scrollIntoView(driver, sc.getCheckout());
	
	wdu.selectDropdown(eu.getStringDataFromExcel("Sheet1", 1, 0), sc.getCountrydd());
	Thread.sleep(2000);
	wdu.selectDropdown(eu.getStringDataFromExcel("Sheet1", 1, 1), sc.getStatedd());
	sc.getTos().click();
	sc.getCheckout().click();
	
	Thread.sleep(3000);
	
	if(!sc.getBillingaddressdd().isEmpty()) {
		cpp.getBillingcontinue().click();
	}else {
		wdu.selectDropdown("New Address", cpp.getExistingtonewbillingaddress());
		wdu.selectDropdown(eu.getStringDataFromExcel("Sheet1", 1, 0), cpp.getBillingcountrydd());
		wdu.selectDropdown(eu.getStringDataFromExcel("Sheet1", 1, 1), cpp.getBillingstatedd());
		cpp.getBillingcitytxtfield().sendKeys(eu.getStringDataFromExcel("Sheet1", 1, 2));
		cpp.getBillingaddresstxtfield().sendKeys(eu.getStringDataFromExcel("Sheet1", 1, 3));
		cpp.getBillingzipcodetxtfield().sendKeys(eu.getStringDataFromExcel("Sheet1", 1, 4));
		cpp.getBillingphonenotxtfield().sendKeys(eu.getStringDataFromExcel("Sheet1", 1, 5));
	}
	
	cpp.getBillingcontinue().click();
	Thread.sleep(3000);
	cpp.getPickupcheckup().click();
	cpp.getShippingaddresscontinue().click();
	Thread.sleep(3000);
	cpp.getPaymentmethodcontinue().click();
	Thread.sleep(3000);
	cpp.getPaymentinfo().click();
	Thread.sleep(3000);
	
	WebElement elem = cpp.getConfirmorderele();
	wdu.scrollIntoView(driver, elem);
	wdu.getPhoto(driver);
	
	
	}
}
