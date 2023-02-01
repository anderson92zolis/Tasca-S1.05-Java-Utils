package n1exercici3;

import java.io.File;

public class App {

	public static void main(String[] args) {

		/*Exercici 3
	    * Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, 
	    * guarda el resultat en un fitxer TXT. 
	    */
		
		File file;
		String route;
		
		if (args.length==1) {
			route = args[0];
			file = new File(route);					// Path where is the txt.towrite
			String nametxtToWrite= "C:\\Users\\azoli\\eclipse-workspace\\Tasca-S1.05-Java-Utils\\src\\n1exercici3\\directorios_subdirectoriosOrdenados.txt";
			GuardaEnTxt.guardaEnFicheTxt(file,nametxtToWrite);
		}else {
			System.out.println("Check if the specified path is correct, spaces aren't allow! ");
			}	
	}
}
