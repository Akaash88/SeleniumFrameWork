package testNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_Demo2 {
	WebDriver driver;
	@BeforeTest
	public void set_up() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void testing() {
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("testNG1");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
	}
	@Test
	public void testing_2() {
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("testNG1");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
	}
	@AfterTest
	public void closing() {
		driver.close();
		driver.quit();
		System.out.println("Test completed");
	}
	
}


