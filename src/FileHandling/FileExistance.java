package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileExistance {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\DELL\\Desktop\\TextFile\\", "abc.txt");

		// File existance and different possible operation done in testing

		if (f.exists()) {

			System.out.println("File exists");

			System.out.println(f.getName());

			System.out.println(f.getAbsolutePath());

			System.out.println(f.lastModified());

			System.out.println(f.isFile());

			f.delete();

		} else {
			System.out.println("File not exists");

		}

	}

}
