package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtil {

	//Variables
	
	public static XSSFWorkbook excelWorkbook;
	public static XSSFSheet excelSheet;
	public static XSSFCell excelCell;
	public static XSSFRow excelRow;
	
	//Methods
	
	
	public static void createExcelFile(String path,String sheetName) throws Exception{
			
		FileInputStream fileinput=new FileInputStream(path);
		excelWorkbook=new XSSFWorkbook(fileinput);
		excelSheet=excelWorkbook.getSheet(sheetName);
	}
	
	public static String getCellData(int rowNum,int ColNum){
		
		excelRow=excelSheet.getRow(rowNum);
		excelCell=excelRow.getCell(ColNum);
		return excelCell.getStringCellValue();
				
	}
	
	
}
