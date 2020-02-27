package extent_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent_TestNG {
	ExtentReports extent;
	WebDriver driver;
	ExtentTest test1;
	@BeforeSuite
	public void set_up() {
		ExtentHtmlReporter htmlReoprter = new ExtentHtmlReporter("extent_testNG.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReoprter);
	}
	@BeforeTest
	public void opening() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void testing() {
		test1 = extent.createTest("Google Search Test","TestNG");
		driver.get("http://google.com");
		test1.pass("navgating to google.com");
		driver.findElement(By.name("q")).sendKeys("testNG");
		test1.pass("typed in url box");
	}
	@AfterTest
	public void closing() {
		driver.close();
		driver.quit();
		test1.pass("closed Browser");
		test1.info("Test Completed");
	}
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
}

