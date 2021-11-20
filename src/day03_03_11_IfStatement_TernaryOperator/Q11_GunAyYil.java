package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11_GunAyYil {

	public static void main(String[] args) {

		/*
		 * Problem Tanimi Kullanicidan bir tarihi gun, ay ve yil seklinde alip bu tarihi
		 * ay, gun, yil ve yil, ay, gun seklinde cevirerek yazan bir kod yaziniz. TRICK:
		 * her else komutundan sonra return; komutu kullaniniz... gun 1-31 arasi girin
		 * Yil= 0 dan kucuk olmasin ay = 12 aydan biri olsun ornek Ekran ciktisi Lutfen
		 * gunu giriniz: 10 Lutfen ayi giriniz: 02 Lutfenyili giriniz: 2009 Gun ay yil:
		 * 10.02.2009 Ay gun yil: 02.10.2009 Yil ay gun: 2009.02.10
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gunu  giriniz");
		if (scan.hasNextInt()) {
			int gun = scan.nextInt();
			if (gun < 1 || gun > 31) {
				System.out.println("Yanlis giris Bir ayin gun sayisi 1-31 arasinda olabilir");
			} else {
				System.out.println("Lutfen ayi giriniz");
				if (scan.hasNextInt()) {
					int ay = scan.nextInt();
					if (ay < 1 || ay > 12) {
						System.out.println("Yanlis giris Ay sayisi 1-12 arasi degerler alabilir");
					} else {
						System.out.println("Lutfen yili giriniz");
						if (scan.hasNextInt()) {
							int yil = scan.nextInt();

							if (yil < 0) {
								System.out.println("M.O makina kaldirmiyor");
							} else {

								System.out.println("Gun Ay Yil: " + gun + "." + ay + "." + yil + "\nAy Gun Yil: " + ay
										+ "." + gun + "." + yil + "\nYil Ay Gun: " + yil + "." + ay + "." + gun);
							}

						}
					}
				} else {
					System.out.println("Yanlis giris Ay sayisi 1-12 arasi degerler alabilir");
				}
			}

		} else {
			System.out.println("Lutfen gunu 1-31 araliginda bir deger giriniz");
		}

		scan.close();
	}
}
