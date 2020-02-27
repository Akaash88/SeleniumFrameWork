package excel;

import library.ExcelUtil;

public class ReadExcel {

	public static void main(String[] args) {
		ExcelUtil obj = new ExcelUtil("E:\\Software Testing\\Automation\\SeliniumFrameWork\\excel\\Data.xlsx", "Sheet1");
		System.out.println(obj.getData(3, 1));
	}
}
