package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10_EhliyetTrafikCeza {
	public static void main(String[] args) {

		/*
		 * Problem tanimi : Kulanicidan aracacinin hizini aliniz Trafik cezasinin
		 * degerini hesaplayin. 45 hiz siniridir. Eger Hiziniz 55-74 arasinda ise: Ceza
		 * 100 $'dir.
		 *
		 * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
		 *
		 * Eger Hiziniz85 -94 arainda ise: Ceza 320 $'dir.
		 *
		 * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
		 *
		 * ve ayrica, Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
		 *
		 * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
		 *
		 * -----------------------------------------
		 *
		 * Orn;
		 *
		 * currentSpeed(Hiziniz) 87 ve isDriverLicenceAvailable(Ehliyeti var mi) = true;
		 *
		 * sonuc 320 olmalidir.
		 *
		 * currentSpeed(Hiziniz) 65 ve isDriverLicenceAvailable(Ehliyeti var mı?) =
		 * false;
		 *
		 * sonuc 300 olmalidir.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println(" Aracinin Hizini Giriniz\nEhliyet Varsa" + "E Yoksa H ye Basiniz");
		if (scan.hasNextInt()) {
			int hiz = scan.nextInt();
			char ehliyet = scan.next().toUpperCase().charAt(0);
			if (ehliyet == 'E' && hiz <= 45) {
				System.out.println(" Iyi Yolculuklar ");
				scan.close();
				return;
			}

			if (ehliyet == 'E') {// ehliyet var ise

				if (hiz > 45) {
					if (hiz >= 55 && hiz <= 74) {
						System.out.println(" Ceza 100 $'dir.");
					} else if (hiz >= 75 && hiz <= 84) {
						System.out.println(" Ceza 150 $'dir.");
					} else if (hiz >= 85 && hiz <= 94) {
						System.out.println(" Ceza 320 $'dir.");
					} else if (hiz > 94) {
						System.out.println(" Ceza 500 $'dir.");
					} else {
						System.out.println("Trafik Kurallarina Uydugun Icin" + "Tesekkurler 500$ Kazandin!!!");
					}
				}

			} else {// ehliyet yok ise
				if (ehliyet == 'H' && hiz <= 45) {
					System.out.println(" Git Ehliyet Bu seferlik idare edelim Iyi Yolculuklar");
					scan.close();
					return;
					
				}
				if (hiz > 45) {
					if (hiz >= 55 && hiz <= 74) {
						System.out.println(" Ceza 300 $'dir.");
					} else if (hiz >= 75 && hiz <= 84) {
						System.out.println(" Ceza 350 $'dir.");
					} else if (hiz >= 85 && hiz <= 94) {
						System.out.println(" Ceza 520 $'dir.");
					} else if (hiz > 94) {
						System.out.println(" Ceza 700 $'dir.");
					} else {
						System.out.println("Trafik Kurallarina Uydugun Icin" + "Tesekkurler 500$ Kazandin!!!");
					}
				}
			}

		} else {
			System.out.println("Hizini Kontrol Et Int Tam Sayi Gir!");
		}
		scan.close();
	}
}
