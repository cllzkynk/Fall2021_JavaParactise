package Practice.Practice_05;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		/*
		 * Girilen pozitif bir sayinin tam kare olup olmadigini bulunuz, tamkare ise
		 * true degilse false yazdiriniz.
		 * 
		 * Not: sqrt gibi fonksiyonlari kullanmayin.
		 * 
		 * Example 1: Input: 16 Output: true Not: bu sayi tamkare cunku 4*4 = 16
		 * 
		 * Example 2: Input: 25 Output: true Note: bu sayi tamkare cunku  5*5=25
		 * 
		 * 
		 * Example 3: Input: 14 Output: false
		 * 
		 */
		
		 Scanner scan = new Scanner(System.in);
	     System.out.print("bir sayi giriniz : ");
	     int sayi = scan.nextInt();
	     int count = 0;
	     if (sayi<0) {
				sayi = -sayi;
			}
	     for (int i = 0; i <= sayi; i++) {
			
	    	 
	    	 if (i*i == sayi) {
				System.out.println("Gayet basarili sayi girdiginiz sayi tamkare");
			
				count++;
	    	 }
	    	 
		}
	     if (count==0) {
			System.out.println("Gayet BASARISIZ girdigin sayi tamkare degil !");
		}
	     scan.close();
	}

}
