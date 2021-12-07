package Practice.Practice_01;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar
		 * ve yuzler basamagi olarak yazdirin
		 * 
		 * 
		 * Ornek : Inputs : 853 Output : Girdiginiz sayinin birler basamagi : 3
		 * Girdiginiz sayinin onlar basamagi : 5 Girdiginiz sayinin yuzler basamagi : 8
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("lutfen 3 basamakli bir sayi giriniz :");
		int sayi = scan.nextInt();

		int birler = sayi % 10;
		int onlar = sayi / 10 % 10;
		int yuzler = sayi / 100;
		System.out.println("girdiginiz sayinin birler basamagi : " + birler);

		System.out.println("girdiginiz sayinin onlar basamagi : " + onlar);

		System.out.println("girdiginiz sayinin yuzler basamagi : " + yuzler);
		System.out.println(
				"girdiginiz sayinin birler basamagi : " + birler + "\n" + "girdiginiz sayinin onlar basamagi : " + onlar
						+ "\n" + "girdiginiz sayinin yuzler basamagi : " + yuzler);

		scan.close();
	}

}
