package n1exercici1;
import java.io.File;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileNotFoundException;  // Import this class to handle errors

public class LlistiAlfabeticamentContingutDirectori {
   		
	public static void main(String[] args) { 	
		ArrayList<String> sortArrayList = new ArrayList<String>();
		try {
	      File myObj = new File("C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.05- Java Utils\\src\\n1exercici1\\filename.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        String[] nombre_archivos = data.split(" ");
	        for (String word:nombre_archivos) {
	        	sortArrayList.add(word); 
	        	}
	      }		      
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
		Collections.sort(sortArrayList);
		System.out.println("mi ArrayList: "+sortArrayList);
		
	}

	@Override
	public String toString() {
		return "LlistiAlfabeticamentContingutDirectori [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	} 
	
	
}
