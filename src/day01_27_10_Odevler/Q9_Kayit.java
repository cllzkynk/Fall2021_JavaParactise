package day01_27_10_Odevler;

import java.util.Scanner;

public class Q9_Kayit {
	/*
	 * TechProEd spor salonu i�in kullan�c�dan isim soyisim, ya�, kilo, boy, salona
	 * devam edece�i ay s�resini bilgilerini al�p ayl�k $20 olarak toplam �cretini
	 * yazd�r�n�z.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen adinizi giriniz");
		String ad = scan.nextLine();
		System.out.println("Adi   : " + ad + "\n");

		System.out.println("Lutfen soyadinizi giriniz");
		String soyad = scan.nextLine();
		System.out.println("Adi   : " + ad + "\nSoyad : " + soyad + "\n");

		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		System.out.println("Adi   : " + ad + "\nSoyad : " + soyad + "\nYas   : " + yas + "\n");

		System.out.println("Lutfen boyunuzu cm olarak giriniz");
		int boy = scan.nextInt();
		System.out.println("Adi   : " + ad + "\nSoyad : " + soyad + "\nYas   : " + yas + "\nBoy   : " + boy + "\n");

		System.out.println("Lutfen kilonuzu  olarak giriniz");
		int kilo = scan.nextInt();
		System.out.println("Adi   : " + ad + "\nSoyad : " + soyad + "\nYas   : " + yas + "\nBoy   : " + boy
				+ "\nKilo  : " + kilo + "\n");

		System.out.println("Lutfen salona kac ay devam edeceginizi giriniz");
		int ay = scan.nextInt();

		System.out.println("Adi   : " + ad + "\nSoyad : " + soyad + "\nYas   : " + yas + "\nBoy   : " + boy
				+ "\nKilo  : " + kilo + "\n" + "Sure  : " + ay);
		System.out.println("\t\t\t\t\tToplam Fatura Tutari  :  " + ay * 20 + '$');

		
		scan.close();
	}

}
