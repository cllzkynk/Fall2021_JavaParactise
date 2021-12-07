package Practice.Practice_05;

import java.util.Scanner;

public class P02 {

	public static void main(String[] args) {
		// Kullanicidan alinan bir stringdeki indexi tek
		// olan karakterleri yazdiriniz.

		Scanner scan = new Scanner(System.in);
		System.out.print("Bir metin giriniz : ");

		String str = scan.nextLine();

		int i = 0;

		do {
			if (i % 2 == 1) {
				System.out.print(str.charAt(i) + ", ");
				// index i tek olan karakterleri yazd�rm�� olaca��z..
			}
			i++;
		} while (i < str.length());

		scan.close();

	}

}
