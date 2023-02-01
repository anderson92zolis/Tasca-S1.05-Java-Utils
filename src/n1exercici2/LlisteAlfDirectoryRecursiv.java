package n1exercici2;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class LlisteAlfDirectoryRecursiv {

	public static void ordenaDirectorioRecursiv(File fileLocation) {
		
	     
		
	     File[] nombresArchivos = fileLocation.listFiles(); // transformamos a Array de tipo File
	     Arrays.sort(nombresArchivos);
	      
	      for (int i=0;  i <nombresArchivos.length;i++) {
	
	    	  File fileODirectori= nombresArchivos[i].getAbsoluteFile(); 
	    	  
	    	  DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss"); 				// https://stackoverflow.com/questions/4363197/getting-the-last-modified-date-of-a-file-in-java
	    	  
	    	  
	    	  if (fileODirectori.isDirectory()) {
	    		  
	    		  System.out.println("Es un directorio (D):  " + fileODirectori.getName() +" Ultima modificacion: " +dateFormat.format(fileODirectori.lastModified()));
	    		  ordenaDirectorioRecursiv(fileODirectori); // recursividad
	    		 
	    	  }
	    	 
	    	  else {
	    		  
	    		  System.out.println("\t"+"Es un fichero (F):  "+ fileODirectori.getName()+ " Ultima modificacion: "+ dateFormat.format(fileODirectori.lastModified()));;
	    		  }
   		  
	    	  }
	} 
	
}
