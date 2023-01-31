package n1exercici1;

public class  App {

	public static void main(String[] args) {

		/* Exercici1
	   	* Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.
	    */
		
<<<<<<< HEAD
		// args act like an array of string
=======
>>>>>>> 005c74d4ed9dffe23ea881e288026601c5691d19
		if (args.length==1) {
			LListeAlfDirectory.ordenaDirectorio(args[0]);
		}else {
			System.out.println("Check if the specified path is correct, spaces aren't allow! ");
			}
	}
	
	

}