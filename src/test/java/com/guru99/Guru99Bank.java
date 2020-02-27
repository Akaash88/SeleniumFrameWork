package com.guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Guru99Bank {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test(dataProvider ="testdataProvider" )
	public void setData(String Uid , String pass) {
		Guru99Bank_Util obj = new Guru99Bank_Util(driver);
		obj.log_in(Uid,pass);
		try {
			Alert alert = driver.switchTo().alert();
			String actualBoxMsg = alert.getText();
			alert.accept();
			Assert.assertEquals(actualBoxMsg,obj.EXPECT_ERROR);
			System.out.println("Invalid userId or Password");
		}
		catch (Exception e){
		String actualTitle = driver.getTitle();
		Assert.assertEquals(obj.expectedTitle,actualTitle);
		boolean verifyUser = driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr241471')]")).isDisplayed();
		obj.captureScreenShot(driver, "verifyUser");
		System.out.println("Manager ID is displayed : " +verifyUser);
		System.out.println("test passed");
		
		}
	}

	
	@DataProvider(name = "testdataProvider")
	public  Object[][] getData() {
		Guru99Bank_Util obj = new Guru99Bank_Util(driver);
		String projectPath = System.getProperty("user.dir");
		String excelPath = projectPath+"/excel/Guru99.xlsx";
		Object data[][] =obj.testData(excelPath,"sheet1");
		return data;
	}
}
