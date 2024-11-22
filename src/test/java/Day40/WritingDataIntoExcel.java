package Day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/testData/myFile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet =workbook.createSheet("data");
		
		XSSFRow row0 = sheet.createRow(0);
		row0.createCell(0).setCellValue(1234);
		row0.createCell(1).setCellValue("java");
		row0.createCell(2).setCellValue("automation");
		row0.createCell(3).setCellValue("testing");
		
		XSSFRow row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue(2345);
		row1.createCell(1).setCellValue("python");
		row1.createCell(2).setCellValue("automation");
		row1.createCell(3).setCellValue("testing");

		XSSFRow row2 = sheet.createRow(2);
		row2.createCell(0).setCellValue(3456);
		row2.createCell(1).setCellValue("javascript");
		row2.createCell(2).setCellValue("automation");
		row2.createCell(3).setCellValue("testing");

		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is creataed.....");
		
	}

}
