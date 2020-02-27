package library;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	  XSSFWorkbook workbook;
	  XSSFSheet sheet;

		public  ExcelUtil(String excelPath,String sheetName) {

			try {
				workbook = new XSSFWorkbook(excelPath);
				sheet = workbook.getSheet(sheetName);
			} catch (Exception e) {
				e.printStackTrace();
			}
}
		public String getData(int row , int column) {
			String data = sheet.getRow(row).getCell(column).toString();
			return data;
		}
		public  int getRowCount() {
			int rowcount = 0;
			try {

				rowcount = sheet.getPhysicalNumberOfRows();
				//System.out.println("number of Row count "+rowcount);
			} catch (Exception e) {

				e.printStackTrace();
			}
			return rowcount;
		}
		public  int getColCount() {
			int colcount = 0;
			try {

				colcount = sheet.getRow(0).getPhysicalNumberOfCells();
				//System.out.println("number of column count "+colcount);
			} catch (Exception e) {

				e.printStackTrace();
			}	
			return colcount;
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
