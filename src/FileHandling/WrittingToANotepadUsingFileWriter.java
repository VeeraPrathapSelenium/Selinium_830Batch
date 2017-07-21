package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WrittingToANotepadUsingFileWriter{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("C:\\Users\\DELL\\Desktop\\TextFile\\","abc.txt");
		
		FileWriter fw=new FileWriter(f);
		
		fw.write("Hello");
		
		fw.write(1234);
		fw.write("Hello");fw.write("Hello");fw.write("Hello");
		fw.flush();
		
		fw.close();
		
		
		
		
		
		
	}

}
