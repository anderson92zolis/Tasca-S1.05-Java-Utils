package n1exercici4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LlegirFitxerTXT {
	
	public static void importOrdenaArrayList(File fileLocation) throws IOException{	
		
		Scanner myReader = null;
	
		try {
			myReader = new Scanner(fileLocation);
			while (myReader.hasNextLine()) {
				System.out.println(myReader.nextLine());
			}		      
	    	} catch (FileNotFoundException e) {
	    		System.out.println("An error occurred.");
	    		e.printStackTrace();
	    	} finally { 
	    		myReader.close();       // important to know .close()
	    	}
	}

}
