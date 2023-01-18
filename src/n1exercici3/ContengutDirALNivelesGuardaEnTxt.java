package n1exercici3;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.sql.Date;


public class ContengutDirALNivelesGuardaEnTxt {
   /*
    * Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, 
    * guarda el resultat en un fitxer TXT. 
    * Hecho desde el main
   */
	
	private String directori;
	
	// "C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.05- Java Utils\\src\\n1exercici1\\filename.txt"
	
	public   ContengutDirALNivelesGuardaEnTxt(String directori) {
		this.directori=directori;
	}	
	
	public void importOrdenaArrayList() {
		
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
