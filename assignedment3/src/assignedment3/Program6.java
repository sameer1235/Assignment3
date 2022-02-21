package assignedment3;

import java.io.*;

public class Program6 {
	 public static void findFile()  {

	       try {
			File newFile = new File("test.txt");
			FileInputStream stream = new FileInputStream(newFile);
		} catch (Exception e) {
			System.out.println(e);
			//e.printStackTrace();
		}
	  }
	    
	public static void main(String[] args) {
		System.out.println("Print the exception");
	}

}
