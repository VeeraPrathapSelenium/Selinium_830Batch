package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFileUsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
File f=new File("C:\\Users\\DELL\\Desktop\\TextFile\\","abc.txt");
		
		FileWriter fw=new FileWriter(f);
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hello i am writing through BW");
		bw.newLine();
		bw.write(65);
		
		bw.flush();
		bw.close();
		

	}

}
