package day08_While_DoWhile;

import java.util.Scanner;

public class Q11TamKare {

	/*
	 * Girilen pozitif bir sayinin tam kare olup olmadigini bulunuz, tamkare ise
	 * true degilse false yazdiriniz.
	 * 
	 * Not: sqrt gibi fonksiyonlari kullanmayin.
	 * 
	 * Example 1: Input: 16 Output: true Not: bu sayi tamkare çünkü 4*4 = 16
	 * 
	 * Example 2: Input: 25 Output: true Note: bu sayi tamkare çünkü 5*5=25
	 * 
	 * 
	 * Example 3: Input: 14 Output: false
	 * 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Tamkareligi kontrol edilecek sayiyi gir");
		int sayi = scan.nextInt();
		int i = 0;
		boolean flag = false;
		scan.close(); 
		for (i = 0; i < sayi / 2; i++) {
			if (i * i == sayi) {
				flag = true;
				break;
			}

		}

		if (flag) {
			System.out.println("Girilen sayi tam karedir\n" + i + "*" + i + "=" + sayi);
		} else {
			System.out.println("Girilen sayi tam kare degildir");
		}

	

	}
}
