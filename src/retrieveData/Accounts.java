package retrieveData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Accounts {
	
	public String _username = null;
	public String _password = null;
	public String _image = null;
	public String _balance = null;

	
	public void getAccountsFromFile() {
		try {
		Scanner inFile = new Scanner(new File ("C:\\Users\\erdi.ozyildirim\\eclipse-workspace\\ATMProject\\src\\accounts.txt"));
		String line=null;
		
		while(inFile.hasNextLine()) {
			line = inFile.nextLine();
			Accounts account = new Accounts();
			Scanner accountLine = new Scanner(line);
			
			this._username = accountLine.next();
			this._password = accountLine.next();
			this._image = accountLine.next();
			this._balance = accountLine.next();
			
		}
		
		}
		catch (FileNotFoundException e){
			System.out.println("accounts.txt not found");
			System.out.println("Exception: " + e.getMessage());
			System.exit(-1);

		}
		
	}
	
	public void Account(String line) {
		
	}
	
}
