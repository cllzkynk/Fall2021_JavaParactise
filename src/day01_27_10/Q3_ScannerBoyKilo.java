package day01_27_10;

import java.util.Scanner;

public class Q3_ScannerBoyKilo {

	public static void main(String[] args) {

		/*Soru 1
		 * kullanicinin ad soyad yas boy kilosunu alt alata yazdiriniz
		 */
		System.out.println("_______________Soru-1_____________\n");
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen ad soyad yas boy ve kilonuzu  sirasiyla giriniz");
		String ad=scan.next();
		String soyAd=scan.next();
		short yas=scan.nextShort();
		double boy=scan.nextDouble();
		double kilo=scan.nextDouble();	
System.out.println("Adi: "+ad+"\nSoyadi: "+soyAd+"\nYas: "+yas+"\nBoy: "+boy+"  cm"+"\nKilo: "+kilo+"  kg");
	
		scan.close();
		
		
	}

}
