package Practice.Practice_01;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {

		/*
		 * Problem Tanimi Mesafeyi ve hizi alip sureyi hesaplayan
		 * bir kod yaziniz.
		 * Ornegin:istanbul ile Ankara arasi 400km olarak belirtilmektedir.
		 * Bu yolu ortalama 120 km/saat hizla giden bir arac
		 * ne kadar surede hedefe varir?

		 * Ornek Ekran ciktisi Mesafeyi giriniz: 400
		 * Hizi giriniz: 100
		 * Sure 4 saattir.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Gittiginiz mesafeyi giriniz : ");
		double mesafe = scan.nextDouble();

		System.out.print("Hizinizi giriniz : ");
		double hiz = scan.nextDouble();

		double sure = mesafe / hiz;
		System.out.println("Yolculuk sureniz :" + sure);

		scan.close();
	}
}
