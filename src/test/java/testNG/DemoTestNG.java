package testNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG {
       public WebDriver driver = new ChromeDriver();
       String appUrl = "https://opensource-demo.orangehrmlive.com/";

@Test
public void websiteLogin() {
             // launch the firefox browser and open the application url
              driver.get(appUrl);
             
// maximize the browser window
              driver.manage().window().maximize();
             
// declare and initialize the variable to store the expected title of the webpage.
              String expectedTitle = "OrangeHRM";
             
// fetch the title of the web page and save it into a string variable
              String actualTitle = driver.getTitle();
              Assert.assertEquals(expectedTitle,actualTitle);
             
// enter a valid username in the email textbox
              WebElement username = driver.findElement(By.id("txtUsername"));
              username.clear();
              username.sendKeys("Admin");

// enter a valid password in the password textbox
              WebElement password = driver.findElement(By.id("txtPassword"));
              password.clear();
              password.sendKeys("admin123");
             
// click on the Sign in button
              WebElement loginButton = driver.findElement(By.id("btnLogin"));
              loginButton.click();
             
// close the web browser
              //driver.close();
}
} 