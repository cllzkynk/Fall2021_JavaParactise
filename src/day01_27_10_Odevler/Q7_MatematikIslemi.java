package day01_27_10_Odevler;

import java.util.Scanner;

public class Q7_MatematikIslemi {

	public static void main(String[] args) {
		/*
		 * Problem Tan�m� Kullan�c�dan a,b ve c say�lar�n� okuyarak a�a��daki i�lemi
		 * yapan kodu yaz�n�z a'n�n karesinden b'nin karesini cikarip c nin 3 katina
		 * bolunuz nin karesi �rnek Ekran ��kt�s� a say�s�n� giriniz: 5 b say�s�n�
		 * giriniz: 3 c say�s�n� giriniz: 1 sonu� : 5.333333333333333
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
