import java.util.Scanner;

import retrieveData.Accounts;
import retrieveData.RetrieveData;
import userInterface.UserInterface;
import dataManipulator.DataManipulator;
import dataManipulator.Logger;

public class Main {
	public static void main(String[] args) {
		UserInterface.karsilamaEkranı();
		UserInterface.girisEkranı();
		UserInterface.islemEkranı();
		System.exit(0);
		//To create another account
		//Accounts account1 = new Accounts();
		//account1.getAccountsFromFile();
		//System.out.println(account1._username);
	}
}
