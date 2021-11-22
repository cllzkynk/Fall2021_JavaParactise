package day08_While_DoWhile;

import java.util.Scanner;

public class Q10Maxin5Number {

	public static void main(String[] args) {
		// Kullanicidan 5 sayi isteyiniz, bu sayilardan en buyugunu bularak
		// yazdiriniz.

		Scanner scan = new Scanner(System.in);
	System.out.println("sirayla 5 sayi gir sayi gir entere bas");

		int buyuk = 0;

		for (int i = -4; i <= 0; i++) {
			int s1 = scan.nextInt();
			if (s1 > buyuk) {
				buyuk = s1;

			}
		}
		System.out.println("Girilen en buyuk sayi : " + buyuk);
scan.close();
	}
}
