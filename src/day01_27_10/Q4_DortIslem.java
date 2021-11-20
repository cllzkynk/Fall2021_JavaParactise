package day01_27_10;

import java.util.Scanner;

public class Q4_DortIslem {

	public static void main(String[] args) {
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin dort islem sonucunu yazdiriniz.
		System.out.println("Ýki tam sayý gir");
		Scanner scan = new Scanner(System.in);
		int ilk = scan.nextInt();
		int ikinci = scan.nextInt();
		System.out.println("Toplam: " + (ilk + ikinci));
		System.out.println("Çarpým: " + ilk * ikinci);
		System.out.println("Bölüm:  " + ((double) ilk / ikinci));
		System.out.println("Farklarý: " + (ilk - ikinci));
		scan.close();
	}

}
