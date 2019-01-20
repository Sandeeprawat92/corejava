package streamFiles.Excelfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriting {

	public static void main(String[] args) throws Throwable {
		XSSFWorkbook workbook = new XSSFWorkbook();

		// The constructor XSSFSheet() is not visible bcoz no sheet is created
		// yet.
		// XSSFSheet sheet = new XSSFSheet();

		XSSFSheet sheet = workbook.createSheet("Myexcel");
		Row row0 = sheet.createRow(0);
		Cell cella = row0.createCell(0);
		Cell cellb = row0.createCell(1);
		cella.setCellValue("Cell one");
		cellb.setCellValue("Cell Two");

		// connecting stream for creating file

		File f = new File("C:\\Users\\lenovo\\Desktop\\jmeter\\myText.xlsx");
		FileOutputStream fos = new FileOutputStream(f);

		// create file
		workbook.write(fos);

		// closing the stream

		fos.close();
		
		System.out.println("Excel file is created");

	}

}
