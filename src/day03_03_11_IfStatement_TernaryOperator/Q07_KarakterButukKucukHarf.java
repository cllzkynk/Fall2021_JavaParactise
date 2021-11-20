package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07_KarakterButukKucukHarf {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz");
		char ch=scan.next().charAt(0);
		
		if ('A'<ch&&ch<'Z') {
			System.out.println("Girilen karakter buyuk harftir");
		} else if ('a'<ch&&ch<'z') {
			System.out.println("Girilen karakter kucuk harftir");
		}else if ('0'<=ch&&ch<='9') {
			System.out.println("Girilen karakter rakamdir");
		} else {
			System.out.println("Hatali giris yaptiniz");
		}
		
		
		scan.close();

	}

}
