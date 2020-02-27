package file.properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import Trial.demo1;

public class Demo1_test {
	private static String browser;
	public static WebDriver driver;
	public static String getBrowser() {
		return browser;
	}
	public static void setBrowser(String browser) {
	Demo1_test.browser = browser;
	}
	
	public static void main(String[] args) {
		demo1.loadF();
		setConfig();
		runTest();
		demo1.writeF();
	}
	public static void setConfig() {

		String projectPath = System.getProperty("user.dir");

		if (getBrowser().contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (getBrowser().contains("firefox")) {
			System.setProperty("webdriver.gecko.driver",projectPath+"/Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	public static void runTest() {
		driver.get("https://www.Google.com");
		driver.close();
	}
	
}

