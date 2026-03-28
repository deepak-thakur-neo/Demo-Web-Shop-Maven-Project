package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}

	public void fullscreen(WebDriver driver) {
		driver.manage().window().fullscreen();
	}
	
	public void implicitWait(WebDriver driver) { // new
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void quit(WebDriver driver) { //new
		driver.quit();
	}

	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void scrollToElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
	public void scrollIntoView(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",element);
	}

	public void scroll(WebDriver driver, int x, int y) {
		Actions act = new Actions(driver);
		act.scrollByAmount(x, y).perform();
	}

	public void selectDropdown(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void selectDropdown(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void selectDropdown(String text, WebElement element) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(WebDriver driver, String namrOrId) {
		driver.switchTo().frame(namrOrId);
	}

	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}

	public void getPhoto(WebDriver driver) throws IOException {
		JavaUtility ju = new JavaUtility();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/" + ju.getSystemTime() + ".png");
		FileHandler.copy(temp, dest);
	}

	public void switchToWindow(WebDriver driver, String actUrl) {
		Set<String> allWindowsIds = driver.getWindowHandles();
		for (String id : allWindowsIds) {
			driver.switchTo().window(id);
			if (driver.getCurrentUrl().contains(actUrl))
				break;
		}
	}

	public void switchToWindow(String expTitle, WebDriver driver) {
		Set<String> allWindowsIds = driver.getWindowHandles();
		for (String id : allWindowsIds) {
			driver.switchTo().window(id);
			if (driver.getTitle().contains(expTitle))
				break;
		}
	}
}
