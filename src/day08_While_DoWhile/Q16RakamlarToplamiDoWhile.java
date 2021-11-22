package day08_While_DoWhile;

import java.util.Scanner;

public class Q16RakamlarToplamiDoWhile {
    public static void main(String[] args) {

        // --------GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();

		System.out.println(basamakToplama(sayi));

scan.close();	}

	public static int basamakToplama(int sayi) {
		
		int toplam =0;
	do {
		toplam+=sayi%10;
		sayi/=10;
		
	} while (sayi!=0);
		return toplam;
		
	}
}
