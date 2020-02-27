import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.google.common.base.Function;

public class Wait1 {

	public static void main(String[] args) {
		Wait1 obj = new Wait1();
		//obj.implicitWait();
		//obj.explicitWait();
		obj.fluentWait();
	}

	public void implicitWait() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
	}
	public void explicitWait() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://google.com");
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable((By.name("q"))));
		element.sendKeys("abcd");
		driver.close();
	}
	public void fluentWait() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("abcd",Keys.RETURN);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);

				WebElement element = wait.until(new Function<WebDriver, WebElement>() {
				  public WebElement apply(WebDriver driver) {
				   WebElement linkElement = driver.findElement(By.linkText("Advisory Board on Cat Diseases (ABCD)"));
				   if (linkElement.isEnabled()) {
					   System.out.println("element found");
				   }
				   return linkElement;
				  }
				});
				element.click();
	}
}

