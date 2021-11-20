package day01_27_10_Odevler;

import java.util.Scanner;

public class Q7_MatematikIslemi {

	public static void main(String[] args) {
		/*
		 * Problem Tanýmý Kullanýcýdan a,b ve c sayýlarýný okuyarak aþaðýdaki iþlemi
		 * yapan kodu yazýnýz a'nýn karesinden b'nin karesini cikarip c nin 3 katina
		 * bolunuz nin karesi Örnek Ekran Çýktýsý a sayýsýný giriniz: 5 b sayýsýný
		 * giriniz: 3 c sayýsýný giriniz: 1 sonuç : 5.333333333333333
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen islem yapmak icin a, b ve c sayilarini sirasiyla giriniz");
		
		int a =scan.nextInt();
		int b =scan.nextInt();
		int c =scan.nextInt();
		
		System.out.println("Isleminizin sonucu : "+((double)(a*a-b*b)/3*c));
		
		scan.close();
	}

}
