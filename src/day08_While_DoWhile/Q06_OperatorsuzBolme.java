package day08_While_DoWhile;

import java.util.Scanner;

public class Q06_OperatorsuzBolme {
	static int bolum = 0;

	public static void main(String[] args) {
		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		// kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create
		// ediniz.
		Scanner scan = new Scanner(System.in);
		System.out.println("bolunecek bi sayi gir");
		int sayi = scan.nextInt();
		System.out.println("Bolecek bir sayi gir");
		int bolen = scan.nextInt();

		bol(sayi, bolen);
		scan.close();
	}

	public static void bol(int sayi, int bolen) {

		for (int i = 1; i <= sayi; i++) {

			if (i * bolen == sayi || (sayi - (i * bolen)) < bolen) {
				System.out.println("" + sayi + "=" + bolen + "*" + i + "+" + (sayi - (i * bolen)));
				System.out.println("Bolunen : " + sayi);
				System.out.println("Bolen   : " + bolen);
				System.out.println("Bolum   : " + i);
				System.out.println("Kalan   : " + (sayi - (i * bolen)));
				break;
			}

		}
	}

}
