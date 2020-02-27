package library;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ScreenShot {

	public static void captureScreenShot(WebDriver driver, String ScreenShotName) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("./ScreenShot/"+ScreenShotName+".png"));
			System.out.println("ScreenShot taken");
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	
}
}
