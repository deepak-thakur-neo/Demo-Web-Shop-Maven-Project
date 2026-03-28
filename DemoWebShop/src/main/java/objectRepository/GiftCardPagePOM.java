package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardPagePOM {
	@FindBy(xpath = "//select[@id='products-orderby']")
	private WebElement sortBy;
	
	@FindBy(xpath = "//select[@id='products-pagesize']")
	private WebElement displayPerPage;
	
	@FindBy(xpath = "//select[@id='products-viewmode']")
	private WebElement viewAs;
	
	@FindBy(xpath = "//a[normalize-space()='$50 Physical Gift Card']/../..//input[@value='Add to cart']")
	private WebElement giftCard50;
	
	@FindBy(xpath = "//input[@id='giftcard_3_RecipientName']")
	private WebElement recipientNameTextField;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button-3']")
	private WebElement addToCardButton;
	
	
	public GiftCardPagePOM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public WebElement getSortBy() {
		return sortBy;
	}

	public WebElement getDisplayPerPage() {
		return displayPerPage;
	}

	public WebElement getViewAs() {
		return viewAs;
	}

	public WebElement getGiftCard50() {
		return giftCard50;
	}

	public WebElement getRecipientNameTextField() {
		return recipientNameTextField;
	}

	public WebElement getAddToCardButton() {
		return addToCardButton;
	}
	
}
