package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPagePOM {
	
	@FindBy(xpath = "//select[@id='products-orderby']")
	private WebElement sortBy;
	
	@FindBy(xpath = "//select[@id='products-pagesize']")
	private WebElement displayPerPage;
	
	@FindBy(xpath = "//select[@id='products-viewmode']")
	private WebElement viewAs;
	
	@FindBy(xpath = "//a[contains(text(),'Under')]")
	private WebElement priceUnder25;
	
	@FindBy(xpath = "//a[text()='-']")
	private WebElement priceBetween25and50;
	
	@FindBy(xpath = "//a[text()='Over']")
	private WebElement priceAbove50;
	
	@FindBy(xpath = "(//a[text()='Computing and Internet'])[2]")
	private WebElement computingAndInternetBook;
	
	@FindBy(xpath ="(//a[text()='Computing and Internet'])[2]/../..//input[@value='Add to cart']")
	private WebElement computingAndInternetAddToCart;
	
	@FindBy(xpath = "//a[text()='Copy of Computing and Internet EX']")
	private WebElement copyOfComputingAndInternetEXBook;
	
	@FindBy(xpath = "//a[text()='Fiction']")
	private WebElement fictionBook;
	
	@FindBy(xpath = "//a[text()='Fiction']/../..//input[@value='Add to cart']")
	private WebElement fictionAddToCart;
	
	@FindBy(xpath = "//a[text()='Fiction EX']")
	private WebElement fictionEXBook;
	
	@FindBy(xpath = "//a[text()='Health Book']")
	private WebElement healthBook;
	
	@FindBy(xpath = "//a[text()='Health Book']/../..//input[@value='Add to cart']")
	private WebElement healthBookAddToCart;
	
	@FindBy(xpath = "//a[text()='Science']")
	private WebElement ScienceBook;
	
	
	public BooksPagePOM(WebDriver driver) {
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


	public WebElement getPriceUnder25() {
		return priceUnder25;
	}


	public WebElement getPriceBetween25and50() {
		return priceBetween25and50;
	}


	public WebElement getPriceAbove50() {
		return priceAbove50;
	}


	public WebElement getComputingAndInternetBook() {
		return computingAndInternetBook;
	}


	public WebElement getComputingAndInternetAddToCart() {
		return computingAndInternetAddToCart;
	}


	public WebElement getCopyOfComputingAndInternetEXBook() {
		return copyOfComputingAndInternetEXBook;
	}


	public WebElement getFictionBook() {
		return fictionBook;
	}


	public WebElement getFictionAddToCart() {
		return fictionAddToCart;
	}


	public WebElement getFictionEXBook() {
		return fictionEXBook;
	}


	public WebElement getHealthBook() {
		return healthBook;
	}


	public WebElement getHealthBookAddToCart() {
		return healthBookAddToCart;
	}


	public WebElement getScienceBook() {
		return ScienceBook;
	}
	
}
