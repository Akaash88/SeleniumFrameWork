import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_Manager {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().version("xx").setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://google.com");
		 
			driver.close();
			driver.quit();
			
	}
}
