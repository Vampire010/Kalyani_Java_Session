package Exception_Handling_Ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex2 {

	// declareing the type of exception
	public static void findFile() throws FileNotFoundException 
	{
		// code that may generate IOException
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
	
	}
	public static void main(String[] args) throws FileNotFoundException 
	{
		findFile();
	}

}
