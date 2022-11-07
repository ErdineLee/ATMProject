package dataManipulator;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;

public class DataManipulator {
	public static void dataManipulator(int para) {
	try {
	
        FileReader fr = new FileReader("C:\\Users\\erdi.ozyildirim\\eclipse-workspace\\ATMProject\\src\\deneme.txt");

        FileWriter fw = new FileWriter("C:\\Users\\erdi.ozyildirim\\eclipse-workspace\\ATMProject\\src\\deneme1.txt");

        String str = "";
        int i;
        // Condition check
        // Reading the file using read() method which
        // returns -1 at EOF while reading
        while ((i = fr.read()) != -1) {
            str += (char)i;
        }
        fw.write(str);
        fw.append("a");

        fr.close();
        fw.close();

        //System.out.println(
        //    "File reading and writing both done");
    }

    // Catch block to handle the exception
    catch (IOException e) {

        // If there is no file in specified path or
        // any other error occurred during runtime
        // then it will print IOException

        // Display message
        System.out.println(
            "There are some IOException");
    }
	}
}
