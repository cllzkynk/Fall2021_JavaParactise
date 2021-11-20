package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03_VKE {

	public static void main(String[] args) {
		/*
		 * Kullanicidan boyunu CM ve kilosunu kg alarak BMI (VKE) hesaplayiniz
		 *
		 * BMI = kilo(kg) /(boy*boy)(cm) BMI <=20 oldukca zayifsiniz 20<BMI<=25 Normal
		 * sinirlardasiniz 25<BMI<=30 Sisman kategorisindesiniz 30<BMI ==> Obez
		 * grubundasiniz.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Boyunuzu (cm) ve kilonuzu(kg) sirayla giriniz \nBoyunuz:");
		double boy = scan.nextDouble();
		boy = boy / 100;
		System.out.println("Kilonuz :");
		double kilo = scan.nextDouble();

		double vke = kilo / (boy * boy);
		if (vke <= 20) {
			System.out.println("Vucut kitle endeksiniz: " + vke + " ve Oldukca zayifsiniz");
		} else if ((20 < vke) && vke <= 30) {
			System.out.println("Vucut kitle endeksiniz: " + vke + " ve Normal sinirdasiniz");
		} else if ((25 < vke) && vke <= 25) {
			System.out.println("Vucut kitle endeksiniz: " + vke + " ve Sisman katagoridesiniz");
		} else if (30 < vke) {
			System.out.println("Vucut kitle endeksiniz: " + vke + " ve Obez  grubundasiniz");
		}

		scan.close();
	}

}
