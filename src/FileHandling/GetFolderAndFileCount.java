package FileHandling;

import java.io.File;

public class GetFolderAndFileCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int filecount=0;
		int folderscount=0;
		
		File f=new File("C:\\Users\\DELL\\Desktop\\","CheckFolder");
		
		
		File[] fls=f.listFiles();
		
		
		for (File file : fls) {
			
			
			if(file.isFile())
			{
				
				filecount++;
				
			}
			else
			{
				folderscount++;
				
			}
			
			
		}
		
		System.out.println("The total FIles Count is "+filecount);
		
		System.out.println("The total FIles Count is "+folderscount);
		
		
		

	}

}
