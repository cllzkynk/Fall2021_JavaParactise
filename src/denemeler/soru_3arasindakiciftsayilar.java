package denemeler;

import java.util.Scanner;

public class soru_3arasindakiciftsayilar {

	public static void main(String[] args) {

		/*
		 * Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis
		 * degeri dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana
		 * yazdiriniz.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen baslangic ve bitis degerlerini giriniz:");

		int bas = scan.nextInt(); // 20 10
		int son = scan.nextInt(); // 10 20


		if (bas>son) {
			int c;
			c=son;
			son=bas;
			bas=c;
		} 
		
		
		
		while (bas <= son) {

			if (bas % 2 == 0) {

				System.out.print(bas + " ");
			}
			bas++;
		}

	scan.close();

	}

}
