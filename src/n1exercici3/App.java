package n1exercici3;

import java.io.PrintStream;
import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) {

		// Exercici3
		
		ContengutDirALNivelesGuardaEnTxt pruebaOrdena= new ContengutDirALNivelesGuardaEnTxt("C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.05- Java Utils\\src\\");
		
		
		try {
			PrintStream myConsole = System.out;
            PrintStream fileOut = new PrintStream("C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.05- Java Utils\\src\\n1exercici3\\directorios_subdirectoriosOrdenados.txt");
            System.setOut(fileOut);
            pruebaOrdena.importOrdenaArrayList();
		} catch(FileNotFoundException fx) {
			System.out.println(fx);
			}
	}

}
