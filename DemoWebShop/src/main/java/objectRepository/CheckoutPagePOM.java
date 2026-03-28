package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPagePOM {
	@FindBy(id="billing-address-select")
	private WebElement existingtonewbillingaddress;
	
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement billingcountrydd;
	
	@FindBy (id = "BillingNewAddress_StateProvinceId")
	private WebElement billingstatedd;
	
	@FindBy (id = "BillingNewAddress_City")
	private WebElement billingcitytxtfield;
	
	@FindBy (id = "BillingNewAddress_Address1")
	private WebElement billingaddresstxtfield;
	
	@FindBy (id = "BillingNewAddress_ZipPostalCode")
	private WebElement billingzipcodetxtfield;
	
	@FindBy (id = "BillingNewAddress_PhoneNumber")
	private WebElement billingphonenotxtfield;
	
	@FindBy (xpath = "(//input[@value='Continue'])[1]")
	private WebElement billingcontinue;
	
	@FindBy (id ="PickUpInStore")
	private WebElement pickupcheckup;
	
	@FindBy (xpath = "(//input[@value='Continue'])[2]")
	private WebElement shippingaddresscontinue;
	
	@FindBy (xpath =  "(//input[@value='Continue'])[4]")
	private WebElement paymentmethodcontinue;
	
	@FindBy (xpath = "(//input[@value='Continue'])[5]")
	private WebElement paymentinfo;
	
	@FindBy (xpath = "//h2[text()='Confirm order']")
	private WebElement confirmorderele;
	
	@FindBy (xpath = "(//input[@value='Confirm'])")
	private WebElement confirmorder;
	
	public CheckoutPagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBillingcountrydd() {
		return billingcountrydd;
	}

	public WebElement getBillingstatedd() {
		return billingstatedd;
	}

	public WebElement getBillingcitytxtfield() {
		return billingcitytxtfield;
	}

	public WebElement getBillingaddresstxtfield() {
		return billingaddresstxtfield;
	}

	public WebElement getBillingzipcodetxtfield() {
		return billingzipcodetxtfield;
	}

	public WebElement getBillingphonenotxtfield() {
		return billingphonenotxtfield;
	}

	public WebElement getBillingcontinue() {
		return billingcontinue;
	}

	public WebElement getPickupcheckup() {
		return pickupcheckup;
	}

	public WebElement getPaymentmethodcontinue() {
		return paymentmethodcontinue;
	}

	public WebElement getPaymentinfo() {
		return paymentinfo;
	}

	public WebElement getConfirmorder() {
		return confirmorder;
	}

	public WebElement getConfirmorderele() {
		return confirmorderele;
	}

	public WebElement getShippingaddresscontinue() {
		return shippingaddresscontinue;
	}

	public WebElement getExistingtonewbillingaddress() {
		return existingtonewbillingaddress;
	}
	
	
}
