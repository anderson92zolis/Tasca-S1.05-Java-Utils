package n1exercici1;

import java.io.File;

public class  App {

	public static void main(String[] args) {

		/* Exercici1
	   	* Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.
	    */
		
		// args act like an array of strings
		
		File file;
		String route;
		
		if (args.length==1) {
			route = args[0];
			file = new File(route);
			LListeAlfDirectory.ordenaDirectorio(file);
		}else {
			System.out.println("Check if the specified path is correct, spaces aren't allow! ");
			}
	}
}