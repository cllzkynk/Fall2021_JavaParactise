package Practice.Practice_12_Encapsule01;

import java.util.Scanner;

public class AnaMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		Ana obj1=new Ana();
		System.out.println(obj1.getAd()); // Ahmet
		System.out.println(obj1.getYas()); // 40
		System.out.println(obj1.adres); // Ankara
		
		/*
		System.out.println("Lutfen bir ad giriniz : ");
		obj1.setAd(scan.nextLine());

		System.out.println("Lutfen bir yas giriniz : ");
		obj1.setYas(scan.nextInt());
		*/
	
		System.out.println("~~~~~~~~~");
		
		Ana obj2=new Ana("Ali",25,"Bolu");
		
		System.out.println(obj2.getAd());
		System.out.println(obj2.getYas());
		System.out.println(obj2.adres);
		
		// toString(); ana menude kullanmadan yazarsam referans numarasi gonderir...
		
		System.out.println(obj1.toString()); // Ana [ad=Ahmet, yas=40, adres=Ankara]
		System.out.println(obj2.toString()); // Ana [ad=Ali, yas=25, adres=Bolu]
		
		scan.close();
	}

}
