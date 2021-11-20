package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class SitchCaseileNotHesabi {

	public static void main(String[] args) {
		// Kullanicidan notunu alin ve asagidaki kurallara gore ekrana A, B, C veya D
		// yazdirin.
		// 1. 0()dahil ile 50 arasi - D
		// 2. 50(dahil) ile 60 arası - C
		// 3. 60(dahil) ile 80 arası - B
		// 4. 80(dahil) ustu- A
		// Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		// switch() kullanarak yapiniz.

		// switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean
		// kullanilmaz.
		// switch() de int, byte, short, char, String kullanilir.

		Scanner scan = new Scanner(System.in);
		System.out.println("Ltfen 1.vize notunuzu giriniz");
		int v1 = scan.nextInt();
		System.out.println("Ltfen 2.vize notunuzu giriniz");
		int v2 = scan.nextInt();
		System.out.println("Lutfen final notunuzu giriniz");
		int fnl = scan.nextInt();

		int ort = (int) (v1 * 0.25 + v2 * 0.25 + fnl * 0.5); // 67 => 67/10=6,7 sonucu integer ==>6 demekki 60 larda

		switch (ort / 10) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Harf notunuz  : D ");
			break;
		case 5:
			System.out.println("Harf notunuz  : C");
			break;
		case 6:
		case 7:
			System.out.println("Harf notunuz  :B   ");
			break;
		case 8:
		case 9: // notu 90 - 99 arasi olanlari kapsiyor
		case 10:
			System.out.println("Harf notunuz   : A");
			break;
		default:
			System.out.println("Yanlis giris yaptiniz.\nLutfen gecerli not giriniz");
		}
scan.close();
	}

}
