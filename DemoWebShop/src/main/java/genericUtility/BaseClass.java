package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectRepository.HomePagePOM;
import objectRepository.LoginPagePOM;
import objectRepository.ShopingCartPagePOM;
import objectRepository.WelcomePagePOM;

public class BaseClass {
	public static WebDriver driver;
	FileUtility fu = new FileUtility();
	WebDriverUtility wu = new WebDriverUtility();
	
	
	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		wu.maximize(driver);
		wu.implicitWait(driver);
		driver.get(fu.getDataFromProperty("website"));
	}
	
	@BeforeMethod
	public void login() throws IOException {
		WelcomePagePOM wp = new WelcomePagePOM(driver);
		wp.getLoginLink().click();
		LoginPagePOM lp = new LoginPagePOM(driver);
		lp.getEmailField().sendKeys(fu.getDataFromProperty("username"));
		lp.getPassField().sendKeys(fu.getDataFromProperty("password"));
		lp.getLoginButton().click();
	}
	
	@AfterMethod
	public void logout() {
		HomePagePOM hp = new HomePagePOM(driver);
		ShopingCartPagePOM scpp = new ShopingCartPagePOM(driver);
		if (scpp.getRemoveFromCart().size() > 0) {  // returns 0 after checkout → skips
		    for (WebElement s : scpp.getRemoveFromCart()) {
		        s.click();
		    }
		    scpp.getUpdateCart().click();
		}
		hp.getLogoutLink().click();
	}
	
	@AfterClass
	public void closeBrowser() {
		wu.quit(driver);
	}
	

}
