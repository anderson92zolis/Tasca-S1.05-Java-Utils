package n1exercici4;
import java.io.File;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileNotFoundException;  // Import this class to handle errors

public class contengutDirAL {
   /*
    Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.
    */
	
	private String directori;
	
	public   contengutDirAL(String directori) {
		this.directori=directori;
	}	
	
	public ArrayList<String> importOrdenaArrayList(){
		
	ArrayList<String> sortArrayList = new ArrayList<String>();
		try {
	      File myObj = new File(directori);
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        String[] nombre_archivos = data.split(" ");
	        for (String word:nombre_archivos) {
	        	sortArrayList.add(word); 
	        	}
	      }		      
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
		
		Collections.sort(sortArrayList);
		System.out.println("mi ArrayList: "+sortArrayList);
	return sortArrayList;
	}
}	
