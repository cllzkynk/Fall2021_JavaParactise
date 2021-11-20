package day01_27_10_Odevler;

import java.util.Scanner;

public class Q4_YolZamanHizHesabi {

	public static void main(String[] args) {
		/*
		 * Problem Tanýmý Mesafeyi ve hýzý alýp süreyi hesaplayan bir kod yazýnýz.
		 * Örneðin:Ýstanbul ile Ankara arasý 400km olarak ölçülmektedir. Bu yolu 4
		 * saatte alan aracin ortalama hizi nedir
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gidilen mesafeyi km cinsinden giriniz");
		double yol = scan.nextDouble();
		System.out.println("Lutfen yolculuk surenizi saat cinsinden giriniz");
		double zaman = scan.nextDouble();

		System.out.println("Yolculuk boyunca ortalama hiziniz  :  " + (yol / zaman));

		scan.close();

	}

}
