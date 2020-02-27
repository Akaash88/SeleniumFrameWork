package practise;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Test1 {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/gp/cart/view.html/ref=nav_cart");
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		action.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Pantry Lists')]")).click();
	}
}
