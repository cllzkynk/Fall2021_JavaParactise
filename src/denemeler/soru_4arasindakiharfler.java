package denemeler;

import java.util.Scanner;

public class soru_4arasindakiharfler {

	public static void main(String[] args) {

		/*
		 * Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden
		 * baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
		 * Kullanicinin hata yapmadigini farz edin.
		 */

		Scanner scan = new Scanner(System.in);
		
		String yazi ="";
		System.out.println("Baslangic ve bitis harflerini giriniz:");
		char bas = scan.next().charAt(0);
		char bitis = scan.next().charAt(0);

		while (bas<=bitis) {
			
			yazi+=bas;
			bas++;
		}
		
		System.out.println(yazi.toUpperCase());
		
		
		
		scan.close();
		
		
		
		
	}

}
