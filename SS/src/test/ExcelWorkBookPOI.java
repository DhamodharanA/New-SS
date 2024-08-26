package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWorkBookPOI {
	static List<String> userNameList = new ArrayList<String>();
	static List<String> passwordList = new ArrayList<String>();
	  
	public void readExcel() throws IOException {
		FileInputStream excel = new FileInputStream("C:\\Users\\daran\\OneDrive\\Documents\\User Cre.xlsx");
		Workbook workbook = new XSSFWorkbook(excel);
		Sheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowIterator = sheet.iterator();
		
		while (rowIterator.hasNext()) {
			Row rowValue = rowIterator.next();
		
		
		Iterator<org.apache.poi.ss.usermodel.Cell>  coloumnIterator=rowValue.iterator();
		int i=2;
			while(coloumnIterator.hasNext()) {
				if(i%2==0) {
					userNameList.add(coloumnIterator.next().getStringCellValue());
				}else {
					passwordList.add(coloumnIterator.next().getStringCellValue());
				}
				i++;
			}
		
		}
	
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExcelWorkBookPOI usingPOI = new ExcelWorkBookPOI();
			usingPOI.readExcel();
			System.out.println("UserNameList"+ userNameList);
			System.out.println("UserNameList"+ passwordList);
			
}
}