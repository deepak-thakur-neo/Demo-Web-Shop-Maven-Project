package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleComputerPagePOM {
	@FindBy(xpath = "//label[text()='Slow ']")
	private WebElement slowProcessor;
	
	@FindBy(xpath = "//label[text()='4 GB [+20.00]']")
	private WebElement ram4GB;
	
	@FindBy(xpath = "//label[normalize-space()='400 GB [+100.00]']")
	private WebElement storage400GB;
	
	@FindBy(xpath = "//label[normalize-space()='Office Suite']")
	private WebElement softwareOfficeSuite;
	
	@FindBy(xpath = "//input[@id='addtocart_75_EnteredQuantity']")
	private WebElement quantity;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button-75']")
	private WebElement addToCartButton;
	
	public SimpleComputerPagePOM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public WebElement getSlowProcessor() {
		return slowProcessor;
	}

	public WebElement getRam4GB() {
		return ram4GB;
	}

	public WebElement getStorage400GB() {
		return storage400GB;
	}

	public WebElement getSoftwareOfficeSuite() {
		return softwareOfficeSuite;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	
}
