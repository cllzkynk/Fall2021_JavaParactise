package Practice.Practice_13_Abstract05;

import java.util.Scanner;

public class Musteri {
	
	Firin firin;
	Scanner scan=new Scanner(System.in);
	
	public void alisveris() {
	
	System.out.println("Ekmek Hesaplamasi");
	System.out.print("Kac adet ekmek almak istiyorsunuz : ");
	int x=scan.nextInt();
	
	System.out.println("Ekmek fiyati : " + firin.ekmekAl(x)/x+ " TL" );
	System.out.println("Odeyeceginiz miktar : " + firin.ekmekAl(x) + " TL");
	
	}

}