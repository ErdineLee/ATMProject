package userInterface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Date;

public class HavaleYap implements IFakeMail{

	public void fakeMail(int miktar) {
		System.out.println(miktar + " Lira Havale yapımını özetleyen mail, adresinize gönderilmiştir.");
	}
	
	public void log(int miktar) {
		//System.out.println(miktar + " Lira Havale yapımını özetleyen mail, adresinize gönderilmiştir.");
		
		try (FileWriter f = new FileWriter("C:\\Users\\erdi.ozyildirim\\eclipse-workspace\\ATMProject\\src\\logs.txt", true); 
				BufferedWriter b = new BufferedWriter(f); 
				PrintWriter p = new PrintWriter(b);) 
		{ 	
			p.println("\n\nHavale İşlemi:");
			Date currentTime = new Date();
			p.println(currentTime.toString());
			p.println(miktar+ " Lira tutarındaki havale işlemi başarıyla gerçekleştirilmiştir.");  
		} catch (IOException i) {
			i.printStackTrace(); 
		}	
	}
	
	public static void havaleYap() {
		System.out.println("Lütfen havale yapılacak miktarı giriniz: ");
		Scanner sc6 = new Scanner(System.in);
		int miktar = sc6.nextInt();
		//sc6.close();
		UserInterface.hesaptanParaCekiliyor(miktar);
		System.out.println("Havale islemi gerceklestirildi...");
		System.out.println("İyi günler dileriz.");
		HavaleYap havale1 = new HavaleYap();
		havale1.fakeMail(miktar);
		havale1.log(miktar);
		System.exit(0);
	}
	
}
