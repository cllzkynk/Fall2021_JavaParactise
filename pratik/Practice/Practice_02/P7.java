package Practice.Practice_02;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

		Scanner scan=new Scanner(System.in);

		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
				if (a < b && c < b) {

					System.out.print("x");

				} else if (a < b || c < b) {

					System.out.print("y");

				} else {

					System.out.print("z");

					scan.close();
				}

			}

		}