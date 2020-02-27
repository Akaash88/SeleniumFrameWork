import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class WebEleLoc {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Google.com");
		WebElement a= driver.findElement(By.xpath("//input[@name='q']"));
		a.sendKeys("Nithish Gowda");
		System.out.println(a.getLocation().getX());
		System.out.println(a.getLocation().getY());
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
		//WebElement textbox = driver.findElement(By.name("q"));
		//textbox.sendKeys("another way to send keys");
		List<WebElement> x = driver.findElements(By.xpath("//input"));
		int count = x.size();
		System.out.println(count);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
