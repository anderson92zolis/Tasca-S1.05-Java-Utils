package n1exercici4;

import java.io.IOException;

public class App {

	public static void main(String[] args) {

	/* Exercici4
	 * Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.
	 */
		
	//filename.txt ->Si no especifica el path del directorio java tomará como referencia el path del directorio donde está trabajando(se puede poner el fichero.txt). 
	
	
		if (args.length==1) {
			try {
				LlegirFitxerTXT.importOrdenaArrayList(args[0]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Check if the specified path is correct, spaces aren't allow! ");
			}		
	}
		

}	
