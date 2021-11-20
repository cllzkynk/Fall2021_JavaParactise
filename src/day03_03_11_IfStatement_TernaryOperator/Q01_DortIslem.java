package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01_DortIslem {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort
		 * islemden biri ile isleme koyup sonucun yazdiriniz
		 */

		// ESKIZ

		/* tam sayi gibi sinirlama yok double alalim en garantisi 
		 * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme if mi Switch Case mi ?
		 * Tabiki Stich Case ama muhtemelen hoca if isteyecek cunku paket ismi if-ternary
		 * 
		 * Once if sonra switch yapsak 
		 * 
		 * Ornek : Inputs : sayilar : 18 , 10 islem : 3 Output : 18 X 10 = 180
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Iki tam sayi giriniz");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();

		System.out.println("Bir Islem ismi giriniz : \n1:toplama \n2:cikarma \n3:carpma \n4:bolme");
		int islem = input.nextInt();

		System.out.println("=============IF`li ISLEM SONUCU=============");

		
			
		
		if (islem == 1) {
			System.out.println(s1 + " + " + s2 + " = " + (s1 + s2));
		} else if (islem == 2) {
			System.out.println(s1 + " - " + s2 + " = " + (s1 - s2));
		} else if (islem == 3) {
			System.out.println(s1 + " x " + s2 + " = " + (s1 * s2));
		} else if (islem == 4) {
			System.out.println(s1 + " - " + s2 + " = " + (s1 - s2));
		} else if (islem == 4) {
			System.out.println(s1 + " / " + s2 + " = " + (s1 / s2));
		} else {
			System.out.println("Lutfen gecerli bir islem seciniz");
		}

		System.out.println("=============SWITCH`li ISLEM SONUCU=============");

		switch (islem) {

		case 1:
			System.out.println(s1 + " + " + s2 + " = " + (s1 + s2));
			break;

		case 2:
			System.out.println(s1 + " - " + s2 + " = " + (s1 - s2));
			break;
		case 3:

			System.out.println(s1 + " x " + s2 + " = " + (s1 * s2));
			break;
		case 4:
			System.out.println(s1 + " / " + s2 + " = " + (s1 / s2));
			break;
		default:
			System.out.println("Lutfen gecerli bir islem seciniz");

		}

		input.close();

	}

}
