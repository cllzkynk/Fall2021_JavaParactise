package day01_27_10_Odevler;

import java.util.Scanner;

public class C10_IsProblemi {
	/*
	 * Problem Tan�m� Bir i��inin i�i bitirme s�resini ve toplam i��i say�s�n�
	 * alarak, i�in bitme s�resini hesaplayan kodu yaz�n�z. �rne�in, Bir i��i bir
	 * i�i 10 g�nde yapabilmektedir. Buna g�re 2 i��i ayn� i�i ka� g�nde yapar?
	 * �rnek Ekran ��kt�s� Bir i��i i�i ka� g�nde bitirmektedir? 10 Toplam ka� i��i
	 * �al��acak? 2 ��in bitme s�resi 5 g�nd�r.
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
