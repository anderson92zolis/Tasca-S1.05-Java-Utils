package n1exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class GuardaEnTxt {

	public static void guardaEnFicheTxt(String fileLocation, String nametxtToWritE) {
			
			try {
				
				PrintStream myConsole = System.out;
	            PrintStream fileOut = new PrintStream(nametxtToWritE); // name of a file where we are going to write
	            System.setOut(fileOut);
	            importOrdenaArrayList(fileLocation);
			} catch(FileNotFoundException fx) {
				System.out.println(fx);
				};
			}

	public static void importOrdenaArrayList(String fileLocation) {
		
	    File creationFile = new File(fileLocation);
	    File[] nombresArchivos = creationFile.listFiles(); // create a File type Array 
	    Arrays.sort(nombresArchivos);
	     
	    for (int i=0;  i <nombresArchivos.length;i++) {
	
	   	 File fileODirectori= nombresArchivos[i].getAbsoluteFile(); 
	   	  
	   	 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss"); 				// https://stackoverflow.com/questions/4363197/getting-the-last-modified-date-of-a-file-in-java
	   	   
	   	 if (fileODirectori.isDirectory()) {
	   		  
	   		  System.out.println("Es un directorio (D):  " + fileODirectori.getName() +" Ultima modificacion: " +dateFormat.format(fileODirectori.lastModified()));
	   		  importOrdenaArrayList(fileODirectori.getAbsolutePath()); // recursividad 
	   	  } else {
	   		  System.out.println("\t"+"Es un fichero (F):  "+ fileODirectori.getName()+ " Ultima modificacion: "+ dateFormat.format(fileODirectori.lastModified()));;
	   		  }
	     }
	} 
	
}
