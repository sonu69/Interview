package testNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Utility {
	
	public static void getCell(int rowNum, int colNum) throws IOException {
		
		File fl = new File(System.getProperty("user.dir")+"/DataFiles/TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(fl);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		Row row = sh.getRow(rowNum);
		
		Cell cell = row.getCell(colNum);
		
		CellType ct = cell.getCellType();
		
		Object data;
		
		switch(ct) {
		
		case STRING:
			
		data=cell.getStringCellValue();
		
		case NUMERIC:
			
		data = cell.getNumericCellValue();
		
		case BOOLEAN:
			
		data = cell.getBooleanCellValue();
		
		default:
		
		data=cell.getStringCellValue();
		
		}
		
		System.out.println(data);
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		File fl = new File(System.getProperty("user.dir")+"/DataFiles/TestDatas/TestData.xlsx");

		FileInputStream fis = new FileInputStream(fl);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		int rowLast=sh.getLastRowNum();
		
		int cellLast=sh.getRow(0).getLastCellNum();
		
		System.out.println(rowLast+" ,"+cellLast);
		
	}

}
