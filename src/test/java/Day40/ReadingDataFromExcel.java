package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/testData/data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int totalRows = sheet.getLastRowNum();
		
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("number of rows:"+ totalRows); //5,  0 indexed
		System.out.println("number of cells:"+ totalCells);  //4,  1 indexed
		
		//So rows are counting from zero.Cells are counting from one okay.
		for(int i =0;i<=totalRows;i++) {
			
			XSSFRow currentRow = sheet.getRow(i);
			
			for(int j=0; j<totalCells;j++) {
				
				XSSFCell currentCell = currentRow.getCell(j);
				System.out.print(currentCell.toString()+"\t");//tab space
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
