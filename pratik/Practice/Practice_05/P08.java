package Practice.Practice_05;

import java.util.Scanner;

public class P08 {

	public static void main(String[] args) {
		/*
		 * belirli bir(kullanici girecek) yukseklikten bir top serbest dusme ile
		 * birakilmaktadir. top serbest birakildiktan sonra surekli birakildigi
		 * yuksekligin % 75 'i kadar zeminden yukari dogru ziplamaktadir...
		 * Top ziplama yuksekligi 1 metrenin altina indiginde olay sonlandirilmaktadir. Bu ana kadar
		 * topun toplam aldigi yolu ve topun zemine vurma sayisini bulunuz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("topun birakilacagi yuksekligi giriniz : ");
		double birakilanYukseklik = scan.nextDouble();
		double toplamYol = birakilanYukseklik;
		int vurmaSayisi = 0;
		while (birakilanYukseklik >= 1) {
			birakilanYukseklik *= 3 / 4;
			toplamYol += birakilanYukseklik * 2;
			vurmaSayisi++;
		}
		System.out.println("topun zemine vurma sayisi :" + vurmaSayisi);
		System.out.println("topu toplam aldidi yol  " + toplamYol);
		
		scan.close();
		
	}

}
