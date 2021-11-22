package denemeler;

import java.util.Scanner;

public class soru_5carpimtablosu {

	public static void main(String[] args) {

		/*
		 * Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana
		 * yazdirin. Kullanicinin hata yapmadigini farz edin. Ornegin kullanici 3
		 * girerse; 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz.(0-9)");

		int rakam = scan.nextInt();

		int carpim = 1;
		int sonuc = 1;

		while (carpim <= 10) {

			sonuc = rakam * carpim;

			System.out.print(rakam + "x" + carpim + "=" + sonuc + " ");

			carpim++;
		}
		
		
scan.close();
	}

}
