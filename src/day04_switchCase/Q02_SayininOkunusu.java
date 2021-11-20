package day04_switchCase;

import java.util.Scanner;

public class Q02_SayininOkunusu {
	public static void main(String[] args) {
		/*
		 * SORU 2
		 * 
		 * Kullanicidan 3 basamakli bir sayi alip sayinin okunusunu yazdirin
		 * 
		 * Input : 356 Output : Ucyuzellialti
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen uc basamakli bir sayi giriniz");
		int number = scan.nextInt();
		int yuzler = number / 100, onlar = number / 10 % 10, birler = number % 10;
		// System.out.println(yuzler + " " + onlar + birler);
		if (number > 99 && number < 1000) {
			switch (yuzler) {
			case 1:
				System.out.print("yuz ");
				break;
			case 2:
				System.out.print("ikiyuz ");
				break;
			case 3:
				System.out.print("ucyuz ");
				break;
			case 4:
				System.out.print("dortyuz ");
				break;
			case 5:
				System.out.print("besyuz ");
				break;
			case 6:
				System.out.print("altiyuz ");
				break;
			case 7:
				System.out.print("yediyuz ");
				break;
			case 8:
				System.out.print("sekizyuz ");
				break;
			case 9:
				System.out.print("dokuzyuz ");
				break;
			}
			switch (onlar) {
			case 0:
				System.out.print("");
				break;
			case 1:
				System.out.print("on ");
				break;
			case 2:
				System.out.print("yirmi ");
				break;
			case 3:
				System.out.print("otuz ");
				break;
			case 4:
				System.out.print("kirk ");
				break;
			case 5:
				System.out.print("elli ");
				break;
			case 6:
				System.out.print("altmis ");
				break;
			case 7:
				System.out.print("yetmis ");
				break;
			case 8:
				System.out.print("seksen ");
				break;
			case 9:
				System.out.print("doksan ");
				break;
			}
			switch (birler) {
			case 0:
				System.out.print("");
				break;
			case 1:
				System.out.print("bir ");
				break;
			case 2:
				System.out.print("iki ");
				break;
			case 3:
				System.out.print("uc ");
				break;
			case 4:
				System.out.print("dort");
				break;
			case 5:
				System.out.print("bes ");
				break;
			case 6:
				System.out.print("alti ");
				break;
			case 7:
				System.out.print("yedi ");
				break;
			case 8:
				System.out.print("sekiz ");
				break;
			case 9:
				System.out.print("dokuz ");
				break;
			}

		} else {
			System.out.println("Lutfen 3 basamakli girin");
		}
		scan.close();

	}
}
