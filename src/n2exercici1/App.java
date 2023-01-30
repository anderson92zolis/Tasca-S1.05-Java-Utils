package n2exercici1;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		/*
		 * Executa l'exercici 3 del nivell anterior parametritzant tots els mètodes en un fitxer de configuració. 
		 * Pots utilitzar un fitxer Java Properties, o bé la llibreria Apache Commons Configuration si ho prefereixes.
		 * De l'exercici anterior, parametritza el següent:
		 *     	Directori a llegir.
		 *      Nom i directori del fitxer TXT resultant.
	    */
		
					// Path where is the txt
		
		
		
		System.out.println(" 'Loading Properties Files' ");
				
		try { 
			String pathConfPro = "C:\\Users\\azoli\\eclipse-workspace\\Tasca-S1.05-Java-Utils\\src\\n2exercici1\\configuracion.properties.txt";
			
			Properties propiedades= new Properties();
			propiedades.load(new FileInputStream(new File(pathConfPro)));
		
			System.out.println("Directori a llegir: "+ propiedades.getProperty("Directori"));
		    System.out.println("Directori del fichet txt: " +propiedades.getProperty("DirectoriFicher"));
		    System.out.println("Nom del ficher txt: "+propiedades.getProperty("NomFicher"));
		    
			String directori= propiedades.getProperty("Directori");
			String directoriFicher= propiedades.getProperty("DirectoriFicher");
			String nomFicher= propiedades.getProperty("NomFicher");
			
			guardaEnFicheTxt(directori,directoriFicher,//nomFicher);
		
			}catch (FileNotFoundException e) {
			      // TODO Auto-generated catch block
			      e.printStackTrace();
			}catch (IOException e) {
				System.out.println("VA PASSAR UN ERROR ->"+e.getMessage());
				}
		
	}
	
	public static void guardaEnFicheTxt(String fileLocation, String directoriFicher, // String nomFicher) {
		
		try {
			PrintStream myConsole = System.out;
            PrintStream fileOut = new PrintStream (//directoriFicher, ); // name of a file where we are going to write
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
