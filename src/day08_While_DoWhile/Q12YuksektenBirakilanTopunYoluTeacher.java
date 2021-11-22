package day08_While_DoWhile;

import java.util.Scanner;

public class Q12YuksektenBirakilanTopunYoluTeacher {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("topun birakildigi ilk yuksekligi  giriniz : ");
		double yukseklik = scan.nextDouble();
		double topunToplamYolu = 0;
		int yerevurmaSayisi = 0;
		do {
			yerevurmaSayisi++;
			topunToplamYolu += yukseklik;
			yukseklik *= (0.75);
			topunToplamYolu += yukseklik;
		} while (yukseklik >= 1);
		System.out.println("topun vurma sayisi:" + yerevurmaSayisi);
		System.out.println("topunaldigi toplam yol : " + topunToplamYolu);
		scan.close();
	}
}
