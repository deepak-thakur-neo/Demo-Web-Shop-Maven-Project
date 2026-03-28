package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
	@FindBy(name = "Email")
	private WebElement emailField;
	
	@FindBy(name = "Password")
	private WebElement passField;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement loginButton;
	
	public LoginPagePOM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPassField() {
		return passField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
