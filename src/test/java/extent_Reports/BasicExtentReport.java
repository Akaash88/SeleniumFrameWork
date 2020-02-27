package extent_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BasicExtentReport {
	static WebDriver driver = null;
	public static void main(String[] args) {
		ExtentHtmlReporter htmlReoprter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReoprter);
		
		ExtentTest test1 = extent.createTest("Title for test","Description");
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		test1.log(Status.PASS, "starting TestCase");
		driver.get("https://www.Google.com");
		test1.pass("navigated to Google page");
		driver.findElement(By.name("q")).sendKeys("lets see");
		test1.pass("typed in url box");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		test1.pass("clicked Search button");
		driver.close();
		driver.quit();
		test1.pass("closed Browser");
		test1.info("Test Completed");
		extent.flush();
	}
	
}
