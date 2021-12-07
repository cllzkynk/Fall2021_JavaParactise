package Practice.Practice_13_Abstract05;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		
		// 1. yol 
		
		Scanner scan=new Scanner(System.in);
		
		Musteri musteri=new Musteri();
		
		System.out.println("Nereden aliveris yapacaksiniz (1-Bakkal/ 2-Halk ekmek)");
		int secim=scan.nextInt();
		
		if (secim==1) {
			musteri.firin=new Bakkal();	
			
		}else {
			musteri.firin=new HalkEkmek();	
		}
			
		musteri.alisveris();
		
		// 2. yol
		// Musteri musteri=new Musteri();
		// musteri.firin=new Bakkal();
		// musteri.firin=new HalkEkmek();
		// musteri.alisveris();
		
		scan.close();

	}

}
