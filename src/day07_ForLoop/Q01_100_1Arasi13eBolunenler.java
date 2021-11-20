package day07_ForLoop;

import javax.swing.JOptionPane;

public class Q01_100_1Arasi13eBolunenler {
	/*
	 * 
	 * sayaci ritmik ilerleyen ve adim sayisi belli ise FOR kullanilir. DEÄ?Ä°LSE
	 * While kullanilir, Eger donguye bir kez mutlaka girilecekse DO_WHILE
	 * kullanilir.
	 * 
	 * Problem Tanimi 100'den 0'a kadar 13'e tam bolunebilen sayilari ve
	 * toplamlarini ekrana yazdiriniz (buyukten kucuge).
	 * 
	 * Ekran Ciktisi 91 78 65 52 39 26 13
	 */
	public static void main(String[] args) {
String msj="IYI ISTI";
		int toplam = 0;
		for (int i = 100; 0 <= i; i--) {

			if (i % 13 == 0) {
				System.out.println("13`e tam bolunen sayilar : " + i);
				toplam += i;
				System.out.println();
			}
		}
		JOptionPane.showInputDialog(msj,"Toplam  : " + toplam);
	}
}
