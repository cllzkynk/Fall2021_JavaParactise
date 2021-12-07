package Practice.Practice_02;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    /*  Problem Tanimi
	        Kullanicidan a,b ve c sayilarini okuyarak asagidaki islemi yapan kodu yaziniz
	        a'nin karesinden b'nin karesini cikarip c nin 3 katina bolunuz

	        Ornek Ekran ciktisi
	        a sayisini giriniz: 5
	        b sayisini giriniz: 3
	        c sayisini giriniz: 1
	        sonuc : 5.333333333333333
	        */
		
		
Scanner scan = new Scanner (System.in);
		
		System.out.print("Lutfen a sayisini giriniz : ");
		double a = scan.nextDouble();
		
		System.out.print("Lutfen b sayisini giriniz : ");
		double b = scan.nextDouble();
		
		System.out.print("Lutfen c sayisini giriniz : ");
		double c = scan.nextDouble();
		
		double result = (((a+b) * (a-b)) / (3*c) );		
		
		System.out.println("Isleminizin sonucu : " + result);
	
	scan.close();
	}
	

}
