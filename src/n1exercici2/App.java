package n1exercici2;

import java.io.File;

public class App {
	/*
    * Exercici2
   	* Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de 
   	* directoris amb el contingut de tots els seus nivells (recursivament) de manera que 
   	* s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell, indicant a més si és un
   	*  directori (D) o un fitxer (F), i la seva última data de modificació.
    */
	
	public static void main(String[] args) {
		
		// args act like an array of string
		
		File file;
		String route;
		
		if (args.length==1) {
			route = args[0];
			file = new File(route);
			
			LlisteAlfDirectoryRecursiv.ordenaDirectorioRecursiv(file);
			
		}else {
			System.out.println("Check if the specified path is correct, spaces aren't allow! ");
			}	
		
	}
	
	

}
