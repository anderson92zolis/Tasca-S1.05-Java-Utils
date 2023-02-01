package n1exercici1;

import java.io.File;
import java.util.Arrays;

public class LListeAlfDirectory {
	
	
	public static void ordenaDirectorio(File fileLocation) {
		  
	     try {
	    	 
	      String[] nombresArchivos = fileLocation.list(); // transformamos toda la Array a tipo String
	      Arrays.sort(nombresArchivos); //ordenamos
	      
	      for(String ordenAlfa:nombresArchivos) {
	    	  System.out.println(" nombres de archivos : " + ordenAlfa+"\n");;
	    	  }
	      
	      } catch (Exception e) {
	            e.printStackTrace();
	      }
	} 

}
