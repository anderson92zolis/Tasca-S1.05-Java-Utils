package n1exercici2;

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
		
		if (args.length==1) {
			
			LlisteAlfDirectoryRecursiv.ordenaDirectorioRecursiv(args[0]);
			
		}else {
			System.out.println("Check if the specified path is correct, spaces aren't allow! ");
			}	
		
	}
	
	

}
