package day01_27_10_Odevler;

import java.util.Scanner;

public class Q4_YolZamanHizHesabi {

	public static void main(String[] args) {
		/*
		 * Problem Tan�m� Mesafeyi ve h�z� al�p s�reyi hesaplayan bir kod yaz�n�z.
		 * �rne�in:�stanbul ile Ankara aras� 400km olarak �l��lmektedir. Bu yolu 4
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
