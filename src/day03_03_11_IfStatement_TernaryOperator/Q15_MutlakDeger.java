package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15_MutlakDeger {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */

		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		double sayi = input.nextDouble();

		System.out.println(sayi < 0  ? "Girilen sayinin mutlak degeri : " + (sayi * (-1))
				: "Girilen sayinin mutlak degeri : " + sayi);

	/*	if (sayi < 0) {

			System.out.println("Girilen sayinin mutlak degeri : " + (sayi * (-1)) + "  ifli calisti ");
		} else {
			System.out.println("Girilen sayinin mutlak degeri : " + sayi + "  ifli calisti ");
		} */

		input.close();
	}

}
