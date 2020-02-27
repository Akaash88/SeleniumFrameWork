package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_M2 {
	private static WebDriver driver=null;
	public static void main(String[] args) {
		GoogleSearchTest();
			
}
	public static void  GoogleSearchTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		GoogleSearchPageM2 obj = new GoogleSearchPageM2(driver);
		driver.get("http://google.com");
		obj.setTextInSearchBox("abcd");
		obj.clickSearchbutton();
		driver.close();
		System.out.println("Test Completed");
	}
}

