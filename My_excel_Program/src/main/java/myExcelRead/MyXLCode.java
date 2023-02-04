package myExcelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyXLCode {
	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet sh;

	public static String stringDataRead(int row, int col) throws IOException { //to print String value
		f = new FileInputStream("C:\\Users\\dhany\\OneDrive\\Desktop\\Excel01.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(row);
		Cell c = r.getCell(col);
		return c.getStringCellValue();
	}

	public static int integerDataRead(int row, int col) throws IOException
	{
		f = new FileInputStream("C:\\Users\\dhany\\OneDrive\\Desktop\\Excel01.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(row);
		Cell c = r.getCell(col);
		return (int) c.getNumericCellValue();
		
	}

}
