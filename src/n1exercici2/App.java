package n1exercici2;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class App {
	/*
    * Exercici2
   	* Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de 
   	* directoris amb el contingut de tots els seus nivells (recursivament) de manera que 
   	* s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell, indicant a més si és un
   	*  directori (D) o un fitxer (F), i la seva última data de modificació.
    */
	
	public static void main(String[] args) {
		
		//String fileLocation = "C:\\Users\\azoli\\eclipse-workspace\\Tasca-S1.05-Java-Utils\\src";
		
		if (args.length==1) {
			importOrdenaArrayList(args[0]);
		}else {
			System.out.println("Check if the specified path is correct, spaces aren't allow! ");
			}	
		
	
	}
	
	public static void importOrdenaArrayList(String fileLocation) {
		
	     File creationFile = new File(fileLocation);
	      File[] nombresArchivos = creationFile.listFiles(); // transformamos a Array de tipo File
	      Arrays.sort(nombresArchivos);
	      
	      for (int i=0;  i <nombresArchivos.length;i++) {
	
	    	  File fileODirectori= nombresArchivos[i].getAbsoluteFile(); 
	    	  
	    	  DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss"); 				// https://stackoverflow.com/questions/4363197/getting-the-last-modified-date-of-a-file-in-java
	    	  
	    	  //Date lastModificacion= new Date(fileODirectori.lastModified());
	    	  
	    	  if (fileODirectori.isDirectory()) {
	    		  
	    		  System.out.println("Es un directorio (D):  " + fileODirectori.getName() +" Ultima modificacion: " +dateFormat.format(fileODirectori.lastModified()));
	    		  importOrdenaArrayList(fileODirectori.getAbsolutePath()); // recursividad
	    		 
	    	  }
	    	 
	    	  else {
	    		  
	    		  System.out.println("\t"+"Es un fichero (F):  "+ fileODirectori.getName()+ " Ultima modificacion: "+ dateFormat.format(fileODirectori.lastModified()));;
	    		  }
    		  
	    	  }
	} 

}
