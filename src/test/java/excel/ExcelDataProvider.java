package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.ExcelUtil;

public class ExcelDataProvider {
	/*public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		String excelPath = projectPath+"/excel/Data.xlsx";
		testData(excelPath,"sheet1");
	} */
	WebDriver driver;
	@BeforeTest
	public void set_up() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider ="test1data" )
	public void test1(String username , String password) throws Exception {
		System.out.println(username +" | " + password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
	}
	@DataProvider(name = "test1data")
	public  Object[][] getData() {
		String projectPath = System.getProperty("user.dir");
		String excelPath = projectPath+"/excel/Data.xlsx";
		Object data[][] = testData(excelPath,"sheet1");
		return data;
	}
	public  Object[][] testData(String excelPath, String sheetName) {
		ExcelUtil excel = new ExcelUtil(excelPath, sheetName);
		int rowcount = excel.getRowCount(); 
		int colcount = excel.getColCount();

		Object data[][] = new Object[rowcount-1][colcount]; //Initializing array size.
		
		for(int i =1;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				String cellData = excel.getData(i, j);
				//System.out.print(cellData +" | " );
				data[i-1][j] = cellData;  //adding data into object array.
			}
			//System.out.println();
		}
		return data;
	}
}