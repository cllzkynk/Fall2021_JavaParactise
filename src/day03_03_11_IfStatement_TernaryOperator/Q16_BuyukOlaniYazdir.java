package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q16_BuyukOlaniYazdir {
	/*
	 * Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk
	 * olanlarini konsola yazdiriniz int num1 int num2 int num3
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Siralama icin lutfen sirasiyla uc tamsayi giriniz \n1.sayi : ");
		int s1 = input.nextInt();
		System.out.println("2.sayi : ");
		int s2 = input.nextInt();
		System.out.println("3.sayi : ");
		int s3 = input.nextInt();

		// if le kolay ternary ile zorlayalim

		System.out.println((s1 > s2 && s1 > s3 && s3 < s2) ? "1.sayi en buyuktur ve 3. sayi en kucuktur"
				: (s1 > s2 && s1 > s3 && s3 > s2) ? "1.sayi en buyuktur ve 2. sayi en kucuktur"
						: (s2 > s1 && s2 > s3 && s1 < s3) ? "2.sayi en buyuktur ve 1. sayi en kucuktur"
								: s2 > s1 && s2 > s3 && s1 > s3 ? "2.sayi en buyuktur ve 1. sayi en kucuktur"
										: s1 > s2 && s2 == s3 ? "1.sayi buyuk olandir 2. ve 3. sayilar esittir"
												: s2 > s1 && s1 == s3 ? "2. sayi buyuk olandir 1. ve 3. sayilar esittir"
														: s3 > s1 && s1 == s2 ? "3.sayi buyuk olandir 1.  ve 2 . sayilar esittir"
																: "Sayilarin ucude birbirine esittir");

		input.close();

	}
}
