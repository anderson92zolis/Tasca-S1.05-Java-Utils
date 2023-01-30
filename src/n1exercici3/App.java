package n1exercici3;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) {

		/*Exercici 3
	    * Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, 
	    * guarda el resultat en un fitxer TXT. 
	    */
		
		if (args.length==1) {			// Path where is the txt
			String nametxtToWrite= "C:\\Users\\azoli\\eclipse-workspace\\Tasca-S1.05-Java-Utils\\src\\n1exercici3\\directorios_subdirectoriosOrdenados.txt";
			guardaEnFicheTxt(args[0],nametxtToWrite);
		}else {
			System.out.println("Check if the specified path is correct, spaces aren't allow! ");
			}	
	}
	
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
	    	  
	    	 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss"); 				// https://stackoverflow.com/questions/4363197/getting-the-last-modified-date-of-a-file-in-java
	    	   
	    	 if (fileODirectori.isDirectory()) {
	    		  
	    		  System.out.println("Es un directorio (D):  " + fileODirectori.getName() +" Ultima modificacion: " +dateFormat.format(fileODirectori.lastModified()));
	    		  importOrdenaArrayList(fileODirectori.getAbsolutePath()); // recursividad 
	    	  } else {
	    		  System.out.println("\t"+"Es un fichero (F):  "+ fileODirectori.getName()+ " Ultima modificacion: "+ dateFormat.format(fileODirectori.lastModified()));;
	    		  }
	      }
	} 
}
