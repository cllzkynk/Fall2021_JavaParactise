package day08_While_DoWhile;

import java.util.Scanner;

public class Q18CheckPasswordMyself {
	public static void main(String[] args) {

		// TODO STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod
		// yazınız.

		Scanner scan = new Scanner(System.in);
		System.out.print("pin code  giriniz : ");
		int userPin = scan.nextInt();
		int systemPin = 1453;
		int count = 1;
		while (userPin != systemPin && count < 4) {
			System.out.println("*****   hatali giris yapildi *****");
			System.out.println("*****   agam bidaha dene *****");
			userPin = scan.nextInt();
			count++;
		}

		if (count == 4) {
			System.out.println("Oyuncak mi laa bu ");
		} else {
			System.out.println("gayet basarili....");
		}
		scan.close();

	}

}
