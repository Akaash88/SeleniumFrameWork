package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageM2 {
	
	WebDriver driver=null;
	
	public GoogleSearchPageM2(WebDriver driver){
		this.driver = driver;
	
	}
	By textbox_search = By.name("q");
	By button_search = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void clickSearchbutton() {
		driver.findElement(button_search).click();
	}
	
}
