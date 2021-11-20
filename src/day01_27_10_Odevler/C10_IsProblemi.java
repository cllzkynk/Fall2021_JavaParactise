package day01_27_10_Odevler;

import java.util.Scanner;

public class C10_IsProblemi {
	/*
	 * Problem Tanýmý Bir iþçinin iþi bitirme süresini ve toplam iþçi sayýsýný
	 * alarak, iþin bitme süresini hesaplayan kodu yazýnýz. Örneðin, Bir iþçi bir
	 * iþi 10 günde yapabilmektedir. Buna göre 2 iþçi ayný iþi kaç günde yapar?
	 * Örnek Ekran Çýktýsý Bir iþçi iþi kaç günde bitirmektedir? 10 Toplam kaç iþçi
	 * çalýþacak? 2 Ýþin bitme süresi 5 gündür.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen fabrikanizdaki icsi sayisini giriniz");
		int eleman = scan.nextInt();
		System.out.println("Lutfen planlanan isin bir isci icin ortalama kac gunluk oldugunu  giriniz");
		double sure = scan.nextDouble();

		System.out.println("Fabrikanizin  isi teslim etme suresi ortalama  : " + sure / eleman + "  gundur ");

		scan.close();
	}

}
