package n1exercici4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LlegirFitxerTXT {
	
	public static void importOrdenaArrayList(String fileLocation) throws IOException{	
		
		//File myObjFile = null;
		//Scanner myReader = null;
	
		try {
			File myObjFile = new File(fileLocation);
			Scanner myReader = new Scanner(myObjFile);
	      while (myReader.hasNextLine()) {
	    	System.out.println(myReader.nextLine());
	      }		      
	      
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    } finally { 
	    	myReader.close();
	    	}
	}

}
