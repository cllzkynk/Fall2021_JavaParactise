package day08_While_DoWhile;

import java.util.Scanner;

public class Q02_StringinTekIntekliHarfleriniYazma {

	public static void main(String[] args) {
		// indexi tek sayi olan karakterleri yazdiran bir code create ediniz

		Scanner scan = new Scanner(System.in);
		System.out.println("Bisiler gir");
		String str = scan.nextLine();
		String str1 = "";
		String strDo = "";

		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 1) {
				str1 += str.charAt(i)+" ";
			}
		}

		System.out.println("forla calisti   :" + str1);
		int i = 0;
		do {
			if (i % 2 == 1) {
				strDo += str.charAt(i)+" ";
			}
			i++;
		} while (i < str.length());
		System.out.println("DoWhile calisti :" + strDo);

		scan.close();
	}

}
