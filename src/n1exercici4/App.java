package n1exercici4;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

	/* Exercici4
	 * Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.
	 */
		
	//filename.txt ->Si no especifica el path del directorio java tomará como referencia el path del directorio donde está trabajando(se puede poner el fichero.txt). 
		
		File file;
		String route;
	
		if (args.length==1) {
			try {
				route = args[0];
				file= new File(route);
				LlegirFitxerTXT.importOrdenaArrayList(file);
			} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("file doesn't exist! ");
					e.printStackTrace();
				} 
			
		}else {
			System.out.println("Check if the specified path is correct, spaces aren't allow! ");
			}		
	}
		

}	
