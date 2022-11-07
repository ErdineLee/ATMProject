package retrieveData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RetrieveData {
		
	public static String[] DataRetriever() {
		
		File file = new File("C:\\Users\\erdi.ozyildirim\\eclipse-workspace\\ATMProject\\src\\deneme.txt");
	    
	    try {
	    Scanner sc = new Scanner(file);
	    
	    int i = 0;
	    String[] string1 = new String[10];
	    while (sc.hasNextLine()) {
	        string1[i] = sc.next();
	        i++;
	    }
	    sc.close();
	    return string1;
	    }
	    catch (FileNotFoundException e){
	    	String[] string2 = null;
			return string2;
	    }
	}
}
