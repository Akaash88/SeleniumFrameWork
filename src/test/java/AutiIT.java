

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutiIT {

	public static void main(String[] args) throws Exception {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
		Runtime.getRuntime().exec("E:/Software Testing/Automation/SeliniumFrameWorkAutoIT/Demo.exe");
		Thread.sleep(3000);
		driver.close();
	}
}
	