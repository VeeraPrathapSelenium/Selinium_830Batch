package FileHandling;

import java.io.File;

public class CreateaFolder {

	public static void main(String[] args) {
	
		//Create a new Folder
		
		File f=new File("C:\\Users\\DELL\\Desktop\\","CheckFolder");
		
		f.mkdir();
		
		System.out.println(f.isDirectory());
		
		System.out.println(f.getName());
		
		System.out.println(f.getParent());
		
		
		

	}

}
