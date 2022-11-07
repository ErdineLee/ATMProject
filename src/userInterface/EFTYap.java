package userInterface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class EFTYap implements IFakeMail{
	
	public void fakeMail(int miktar) {
		System.out.println(miktar + " Lira EFT yapımını özetleyen mail, adresinize gönderilmiştir.");
	}
	
	public void log(int miktar) {
		//System.out.println(miktar + " Lira EFT yapımını özetleyen mail, adresinize gönderilmiştir.");
		
		try (FileWriter f = new FileWriter("C:\\Users\\erdi.ozyildirim\\eclipse-workspace\\ATMProject\\src\\logs.txt", true); 
				BufferedWriter b = new BufferedWriter(f); 
				PrintWriter p = new PrintWriter(b);) 
		{ 	
			p.println("\n\nHavale İşlemi:");
			Date currentTime = new Date();
			p.println(currentTime.toString());
			p.println(miktar+ "Lira tutarındaki EFT işlemi başarıyla gerçekleştirilmiştir.");  
		} catch (IOException i) {
			i.printStackTrace(); 
		}	
	}
	
	public static void eftYap() {
		System.out.println("Lütfen EFT yapılacak miktarı giriniz: ");
		Scanner sc7 = new Scanner(System.in);
		int miktar = sc7.nextInt();
		sc7.close();
		UserInterface.hesaptanParaCekiliyor(miktar);
		System.out.println("Havale islemi gerceklestirildi...");
		System.out.println("İyi günler dileriz.");
		EFTYap eft1 = new EFTYap();
		eft1.fakeMail(miktar);
		eft1.log(miktar);
	}
	
}
