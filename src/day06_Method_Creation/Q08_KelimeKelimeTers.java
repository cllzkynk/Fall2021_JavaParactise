package day06_Method_Creation;

import java.util.Scanner;

public class Q08_KelimeKelimeTers {
	/*
	 * Problem tanımı: Kullanıcıdan aldığınız bir String'deki kelimeleri
	 * sondan başa doğru yerleştiren String parametreli return type li
	 * reverseWord isminde bir method yazınız
	 * 
	 * Test DAta : İnput : Allah \ Javaci arkadaslara zihin acikligi versin Output
	 * : versin açıklığı zihin arkadaşlara Javacı Allah
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bisiler gir bakiim ");
		String cumle = scan.nextLine();

		String tersCumle = "";

		if (cumle.contains(" ")) {

			int ilk = cumle.indexOf(' ');

			for (int i = cumle.length() - 1; i > 0; i--) {

				if (cumle.charAt(i) == ' ') {

					tersCumle = tersCumle + cumle.substring(i + 1) + " ";

					cumle = cumle.substring(0, i);

				} // for ici if in

			} // forun

			System.out.println(tersCumle + " " + cumle.substring(0, ilk));

		} else {
			System.out.println(cumle);
		}
		scan.close();
	}
}