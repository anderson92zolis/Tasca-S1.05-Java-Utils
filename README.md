# Tasca-S1.05-Java-Utils
Exercicis

_____________________________________________________________________________________________

- N1E1: Exercici1
	Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.

Accedemos a al directorio donde están nuestras clases:
	C:\Users\azoli>cd C:\Users\azoli\eclipse-workspace\Tasca-S1.05-Java-Utils\src\n1exercici1
Proceso de compilación del programa:
	javac -d . App.java LListeAlfDirectory.java
Ejutamos el programa:
	java App.java C:\Users\azoli\eclipse-workspace\Tasca-S1.05-Java-Utils   

impresión por consola:

 	nombres de archivos : .classpath

 	nombres de archivos : .git

 	nombres de archivos : .project

 	nombres de archivos : .settings

 	nombres de archivos : README.md

 	nombres de archivos : bin

	 nombres de archivos : src
______________________________________________________________________________________________
- N1E2: Exercici2
	Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.

Accedemos a al directorio donde están nuestras clases:
	C:\Users\azoli>cd C:\Users\azoli\eclipse-workspace\Tasca-S1.05-Java-Utils\src\n1exercici1
Proceso de compilación del programa:
	javac -d . App.java LListeAlfDirectory.java
Ejutamos el programa:
	java App.java C:\Users\azoli\eclipse-workspace\Tasca-S1.05-Java-Utils   

impresión por consola:

 	nombres de archivos : .classpath

 	nombres de archivos : .git

 	nombres de archivos : .project

 	nombres de archivos : .settings

 	nombres de archivos : README.md

 	nombres de archivos : bin

	 nombres de archivos : src

_____________________________________________________________________________________________
- N1E3: Exercici 3
	Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el resultat en un fitxer TXT. 
-----------------------------------------------------------------------------------------------
Accedemos a al directorio donde están nuestras clases:
	C:\Users\azoli>cd C:\Users\azoli\eclipse-workspace\Tasca-S1.05-Java-Utils\src\n1exercici3
Proceso de compilación del programa:
	javac -d . App.java GuardaEnTxt.java
Ejutamos el programa:
	java App.java C:\Users\azoli\eclipse-workspace\Tasca-S1.05-Java-Utils\src
_______________________________________________________________________________________________
- N1E4: Exercici 4
	Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.
-----------------------------------------------------------------------------------------------

Accedemos a al directorio donde están nuestras clases:
	C:\Users\azoli>cd C:\Users\azoli\eclipse-workspace\Tasca-S1.05-Java-Utils\src\n1exercici4
Proceso de compilación del programa:
	javac -d . App.java LlegirFitxerTXT.java
Ejutamos el programa:
	java App.java C:\Users\azoli\eclipse-workspace\Tasca-S1.05-Java-Utils\src\n1exercici4\filename.txt

resultado que contiene el file.txt: 

	Volvoo BMW Ford Mazda Ibiza
	Nextline

_______________________________________________________________________________________________
- N1E5: Exercici 5
	Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar.
------------------------------------------------------------------------------------------------
Accedemos a al directorio donde están nuestras clases:
	C:\Users\azoli>cd C:\Users\azoli\eclipse-workspace\Tasca-S1.05-Java-Utils\src\n1exercici5
Proceso de compilación del programa:
	javac -d . Main.java Ordinador.java
Ejutamos el programa:
	java Main.java

resultado de serialización:
	estos son los ordenadores guardados en .ser: marca Apple, quantitat Memoria Ram 16 Gb
	estos son los ordenadores guardados en .ser: marca MicrosoftSurface, quantitat Memoria Ram 500 gb 
____________________________________________________________________________________________________
- N2E1: Exercici 1
/*
	* Executa l'exercici 3 del nivell anterior parametritzant tots els mètodes en un fitxer de configuració. 
	* Pots utilitzar un fitxer Java Properties, o bé la llibreria Apache Commons Configuration si ho prefereixes.
	* De l'exercici anterior, parametritza el següent:
	*     Directori a llegir.
	*     Nom i directori del fitxer TXT resultant.
*/
---------------------------------------------------------------------------------------------------
Accedemos a al directorio donde están nuestras clases:
	C:\Users\azoli>cd C:\Users\azoli\eclipse-workspace\Tasca-S1.05-Java-Utils\src\n2exercici1
Proceso de compilación del programa:
	javac App.java
Ejutamos el programa:
	java App.java

resultado de la impresión mediante propiedades.getProperty("parametro"):

	'Loading Properties Files'
	Directori a llegir: C:\Users\azoli\eclipse-workspace\Tasca-S1.05-Java-Utils\src\
	Directori del fichet txt: C:\Users\azoli\eclipse-workspace\Tasca-S1.05-Java-Utils\src\n2exercici1\
	Nom del ficher txt: nomFicherResult.txt

resultado del txt nomFicherResult.txt: 

Es un directorio (D):  n1exercici1 Ultima modificacion: 31/01/2023 - 12:04:34
	Es un fichero (F):  App.java Ultima modificacion: 31/01/2023 - 12:14:36
	Es un fichero (F):  LListeAlfDirectory.class Ultima modificacion: 31/01/2023 - 10:51:52
	Es un fichero (F):  LListeAlfDirectory.java Ultima modificacion: 31/01/2023 - 10:45:59
Es un directorio (D):  n1exercici2 Ultima modificacion: 31/01/2023 - 12:04:40
	Es un fichero (F):  App.java Ultima modificacion: 31/01/2023 - 11:48:52
	Es un fichero (F):  LlisteAlfDirectoryRecursiv.java Ultima modificacion: 31/01/2023 - 11:42:37
Es un directorio (D):  n1exercici3 Ultima modificacion: 31/01/2023 - 12:26:29
	Es un fichero (F):  App.java Ultima modificacion: 31/01/2023 - 12:25:01
	Es un fichero (F):  directorios_subdirectoriosOrdenados.txt Ultima modificacion: 31/01/2023 - 12:27:22
	Es un fichero (F):  GuardaEnTxt.java Ultima modificacion: 31/01/2023 - 12:21:11
Es un directorio (D):  n1exercici3 Ultima modificacion: 31/01/2023 - 12:26:29
	Es un fichero (F):  App.class Ultima modificacion: 31/01/2023 - 12:26:29
	Es un fichero (F):  GuardaEnTxt.class Ultima modificacion: 31/01/2023 - 12:26:29
Es un directorio (D):  n1exercici4 Ultima modificacion: 31/01/2023 - 13:05:52
	Es un fichero (F):  App.java Ultima modificacion: 01/02/2023 - 10:59:43
	Es un fichero (F):  filename.txt Ultima modificacion: 30/01/2023 - 13:32:06
	Es un fichero (F):  LlegirFitxerTXT.java Ultima modificacion: 01/02/2023 - 10:59:51
Es un directorio (D):  n1exercici4 Ultima modificacion: 31/01/2023 - 13:05:52
	Es un fichero (F):  App.class Ultima modificacion: 31/01/2023 - 13:05:52
	Es un fichero (F):  LlegirFitxerTXT.class Ultima modificacion: 31/01/2023 - 13:05:52
Es un directorio (D):  n1exercici5 Ultima modificacion: 01/02/2023 - 12:00:05
	Es un fichero (F):  Main.java Ultima modificacion: 01/02/2023 - 11:45:03
Es un directorio (D):  n1exercici5 Ultima modificacion: 01/02/2023 - 11:51:39
	Es un fichero (F):  Main.class Ultima modificacion: 01/02/2023 - 11:51:39
	Es un fichero (F):  Ordinador.class Ultima modificacion: 01/02/2023 - 11:51:39
	Es un fichero (F):  Ordinador.java Ultima modificacion: 30/01/2023 - 13:46:40
Es un directorio (D):  n2exercici1 Ultima modificacion: 01/02/2023 - 12:02:33
	Es un fichero (F):  App.class Ultima modificacion: 01/02/2023 - 12:02:33
	Es un fichero (F):  App.java Ultima modificacion: 01/02/2023 - 12:00:36
	Es un fichero (F):  configuracion.properties.txt Ultima modificacion: 31/01/2023 - 10:21:16
	Es un fichero (F):  nomFicherResult.txt Ultima modificacion: 01/02/2023 - 12:02:40 