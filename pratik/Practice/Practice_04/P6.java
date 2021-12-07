package Practice.Practice_04;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		/*
		 * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa
		 * son iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
		 *
		 * ornek input = Ali output = lilili
		 *
		 * input = el output = el
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("kelime  giriniz : ");
		String kelime = scanner.nextLine();// fenerbahce 10 harfli ise 8. ve 9. index

		if (kelime.length() >= 3) {
			System.out.println(kelime.substring(kelime.length() - 2) + kelime.substring(kelime.length() - 2)
					+ kelime.substring(kelime.length() - 2));
		
		} else {
			System.out.println("girilen kelime : " + kelime);
			
			scanner.close();
		}
	}
}