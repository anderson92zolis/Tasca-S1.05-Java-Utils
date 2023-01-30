package n1exercici1;

import java.io.File;
import java.util.Arrays;

public class  llistiAlfabeticamentContingut {

	public static void main(String[] args) {

		/* Exercici1
	   	* Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.
	    */
		
		String fileLocation= "C:\\Users\\azoli\\eclipse-workspace\\Tasca-S1.05-Java-Utils\\";
		ordenaDirectorio(fileLocation);
	}
	
	public static void ordenaDirectorio(String fileLocation ) {
		  
	     try {
	      File creationFile = new File(fileLocation);
	      String[] nombresArchivos = creationFile.list(); // transformamos toda la Array a tipo String
	      Arrays.sort(nombresArchivos); //ordenamos
	      
	      for(String ordenAlfa:nombresArchivos) {
	    	  System.out.println(" nombres de archivos : " + ordenAlfa+"\n");;
	    	  }
	      
	      } catch (Exception e) {
	            e.printStackTrace();
	      }
	} 	

}