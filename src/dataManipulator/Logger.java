package dataManipulator;

import java.io.*;

public class Logger {
	public static void log() {
		try (FileWriter f = new FileWriter("C:\\Users\\erdi.ozyildirim\\eclipse-workspace\\ATMProject\\src\\logs.txt", true); 
				BufferedWriter b = new BufferedWriter(f); 
				PrintWriter p = new PrintWriter(b);) 
		{ 
			p.println("appending text into file"); 
			p.println("Gaura"); 
			p.println("Bori"); 
		} catch (IOException i) {
			i.printStackTrace(); 
		}

	}
}
