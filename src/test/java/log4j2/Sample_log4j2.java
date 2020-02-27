package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_log4j2 {
	Logger logger =  LogManager.getLogger(Sample_log4j2.class);
	public static void main(String[] args) {
		Sample_log4j2 obj = new Sample_log4j2();
		//gsearch();
		obj.performSomeTask();
	}
	 static void gsearch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("lets see");
		driver.close();
		driver.quit();
		
	}
	 public void performSomeTask(){
	        logger.debug("This is a debug message");
	        logger.info("This is an info message");
	        logger.warn("This is a warn message");
	        logger.error("This is an error message");
	        logger.fatal("This is a fatal message1");
	        System.out.println("test completed");
	    } 


}
