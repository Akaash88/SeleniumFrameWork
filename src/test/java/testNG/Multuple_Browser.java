package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multuple_Browser {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	@BeforeTest
	@Parameters("browserName")
	public void setUp(String browserName) {
		System.out.println("Browser Name is: "+browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else if (browserName.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver",projectPath+"/Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	@Test
	public void test() {
		driver.get("http://google.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	} 
	
}
