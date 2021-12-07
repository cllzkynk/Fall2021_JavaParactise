package Practice.Practice_02;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
	
		/*
        Kullanicidan vize ve final notlarini aliniz.
        Kullanicinin istedigi oranlarda vize ve final yuzdeleri
        not ile not ortalamasini hesaplayip
        not ortalamasini yazdirip 50 ve buyuk ise
        "Tebrikler dersi basari ile gectiniz..."
        kucukk ise
        "Malesef dersten kaldiniz..." yazdiriniz
         */  
		
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("vize1 notunuzu  giriniz : ");
		int v1 = scanner.nextInt();

		System.out.print("vize2 notunuzu  giriniz : ");

		int v2 = scanner.nextInt();

		System.out.print("final notunuzu  giriniz : ");
		int f = scanner.nextInt();

		System.out.print("vize hesaplama oranini  giriniz : ");
		double vO = scanner.nextDouble();

		System.out.print("final  hesaplama oranini  giriniz : ");
		double fO = scanner.nextDouble();

		double ortalma = ((v1 + v2) / 2 * vO/100) + (f * fO/100);

		if (ortalma >= 50) {
			System.out.println("Tebrikler dersi basari ile gectiniz..." + ortalma);

		} else {
			System.out.println("Malesef dersten kaldiniz...");
scanner.close();
		}

	}

}