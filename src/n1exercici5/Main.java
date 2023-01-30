package n1exercici5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Main {

	public static void main(String[] args) throws ClassNotFoundException { // lanzar throws ClassNotFoundException cuando se trabaje con try/catch
		// TODO Auto-generated method stub
	Ordinador[] listaOrdenadores = new Ordinador[2];
	
	Ordinador ordenador1= new Ordinador();
	Ordinador ordenador2= new Ordinador("MicrosoftSurface","500 gb");
	listaOrdenadores[0]= ordenador1;
	listaOrdenadores[1]= ordenador2;
	
	try {
		//salida
		ObjectOutputStream escribiendo_Fichero= new ObjectOutputStream(new FileOutputStream("C:\\Users\\azoli\\eclipse-workspace\\ordenador.ser"));
		escribiendo_Fichero.writeObject(listaOrdenadores); 		
		escribiendo_Fichero.close();
		  
		//entrada
		
		ObjectInputStream recuperando_Fichero= new ObjectInputStream(new FileInputStream("C:\\Users\\azoli\\eclipse-workspace\\ordenador.ser"));
		Ordinador[] ordenadoresRecuperadosEnArray = (Ordinador[]) recuperando_Fichero.readObject();
		recuperando_Fichero.close();
		
		for (Ordinador ordenadores:ordenadoresRecuperadosEnArray) {
			System.out.println("estos son los ordenadores de guardados en .ser: " + ordenadores);
			}
		}
	
		catch(IOException e) {
		  e.getMessage();
		}	
	}

}