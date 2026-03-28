package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerDesktopPagePOM {
	@FindBy(xpath = "//select[@id='products-orderby']")
	private WebElement sortBy;
	
	@FindBy(xpath = "//select[@id='products-pagesize']")
	private WebElement displayPerPage;
	
	@FindBy(xpath = "//select[@id='products-viewmode']")
	private WebElement viewAs;
	
	@FindBy(partialLinkText = "Under")
	private WebElement priceUnder1000;
	
	@FindBy(partialLinkText = "-")
	private WebElement priceBetween1000And1200;
	
	@FindBy(partialLinkText = "Over")
	private WebElement priceAbove2000;
	
	@FindBy(partialLinkText = "Simple Computer")
	private WebElement simpleComputer;
	
	public ComputerDesktopPagePOM(WebDriver driver) {
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

	public WebElement getPriceUnder1000() {
		return priceUnder1000;
	}

	public WebElement getPriceBetween1000And1200() {
		return priceBetween1000And1200;
	}

	public WebElement getPriceAbove2000() {
		return priceAbove2000;
	}

	public WebElement getSimpleComputer() {
		return simpleComputer;
	}
	
}
