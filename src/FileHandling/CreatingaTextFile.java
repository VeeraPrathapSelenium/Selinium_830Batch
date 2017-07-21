package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreatingaTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		File f=new File("C:\\Users\\DELL\\Desktop\\TextFile\\","abc.txt");
		
		//Create a new File
		f.createNewFile();
		
		

	}

}
