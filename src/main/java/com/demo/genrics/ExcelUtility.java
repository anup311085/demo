package com.demo.genrics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	String value;
	FileInputStream fis = null;
	Workbook wb = null;

	public Object[][] getTestData(String Excelfilepath, String sheetname) {
		try {
			fis = new FileInputStream(new File(Excelfilepath));
			wb = WorkbookFactory.create(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetname);
		int rowcount = sh.getLastRowNum();
		Object[][] data = new Object[rowcount][sh.getRow(0).getLastCellNum()];
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++) {
				data[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
}
