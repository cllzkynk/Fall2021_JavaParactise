package Practice.Practice_13_Abstract02;

import java.util.Scanner;

public class Runner {

	static Daire daire = new Daire(5,3.14);
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*System.out.println("Dairenin yaricapini giriniz : ");
		int r=scan.nextInt();
		
		System.out.println("Dairenin pi degerini (3,14) giriniz : ");
		int pi=scan.nextInt();
		*/
		System.out.println("Dairenin cevresi : " + daire.cevre());
		System.out.println("Dairenin Alani : " + daire.alan());

	}

}
