package ReadingAnExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("Testdata.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook wrkbk=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wrkbk.getSheet("Testdata");
		
		XSSFRow row=sheet.getRow(1);
		
		XSSFCell cell=row.getCell(0);
		
		System.out.println(cell.getCellTypeEnum());
		
		
		System.out.println(cell.getStringCellValue());
		
		
		int rcnt=sheet.getLastRowNum();
		
		System.out.println("The total row count is "+rcnt);
		
		
		
		//System.out.println("The total col count for row 1 is "+ccnt);
		
		
		for(int r=0;r<=rcnt;r++)
		{
			int ccnt=sheet.getRow(r).getLastCellNum();
			
			
			for(int c=1;c<=ccnt-1;c++)
			{
				String val=sheet.getRow(r).getCell(c).getStringCellValue();
				System.out.println(val);
			}
			
			
		}
		

	}

}
