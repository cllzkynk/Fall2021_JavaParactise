package day08_While_DoWhile;

import java.util.Scanner;

public class Q19ArasiteklerDowhile {

	public static void main(String[] args) {
		/*
		 * Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana
		 * yazdırınız. girilen sayı dahil
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic sinirini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitis sinirini giriniz");
		int bit = scan.nextInt();
		int kontrol = bas;
		if (bas > bit) {
			bas = bit;
			bit = kontrol;
		}

		do {
			if (kontrol % 2 == 1) {
				System.out.print(kontrol + " ");
			}
			kontrol++;
		} while (kontrol <= bit);

		scan.close();

	}
}
