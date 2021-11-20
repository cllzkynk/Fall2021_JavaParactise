package denemeler;

import java.util.Scanner;

public class soru_6 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
		 * olduklarini ekranda yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi =scan.nextInt();
		
		
		int bolen=1;
		int sayac=0;
		while (bolen<=sayi) {
			
			if (sayi%bolen==0) {
				System.out.print(bolen+" ");
				sayac++;
			}
			
			bolen++;
		}
		System.out.println("");
		System.out.println("Toplam "+ sayac+ " tane pozitif tam boleni var.");
		
		
		
		
		
		
		
		scan.close();
		
	}

}
