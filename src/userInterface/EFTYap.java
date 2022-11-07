package userInterface;

import java.util.Scanner;

public class EFTYap implements IFakeMail{
	
	public void fakeMail(int miktar) {
		System.out.println(miktar + " Lira EFT yapımını özetleyen mail, adresinize gönderilmiştir.");
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
	}
	
}
