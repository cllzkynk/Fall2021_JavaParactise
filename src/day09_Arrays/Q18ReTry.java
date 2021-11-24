package day09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q18ReTry {
	static int j = 0;
	static int i = 0;

	public static void main(String[] args) {
		// kullanicidan alinan bir String'deki herbir karakterin adedini bir array
		// icinde yazdiran bir java programi yazin.
		// String "Javacilar cook afilli" ise cevap soyle olmalidir:
		// { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}

		Scanner scan = new Scanner(System.in);
		System.out.println("bisiler gir");
		String str = scan.nextLine().toLowerCase();
		String[] arr = str.split("");
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));

		tekilKarSay(str);
		harfleriSayi(str);

	}

	private static int harfleriSayi( String str) {
		
		
		
		
		
		
		
		
		
		
		
		
		return 0;
	}

	public static int tekilKarSay(String str) {
		int boy = 0;

		for (int i = ' '; i <= 'z'; i++) {

			for (int j = 0; j < str.length(); j++) {

				if (i == str.charAt(j)) {
					boy++;

					System.out.print((char) i);
					break;
				}

			}

		}
		return boy;
	}
}