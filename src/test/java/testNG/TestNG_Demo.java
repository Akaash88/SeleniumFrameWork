package testNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class TestNG_Demo {
	WebDriver driver;
	@BeforeSuite
	public void set_up() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority = 1)
	public void testing() {
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("testNG");
	}
	@AfterSuite
	public void closing() {
		driver.close();
		driver.quit();
		System.out.println("Test completed");
	}

}


