package userInterface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

import dataManipulator.DataManipulator;
import retrieveData.RetrieveData;

public class UserInterface {	
	public static void karsilamaEkranı() {
		System.out.println("Bankamıza Hoşgeldiniz...");
		System.out.println("Lütfen kullanıcı bilgilerinizi giriniz");
	}
	
	public static void girisEkranı() {
		int i=3;
		Scanner sc1 = new Scanner(System.in);
		while(i>0) {
			System.out.println("Username giriniz:");
			
			String userName = sc1.nextLine();
			
			System.out.println("Password giriniz:");
			String password = sc1.nextLine();
			
			String[] data = new String[10];
			data = RetrieveData.DataRetriever();
			
			if(data[0].equals(userName) && data[1].equals(password)) {
				System.out.println("Giriş Yapıldı");	

				break;
			}
			else {
				System.out.println("Username veya password hatalı. Kalan hakkınız " + (i-1));	
				i--;
				
			}
			
			if(i == 0) {
				System.out.println("System blocked.");
				System.exit(0);
			}
			
		}
		//sc1.close();
	}
	
	public static void islemEkranı() {
		System.out.println("Lütfen yapmak istediginiz islemi giriniz...");
		System.out.println("Para görüntülemek için 0");
		System.out.println("Para yatırmak için 1");
		System.out.println("Para çekmek için 2");
		System.out.println("Havale yapmak için 3");
		System.out.println("EFT yapmak için 4");
		System.out.println("Fake Mail() için 5");
		System.out.println("Çıkış yapmak için 6");
		
		Scanner sc2 = new Scanner(System.in);
		int secenek = sc2.nextInt();
		//sc2.close();
		
		switch (secenek) {
		case 0:
			paraGoruntule();
			break;
		case 1:
			paraYatır();
			break;
		case 2:
			paraCek();
			break;
		case 3:
			HavaleYap.havaleYap();
			break;
		case 4:
			EFTYap.eftYap();
			//EFTYap
			break;
		case 5:
			fakeMail();
			break;
		case 6:
			System.out.println("İşleminiz sonlandırılmıştır.");
			System.out.println("Çıkış yapılıyor.");
			System.exit(0);
			break;
		default:
			System.out.println("Lütfen listedeki seceneklerden birini giriniz.");
			System.out.println("İşleminiz sonlandırılmıştır.");
			break;
		}
	}
	
	private static void paraGoruntule() {
		String[] data = new String[10];
		data = RetrieveData.DataRetriever();
		System.out.println("Hesabınızda bulunan miktar: " + data[3]);
	}
	
	private static void paraYatır() {
		System.out.println("Lütfen yatırılacak miktarı giriniz: ");
		Scanner sc4 = new Scanner(System.in);
		int miktar = sc4.nextInt();
		sc4.close();
		hesabaParaYatırılıyor(miktar);
		System.out.println("Hesabınıza " + miktar + "Lira yatırılıyor.");

	}
	
	private static void paraCek() {
		String[] data = new String[10];
		data = RetrieveData.DataRetriever();
		System.out.println("Lütfen cekilecek miktarı giriniz: ");
		
		Scanner sc5 = new Scanner(System.in);
		int miktar = sc5.nextInt();
		sc5.close();
		
		if(miktar <= Integer.parseInt(data[3])) {
			System.out.println("Hesabınızdan " + miktar + "çekiliyor.");
			hesaptanParaCekiliyor(miktar);
			//paraGoruntule();
			System.out.println("İşlem tamamlandı. \nKartınızı almayı unutmayınız. ");
		}
		else if (!(miktar <= Integer.parseInt(data[3])) && miktar > 0){
			paraGoruntule();
			System.out.println("İşleminiz gerçekleştirilemiyor.");
		}
		else {
			System.out.println("Lütfen doğru bir miktar giriniz.");
		}
	}
	
	
	private static void hesabaParaYatırılıyor(int miktar) {
		try (FileWriter f = new FileWriter("C:\\Users\\erdi.ozyildirim\\eclipse-workspace\\ATMProject\\src\\logs.txt", true); 
				BufferedWriter b = new BufferedWriter(f); 
				PrintWriter p = new PrintWriter(b);) 
		{ 	
			p.println("\n\nPara Yatırma İşlemi:");
			Date currentTime = new Date();
			p.println(currentTime.toString());
			p.println(miktar+ " Lira tutarındaki para yatırma işlemi başarıyla gerçekleştirilmiştir.");  
		} catch (IOException i) {
			i.printStackTrace(); 
		}
	}
	
	public static void hesaptanParaCekiliyor(int miktar) {
		DataManipulator.dataManipulator(miktar);
		try (FileWriter f = new FileWriter("C:\\Users\\erdi.ozyildirim\\eclipse-workspace\\ATMProject\\src\\logs.txt", true); 
				BufferedWriter b = new BufferedWriter(f); 
				PrintWriter p = new PrintWriter(b);) 
		{ 	
			p.println("\n\nPara Çekme İşlemi:");
			Date currentTime = new Date();
			p.println(currentTime.toString());
			p.println(miktar+ " Lira tutarındaki para çekme işlemi başarıyla gerçekleştirilmiştir.");
		} catch (IOException i) {
			i.printStackTrace(); 
		}
	}
	
	public static void fakeMail() {
		
	}
	
}
