package userInterface;

import java.util.Scanner;

public class HavaleYap implements IFakeMail{

	public void fakeMail(int miktar) {
		System.out.println(miktar + " Lira Havale yapımını özetleyen mail, adresinize gönderilmiştir.");
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
		System.exit(0);
	}
	
}
