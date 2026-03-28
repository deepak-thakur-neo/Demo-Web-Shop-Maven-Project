package objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopingCartPagePOM {
	@FindBy (xpath = "//select[@id='CountryId']")
	private WebElement countrydd;
	
	@FindBy (xpath = "//select[@id='StateProvinceId']")
	private WebElement statedd;
	
	@FindBy (id = "termsofservice")
	private WebElement tos;
	
	@FindBy (id = "checkout")
	private WebElement checkout;
	
	@FindBy (xpath="//th[contains(text(),'Product(s)')]")
	private WebElement productInCart;
	
	@FindBy (xpath = "//input[@name='removefromcart']")
	private List<WebElement> removeFromCart;
	
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement updateCart;
	
	@FindBy(id = "billing-address-select")
	private List<WebElement> billingaddressdd;
	
	public ShopingCartPagePOM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public WebElement getCountrydd() {
		return countrydd;
	}

	public WebElement getStatedd() {
		return statedd;
	}

	public WebElement getTos() {
		return tos;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getProductInCart() {
		return productInCart;
	}

	public List<WebElement> getRemoveFromCart() {
		return removeFromCart;
	}

	public WebElement getUpdateCart() {
		return updateCart;
	}

	public List<WebElement> getBillingaddressdd() {
	    return billingaddressdd;
	}
	
	
}
