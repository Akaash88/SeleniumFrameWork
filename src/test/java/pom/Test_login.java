package pom;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.GoogleSearchPage;

public class Test_login {
	static WebDriver driver;
	public static void main(String[] args) {
		google_search();
	}
	public static void google_search() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("Webdriver.Chrome.Driver",projectPath+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		GoogleSearchPage.text_box(driver).sendKeys("POM");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test completed");
			
	}
}

