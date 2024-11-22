package Day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynammicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/testData/myFileDynamic.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many rows?");
		int totalRows = sc.nextInt();
		
		System.out.println("Enter how many cells?");
		int totalCells = sc.nextInt();
		
		for(int i=0;i<=totalRows;i++) {
			
			XSSFRow currentRow = sheet.createRow(i);
			
			for(int j= 0;j<totalCells;j++) {
				
				XSSFCell currentCell = currentRow.createCell(j);
				currentCell.setCellValue(sc.next());
			}
		}
		workbook.write(file);//attach workbook to the file
		workbook.close();
		file.close();
		
		System.out.println("File is creataed.....");
		
	}

}
