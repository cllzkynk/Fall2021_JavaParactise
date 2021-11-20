package day06_Method_Creation;

import java.util.Scanner;

public class Q06_TekrarsizChars {

	/*
	 * Problem tanimi : Bir String icindeki tum karakterleri en fazla bir kez
	 * yazdiran parametreli bir method yaziniz. Test Data: input: "aabbcccccddddaaa"
	 * output: abcd
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(" bir string gir bakiim ");
		String cumle = scan.nextLine();

		tekle(cumle);

		scan.close();
	}

	public static void tekle(String cumle) {
		String tekler = "";
		for (int i = 0; i < cumle.length(); i++) {
			if (!tekler.contains(cumle.substring(i, i + 1))) {
				tekler = tekler + cumle.charAt(i);
			}

		}
		System.out.println(tekler);
	}

}
