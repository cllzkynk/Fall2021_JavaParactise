package day08_While_DoWhile;

import java.util.Scanner;

public class Q14FaktoriyelRecursive {

	public static void main(String[] args) {
		/*
		 * Problem Tanimi Verilen bir sayinin faktoriyelini ozyineli (recursive) olarak
		 * hespalayan fonksiyonu yaziniz.
		 * 
		 * Örnek Ekran Çiktilari Bir sayi giriniz: 6 Faktoriyeli: 720
		 * 
		 * Bir sayi giriniz: 3 Faktoriyeli 6
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Faktoriyeli bulunacak sayiyi gir");
		int sayi = scan.nextInt();

		System.out.println(faktoriyel(sayi));

		scan.close();
	}

	private static int faktoriyel(int sayi) {
		if (sayi == 1)
			return 1;
		return sayi * faktoriyel(sayi - 1);
	}
}
