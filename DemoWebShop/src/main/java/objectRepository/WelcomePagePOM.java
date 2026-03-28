package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePagePOM {
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchboxField;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchButton;
	
	public WelcomePagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getSearchboxField() {
		return searchboxField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	
}
