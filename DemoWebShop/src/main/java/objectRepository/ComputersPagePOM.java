package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPagePOM {
	@FindBy(xpath = "//img[@title='Show products in category Desktops']")
	private WebElement desktopsLink;
	
	@FindBy(xpath = "//img[@title='Show products in category Notebooks']")
	private WebElement notebooksLink;
	
	@FindBy(xpath = "//img[@title='Show products in category Accessories']")
	private WebElement accessoriesLink;
	public ComputersPagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getDesktopsLink() {
		return desktopsLink;
	}
	public WebElement getNotebooksLink() {
		return notebooksLink;
	}
	public WebElement getAccessoriesLink() {
		return accessoriesLink;
	}
	
	
}
