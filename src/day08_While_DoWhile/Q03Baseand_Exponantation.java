package day08_While_DoWhile;

import java.util.Scanner;

public class Q03Baseand_Exponantation {

    public static void main(String[] args) {
        // Kullanicidan 2 sayi alaliniz.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplatan code create edinim.
        // 3, 3  sonuc = 27

        //2  3 = 2*2*2=8



		Scanner scan = new Scanner(System.in);
		System.out.println("Taban olacak sayiyi gir");
		int taban = scan.nextInt();
		System.out.println("Us olacak sayiyi gir");
		int us = scan.nextInt();
		int sonuc = 1;


		for (int i = 1; i <= us-1; i++) {
			sonuc *= taban; 
			               
						
						 
           System.out.print(taban+"*");
		}
		System.out.println(taban+"="+sonuc);

		scan.close();
	}

}
