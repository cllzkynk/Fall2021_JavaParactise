package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08_MiniMarket {
	/*
	 * Problem tanimi : 
	 * 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin
	 */
	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);

		System.out.println("Lutfen aldiginiz urunun adedini giriniz");
		int adet = giris.nextInt();

		System.out.println("Lutfen aldiginiz urunun liste fiyatini giriniz");
		double price = giris.nextDouble();
		double totalPrice;

		System.out.println("Musteri kartiniz var mi? Varsa Y yoksa N tusuna basiniz");
		char card = giris.next().toLowerCase().charAt(0);

		if (card == 'y') {
			if (adet > 10) {
				price *= 0.8;
				totalPrice = price * adet;
				System.out.println("%20 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + totalPrice);
			} else {
				price *= 0.85;
				totalPrice = price * adet;
				System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + totalPrice);
			}

		} else if (card == 'n') {
			if (adet > 10) {
				price *= 0.85;
				totalPrice = price * adet;
				System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + totalPrice);

			} else {
				price = price - price * 10 / 100;
				totalPrice = price * adet;
				System.out.println("%10 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + totalPrice);
			}
		} else {
			System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz");
		}

		giris.close();
	}
}
