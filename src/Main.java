import java.util.Scanner;
import retrieveData.RetrieveData;
import userInterface.UserInterface;
import dataManipulator.DataManipulator;
import dataManipulator.Logger;

public class Main {
	public static void main(String[] args) {
		UserInterface.karsilamaEkranı();
		UserInterface.girisEkranı();
		UserInterface.islemEkranı();
		//DataManipulator.dataManipulator();
		Logger.log();
	}
}
