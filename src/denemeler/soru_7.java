package denemeler;

import java.util.Scanner;

public class soru_7 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Rakam degerleri toplanacak sayiyi giriniz:");
		
		int sayi = scan.nextInt();
		
		int toplam =0;
		int rakam =0;
		
		
		while (sayi>0) {
			
			rakam = sayi%10;
			toplam+=rakam;
			sayi/=10;
			
		}
		
		System.out.println(toplam);
		
		
		
		
	scan.close();	

	}

}
