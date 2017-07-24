package ReadingAnExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
	
		
		
		XSSFWorkbook wrkbk=new XSSFWorkbook();
		
		XSSFSheet sheet=wrkbk.createSheet("My first excel sheet");
		
		XSSFRow row=sheet.createRow(0);
		
		XSSFCell cell=row.createCell(0);
		
		cell.setCellValue("My Data writing in excel");
		
		File f=new File("C:\\Users\\DELL\\workspace\\830_Batch","Myfirstexl.xlsx");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		wrkbk.write(fos);
		wrkbk.close();
		
		

	}

}
