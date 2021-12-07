package Practice.Practice_05;

import java.util.Scanner;

public class P06 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan alinan bir sayinin basamak degerlerinin toplamini while loop ile
		 * hesaplayan bir method yaziniz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz : ");
		int sayi = scan.nextInt();

		int i = sayi;
		int rakamlarToplami = 0;
		int rakam = 0;

		while (i > 0) {

			rakam = i % 10;
			rakamlarToplami += rakam;
			i /= 10;

		}

		System.out.println("Girdiginiz " + sayi + " sayisinin rakamlar toplami : " + rakamlarToplami);
		scan.close();
	}

	/*
	 * do while ile de soyle olur...
	 * 
	 * Scanner scan = new Scanner(System.in);
	 * System.out.print("Lutfen bir sayi giriniz : "); 
	 * 
	 * int sayi = scan.nextInt();
	 * 
	 * rakamTopla(sayi);
	 * 
	 * }
	 * 
	 * private static int rakamTopla(int sayi) { 
	 * 
	 * int toplam=0;
	 * 
	 * do { 
	 * toplam+=sayi%10; 
	 * sayi/=10; 
	 * } while (sayi>0);
	 * 
	 * System.out.println("girdiginiz sayinin rakamlar toplami : "+toplam); 
	 * 
	 * return toplam;
	 */

}
