package day07_ForLoop;

import java.util.Scanner;

public class Q18_SayilarlaUcgen {

	public static void main(String[] args) {

//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21
//        22 23 24 25 26 27 28
//        29 30 31 32 33 34 35 36    seklini konsola yazdiriniz.

		int sayac = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir boyut gir ");
		int boyut = scan.nextInt();

		for (int i = 1; i <= boyut; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print((" " + sayac) + " ");
				sayac++;

			}
			System.out.println();
		}

		scan.close();
	}
}
