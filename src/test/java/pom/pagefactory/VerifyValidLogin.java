package pom.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import library.Browser;



public class VerifyValidLogin 
{


@Test
public void checkValidUser()
{

// This will launch browser and specific url 
WebDriver driver = Browser.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");

// Created Page Object using Page Factory
LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);

// Call the method
login_page.login_wordpress("admin", "demo123");

}



}