package Practice.Practice_04;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// Kullanicidan alacaginiz, 3 kelimedne olusan ismi
		// Orn. Ahmet Emin Yilmaz -> A.E.Y. formatiyla yazdiriniz...
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("adinizi soyadiniz giriniz : ");
		String adSoyad = scanner.nextLine();// hakan tetik javaci

		String name1 = adSoyad.substring(0, adSoyad.indexOf(" "));
		String name2 = adSoyad.substring(adSoyad.indexOf(" ") + 1, adSoyad.lastIndexOf(" "));
		String soyadString = adSoyad.substring(adSoyad.lastIndexOf(" ") + 1);

		char n1 = name1.charAt(0);
		char n2 = name2.charAt(0);
		char n3 = soyadString.charAt(0);

		System.out.println("adiniz : " + name1 + " ikinci adiniz : " + name2 + " soyadiniz : " + soyadString);
		System.out.println(n1 + ". " + n2 + ". " + n3 + ".");
		
		scanner.close();
	}
}