package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingFileUsingPrintWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
File f=new File("C:\\Users\\DELL\\Desktop\\TextFile\\","abc.txt");
		
		FileWriter fw=new FileWriter(f);
		
		PrintWriter pw=new PrintWriter(fw);
		
		pw.println("hello");
		
		pw.println("i am writing a new line");
		
		pw.println(123445);
		
		pw.flush();
		pw.close();

	}

}
