package day01_27_10_Odevler;

import java.util.Scanner;

public class Q6_VizeFinalHesabi {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz vize2 vize2 ve final notlarini vize ortalamasinin
		 * %30'u final notunun %70 alarak gecme notunu hesaplayiniz
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen once vize notunuzu sonra final notunuzu giriniz");
		
		int vize=scan.nextInt();
		int finall = scan.nextInt();
		
		System.out.println("Not ortalamaniz : "+ (vize*0.3+finall*0.7));
		
		scan.close();
	}

}
