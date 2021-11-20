package day06_Method_Creation;

import java.util.Scanner;

public class Q07_TerstenString {
	/*
	 * reverseString isminde bir method oluşturun. Bu method bir String'i parametre
	 * olarak alsın. Ve bu method, girilen String'i tersten yazsın. Terste
	 * yazılmış halini yazdırınız.
	 * 
	 * Örn: String = "Java'yı Seviyorum." Print: .muroyiveS ıy'avaJ
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bisiler gir bakiim ");
		String cumle = scan.nextLine();

		System.out.println(cevir(cumle));

		scan.close();
	}

	public static String cevir(String cumle) {

		String depo = "";
		for (int i = cumle.length() - 1; i >= 0; i--) {
			depo = depo + cumle.charAt(i);

		}
		return depo;
	}
}
