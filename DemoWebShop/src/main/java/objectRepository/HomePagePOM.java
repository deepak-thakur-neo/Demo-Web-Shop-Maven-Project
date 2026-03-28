package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM {
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(partialLinkText = "Books")
	private WebElement booksLink;

	@FindBy(partialLinkText = "Computers")
	private WebElement computersLink;

	@FindBy(partialLinkText = "Electronics")
	private WebElement electronicsLink;
	
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftCardsLink;
	
	@FindBy(xpath = "//span[normalize-space()='Shopping cart']")
	private WebElement shopingcart;
	
	
	public HomePagePOM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getShopingcart() {
		return shopingcart;
	}
	
	
}
