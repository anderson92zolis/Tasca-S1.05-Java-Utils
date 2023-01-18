package n1exercici2;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.sql.Date;


public class contengutDirALNiveles {
   /*
   	* Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de 
   	* directoris amb el contingut de tots els seus nivells (recursivament) de manera que 
   	* s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell, indicant a més si és un
   	*  directori (D) o un fitxer (F), i la seva última data de modificació.
    */
	
	private String directori;
	
	// "C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.05- Java Utils\\src\\n1exercici1\\filename.txt"
	
	public   contengutDirALNiveles(String directori) {
		this.directori=directori;
	}	
	
	public void importOrdenaArrayList() {
		
	ArrayList<String> sortArrayList = new ArrayList<String>();
	
	     try {
	      File ruta = new File(directori);
	      String[] nombresArchivos = ruta.list(); // transformamos a Array de tipo String
	      Arrays.sort(nombresArchivos);
	      
	      System.out.println(" nombres de archivos : " + Arrays.toString(nombresArchivos)+"\n");
	      
	      for (int i=0;  i <nombresArchivos.length;i++) {
	
	    	  File fileODirectori= new File(ruta.getAbsolutePath(),nombresArchivos[i]); //ruta y nombre de archivo(es fichero o carpeta?)
	    	  
	    	  Date lastModificacion= new Date(fileODirectori.lastModified());
	    	  
	    	  if (fileODirectori.isDirectory()) {
	    		  
	    		  String[] subCarpetas= fileODirectori.list();
	    		  
	    		  System.out.println("Es un directorio (D):  " + fileODirectori.getCanonicalPath() +" Última modificación "+lastModificacion);
	    		  Arrays.sort(subCarpetas);
	    		  for (String archivosSubCarpetas:subCarpetas) {
	    			  System.out.println("\t"+"subcarpetas del directorio  "+" "+ archivosSubCarpetas);;;
	    			  }}
	    	 
	    	  else {
	    		  System.out.println("Es un fichero (F):  "+ fileODirectori.getCanonicalPath()+ " Última modificación "+ lastModificacion);;
	    		  }
	    	  }
	      } catch (IOException e) {
	            e.printStackTrace();
	      }
	} 
}	
