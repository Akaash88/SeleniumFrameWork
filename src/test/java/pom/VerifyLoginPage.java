package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



/**
* @author Mukesh_50
*
*/
public class VerifyLoginPage
{


@Test
public void verifyValidLogin()
{

WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();

driver.get("http://demosite.center/wordpress/wp-login.php");

LoginPage login=new LoginPage(driver);



login.log_in("admin", "pass");


driver.quit();

}


}