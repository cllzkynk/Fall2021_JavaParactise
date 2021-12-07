package Practice.Practice_13_Abstract01;

import java.util.Scanner;

public class Runner {

	// static Dikdortgen dikdortgen=new Dikdortgen();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Kullanicidan almazsak parametreli cons olusturup yapabiliriz...
		Dikdortgen dikdortgen = new Dikdortgen(5, 10);
		
		/* 
		 * Scanner scan=new Scanner(System.in); 
		 * System.out.println("kisa kenar : ");
		 * dikdortgen.kk=scan.nextInt(); 
		 * System.out.println("uzun kenar : ");
		 * dikdortgen.uk=scan.nextInt();
		*/
		
		System.out.println("dikdortgenin cevresi: " + dikdortgen.cevre());
		System.out.println("dikdortgenin alani : " + dikdortgen.alan());

	}

}