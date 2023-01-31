package n1exercici1;

public class  App {

	public static void main(String[] args) {

		/* Exercici1
	   	* Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.
	    */
		
		// args act like an array of string
		if (args.length==1) {
			LListeAlfDirectory.ordenaDirectorio(args[0]);
		}else {
			System.out.println("Check if the specified path is correct, spaces aren't allow! ");
			}
	}
	
	

}