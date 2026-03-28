package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerUtility extends BaseClass implements ITestListener {


	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test script is pass", true);
	}
	
	@Override 
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test script is failed", true);
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+timestamp+".png");
		try {
			FileHandler.copy(temp,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Override
	public void onTestSkipped (ITestResult result) {
		Reporter.log("Test script is skipped", true);
	}
	
	

}