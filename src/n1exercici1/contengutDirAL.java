package n1exercici1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.sql.Date;


public class contengutDirAL {
   /*
   	* Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.
    */
	
	private String directori;
	
	// "C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.05- Java Utils\\
	
	public   contengutDirAL(String directori) {
		this.directori=directori;
	}	
	
	public void importOrdenaArrayList() {
	
	     try {
	      File ruta = new File(directori);
	      String[] nombresArchivos = ruta.list(); // transformamos toda la Array a tipo String
	      Arrays.sort(nombresArchivos);
	      
	      for(String ordenAlfa:nombresArchivos) {
	    	  System.out.println(" nombres de archivos : " + ordenAlfa+"\n");;
	    	  }
	      
	      //System.out.println(" nombres de archivos : " + Arrays.toString(nombresArchivos)+"\n"); //transforma toda la array list a un String
	      
	      } catch (Exception e) {
	            e.printStackTrace();
	      }
	} 
}	
