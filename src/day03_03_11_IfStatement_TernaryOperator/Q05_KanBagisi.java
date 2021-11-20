package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05_KanBagisi {

	public static void main(String[] args) {
		// Kullanicidan yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");

		if (scan.hasNextInt()) {
			int yas = scan.nextInt();

			if (yas > 18) {
				System.out.println("Lutfen kilonuzu giriniz");
				if (scan.hasNextInt()) {

					int kilo = scan.nextInt();
					if (kilo < 50) {
						System.out.println("Sinirin altindaki kilonuzdan dolayi Kan bagisi yapamazsiniz");
					} else {
						System.out.println("Kan bagisi icin uygunsunuz");
					}

				} else {
					System.out.println("Lutfen kilonuzu tam sayi olacak sekilde giriniz");
				}

			} else {
				System.out.println("18 yasindan kucuklerden kan bagisi kabul edemiyoruz");
			}

		} else {
			System.out.println("Lutfen yasinizi tam sayi olacak sekilde giriniz");
		}
scan.close();
	}

}
