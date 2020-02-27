





import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenShot {


	WebDriver driver;

	@Test
	public void captureScreenshot() throws Exception
	{


		driver=new ChromeDriver();


		driver.manage().window().maximize();


		driver.get("http://www.facebook.com");


		driver.findElement(By.xpath(".//*[@id='emailasdasdas']")).sendKeys("Learn Automation");


	}






	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus()) {
			library.ScreenShot.captureScreenShot(driver, "loginFacebook");
		}
		driver.close();
	}
}

