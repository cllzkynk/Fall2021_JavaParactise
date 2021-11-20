package day07_ForLoop;

import java.util.Scanner;

public class Q17_SayilarlaTersUcgen {

	public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6       şeklini konsola yazdiriniz.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Bir boyut gir ");
int boyut=scan.nextInt();
		for (int i = 1; i <= boyut; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= boyut; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}
scan.close();
	}
}
