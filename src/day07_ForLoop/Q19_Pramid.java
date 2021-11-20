package day07_ForLoop;


import java.util.Scanner;

public class Q19_Pramid {
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
               
               
               şeklini konsola yazdiriniz.
     */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir boyut gir ");
		int boyut = scan.nextInt();
		for (int i = 0; i < 2*boyut; i++) {
			for (int j = i; j<=2*boyut; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <=2*i; j++) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		
		
		
		
scan.close();
	}
}
