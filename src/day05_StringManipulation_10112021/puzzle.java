package day05_StringManipulation_10112021;

import java.util.Scanner;

public class puzzle {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen isimnizi \nenterle soyısmınızı gırın");
		String isim = scan.next();
		String soyisim = scan.next();
		System.out.println("lutfen kredı karınızınız 16 hanelık rakamını gırınız");
		String kkno = scan.next();

		if (kkno.length() != 16) {
			System.out.println("geçerli bir şifre giriniz");

		}

		String kontrol = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		String kontrol1 = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
		String kontrol2 = kkno.substring(0, 12).replaceAll("\\d", "*");
		String kontrol3 = kkno.substring(12);

		System.out.println(kontrol + "\n" + kontrol1 + "\n" + kontrol2 + kontrol3);

		scan.close();

	}
}