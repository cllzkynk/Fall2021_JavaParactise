package day08_While_DoWhile;

import java.util.Scanner;

public class MiniMarket {

	/**
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun Musteri karti varsa ve 10 urunden fazla
	 * alirsa %20, yoksa %15 indirim yapin Musteri karti yoksa ve 10 urunden fazla
	 * alirsa %15, 10 urunden az alirsa %10 indirim yapin Musteri kart bilgisini
	 * yanlis girerse alisverise baslatmadan tekrar sorunuz. alisveris sonunda
	 * alisverise devam etmeyecegini sorup devam edecekse tekrar alis veris yaptirip
	 * ilk alisverisinden alinan urunleri de dikkate alarak 10 ve uzeri ise son
	 * toplami 10dan az veya fazla olma sartina gore indirim uygulayiniz
	 */

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in); // scanner in ismi scan olmak zorunda degil

		System.out.println("𝕋 𝔼 ℂ ℍ ℙ ℝ 𝕆 𝔼 𝔻 ` 𝔼  ℍ 𝕆 𝕊 𝔾 𝔼 𝕃 𝔻 𝕀 ℕ 𝕀 ℤ");

		boolean karar = true;
		int toplamUrun = 0;

		char card = 'x';
		double sonfiyat = 0;
		int sonadet = 0;
		// int araadet=0;
		// double arafiyat=0;
		// int sayac=1;

		System.out.println(
				"Lutfen musteri kartiniz varsa E yoksa H giriniz\nAlisveris sonunda kart durumuna gore kasada indirim uygulanacaktir");
		do {
			// System.out.println("Lutfen musteri kartiniz varsa E yoksa H
			// giriniz\nAlisveris sonunda kart durumuna gore kasada indirim
			// uygulanacaktir");
			char cardKontrol = giris.next().toUpperCase().charAt(0);

			if (cardKontrol == 'E' || cardKontrol == 'H') {
				card = cardKontrol;
				break;
			} else {
				System.out.println("Lutfen card sahipligi bilginizi evet icin  E ve hayir icin H seklinde giriniz");
			}

		} while (card != 'E' || card != 'H');

		// System.out.println(card);

		if (card == 'E') {

			do {
				int quantity = 0;
				double fiyat = 0;
				System.out.println("Lutfen aldiginiz urunun adedini giriniz");
				quantity = giris.nextInt();

				System.out.println("Lutfen aldiginiz urunun fiyatini giriniz");
				double price = giris.nextInt();

				sonfiyat = sonfiyat + (price * quantity);

				sonadet += quantity;

				if (quantity >= 10) {

					fiyat = quantity * price;

					System.out.println("Urun sayisi " + quantity + " mevcut sepetin tutari " + fiyat
							+ " Tl  .Urun sayisi 10 adet ve  uzeri oldugu icin kasada %20 indirim uygulanacaktir ");

				} else if (quantity < 10) {

					fiyat = quantity * price;

					System.out.println("Urun sayisi " + quantity + " mevcut sepetin tutari " + fiyat
							+ " TL  .Urun sayisi 10 adetten az oldugu icin kasada %15 indirim uygulanacaktir ");

				}

				char carar = 'x';
				System.out.println("\nAlisverise devam etmek istiyormusunuz\nEvet icin E Hayir icin H giriniz");
				do {
					// System.out.println("\nAlisverise devam etmek istiyormusunuz\nEvet icin E
					// Hayir icin H giriniz");
					carar = giris.next().toUpperCase().charAt(0);
					if (carar == 'H') {
						karar = false;
						if (sonadet < 10) {
							System.out.println("Toplam tutar : " + sonfiyat * 0.85);
							System.out.println(
									"𝓣𝓔𝓒𝓗𝓟𝓡𝓞𝓔𝓓`𝓘 𝓣𝓔𝓡𝓒𝓘𝓗 𝓔𝓣𝓣𝓘𝓖𝓘𝓝𝓘𝓩 𝓘𝓒𝓘𝓝 𝓣𝓔𝓢𝓔𝓚𝓚𝓤𝓡 𝓔𝓓𝓔𝓡𝓘𝓩");
							break;

						} else {
							System.out.println("Toplam tutar : " + sonfiyat * 0.80);
							System.out.println(
									"𝓣𝓔𝓒𝓗𝓟𝓡𝓞𝓔𝓓`𝓘 𝓣𝓔𝓡𝓒𝓘𝓗 𝓔𝓣𝓣𝓘𝓖𝓘𝓝𝓘𝓩 𝓘𝓒𝓘𝓝 𝓣𝓔𝓢𝓔𝓚𝓚𝓤𝓡 𝓔𝓓𝓔𝓡𝓘𝓩");
							break;
						}
					} else if (carar == 'E') {
						break;
					} else if (carar != 'E' || carar != 'H') {
						System.out.println("Lutfen devam etmek icin E sonlandirmak icin H girisi yapiniz");
					}
				} while (carar != 'E' || carar != 'H');
			} while (karar);
		} else if (card == 'H') {

			do {
				int quantity = 0;
				double fiyat = 0;
				System.out.println("Lutfen aldiginiz urunun adedini giriniz");
				quantity = giris.nextInt();
				toplamUrun = toplamUrun + quantity;

				System.out.println("Lutfen aldiginiz urunun fiyatini giriniz");
				double price = giris.nextInt();
				fiyat = quantity * price;

				sonfiyat = sonfiyat + (price * quantity);

				sonadet += quantity;

				if (quantity >= 10) {

					fiyat = quantity * price;

					System.out.println("Urun sayisi " + quantity + " mevcut sepetin tutari " + fiyat
							+ " Tl  .Urun sayisi 10 adet ve  uzeri oldugu icin kasada %15 indirim uygulanacaktir ");

				} else if (quantity < 10) {

					fiyat = quantity * price;

					System.out.println("Urun sayisi " + quantity + " mevcut sepetin tutari " + fiyat
							+ " TL  .Urun sayisi 10 adetten az oldugu icin kasada %10 indirim uygulanacaktir ");

				}
				char carar = 'x';
				System.out.println("\nAlisverise devam etmek istiyormusunuz\nEvet icin E Hayir icin H giriniz");
				do {
					// System.out.println("\nAlisverise devam etmek istiyormusunuz\nEvet icin E
					// Hayir icin H giriniz");
					carar = giris.next().toUpperCase().charAt(0);
					if (carar == 'H') {
						karar = false;

						if (sonadet < 10) {
							System.out.println("Toplam tutar : " + sonfiyat * 0.90);
							System.out.println(
									"𝓣𝓔𝓒𝓗𝓟𝓡𝓞𝓔𝓓`𝓘 𝓣𝓔𝓡𝓒𝓘𝓗 𝓔𝓣𝓣𝓘𝓖𝓘𝓝𝓘𝓩 𝓘𝓒𝓘𝓝 𝓣𝓔𝓢𝓔𝓚𝓚𝓤𝓡 𝓔𝓓𝓔𝓡𝓘𝓩");
							break;

						} else {
							System.out.println("Toplam tutar : " + sonfiyat * 0.85);
							System.out.println(
									"𝓣𝓔𝓒𝓗𝓟𝓡𝓞𝓔𝓓`𝓘 𝓣𝓔𝓡𝓒𝓘𝓗 𝓔𝓣𝓣𝓘𝓖𝓘𝓝𝓘𝓩 𝓘𝓒𝓘𝓝 𝓣𝓔𝓢𝓔𝓚𝓚𝓤𝓡 𝓔𝓓𝓔𝓡𝓘𝓩");
							break;
						}

					} else if (carar == 'E') {
						break;
					} else if (carar != 'E' || carar != 'H') {
						System.out.println("Lutfen devam etmek icin E sonlandirmak icin H girisi yapiniz");
					}
				} while (carar != 'E' || carar != 'H');

			} while (karar);
		}

		System.out.println();
		giris.close();
	}

}
