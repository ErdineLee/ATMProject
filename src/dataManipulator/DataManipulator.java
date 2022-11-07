package dataManipulator;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.util.StringTokenizer;

public class DataManipulator {
	public static void dataManipulator(int para) {
	try {
	
        FileReader fr = new FileReader("C:\\Users\\erdi.ozyildirim\\eclipse-workspace\\ATMProject\\src\\deneme.txt");


        String str = "";
        String str2 = "";
        int i;
        // Condition check
        // Reading the file using read() method which
        // returns -1 at EOF while reading
        while ((i = fr.read()) != -1) {
            str += (char)i;
        }
        
        StringTokenizer tutucu = new StringTokenizer(str);
        
        String s = "";
        
        for (i = 0; i < 4; i++) {        
        	if(i==3) {
            	str2 = tutucu.nextToken();
            	System.out.println(str2);
            	int a = Integer.parseInt(str2);  
            	a = a-para;
            	s = Integer.toString(a);
            }
        	else {
                str2 = tutucu.nextToken();
        	}
        }
        System.out.println(s);
        str = str.substring(0, 33);
        str = str + s;
        
        fr.close();
        FileWriter fw = new FileWriter("C:\\Users\\erdi.ozyildirim\\eclipse-workspace\\ATMProject\\src\\deneme.txt");
        fw.write(str);
        fw.close();
    }

    catch (IOException e) {

        System.out.println(
            "There are some IOException");
    }
	}
}
