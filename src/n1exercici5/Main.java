package n1exercici5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Main {

	public static void main(String[] args)  { // lanzar throws ClassNotFoundException para la lectura del ficheros
	 
	/* - Exercici 5
	 * Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar.
	 */
	
	ObjectOutputStream escribiendo_Fichero=null;
	ObjectInputStream recuperando_Fichero= null;	
		
	Ordinador[] listaOrdenadores = new Ordinador[2];
	
	Ordinador ordenador1= new Ordinador();
	Ordinador ordenador2= new Ordinador("MicrosoftSurface","500 gb");	
	listaOrdenadores[0]= ordenador1;
	listaOrdenadores[1]= ordenador2;
	
	try {
		//output
		escribiendo_Fichero= new ObjectOutputStream(new FileOutputStream("C:\\Users\\azoli\\eclipse-workspace\\Tasca-S1.05-Java-Utils\\src\\n1exercici5\\ordenador.ser"));
		escribiendo_Fichero.writeObject(listaOrdenadores); 		
	
		  
		//input
		
		recuperando_Fichero= new ObjectInputStream(new FileInputStream("C:\\Users\\azoli\\eclipse-workspace\\Tasca-S1.05-Java-Utils\\src\\n1exercici5\\ordenador.ser"));
		Ordinador[] ordenadoresRecuperadosEnArray = (Ordinador[]) recuperando_Fichero.readObject();

		
		for (Ordinador ordenadores:ordenadoresRecuperadosEnArray) {
			System.out.println("estos son los ordenadores guardados en .ser: " + ordenadores);
			}
		}
	
		catch(IOException e) {
		  e.getMessage();
		} catch (ClassNotFoundException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}	finally {
				try {
					if(escribiendo_Fichero!=null) {escribiendo_Fichero.close();}
					if (recuperando_Fichero!=null) {recuperando_Fichero.close();}
				} catch (Exception ex) {
					ex.printStackTrace();
					}
			}
	}
}
