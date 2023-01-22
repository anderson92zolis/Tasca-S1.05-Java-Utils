package n1exercici4;

public class App {

	public static void main(String[] args) {

		// Exercici4
		//"C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.05- Java Utils\\src\\n1exercici1\\filename.txt"
		contengutDirAL pruebaOrdena= new contengutDirAL("filename.txt");// Si no especifica el path del directorio java tomará como referencia el path del directorio donde está trabajando(por eso solo se puede poner el fichero.txt). 
		pruebaOrdena.importOrdenaArrayList();
		
	}

}
