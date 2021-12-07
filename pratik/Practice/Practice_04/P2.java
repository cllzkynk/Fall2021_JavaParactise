package Practice.Practice_04;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// Kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz...
		// ad ayri soyad ayri sekilde ekrana yazdiriniz.

		Scanner scanner = new Scanner(System.in);
		System.out.println("adinizi soyadinizi giriniz : ");
		String adSoyad = scanner.nextLine();// mustafa can

		String ad = adSoyad.substring(0, adSoyad.indexOf(" "));
		String soyad = adSoyad.substring(adSoyad.indexOf(" ") + 1);
		System.out.println("adiniz : " + ad + " soyadiniz : " + soyad);
		
		scanner.close();
	}
}