package Practice.Practice_05;

import java.util.Scanner;

public class P09 {

	public static void main(String[] args) {
	   

        // INTEGER OLAN PIN kodunuzu kontrol eden bir kod yaziniz.
        Scanner scan = new Scanner(System.in);

        System.out.print("PIN kodunuzu giriniz : ");
        int userPin = scan.nextInt();

        int pinCode = 1453;

        while (pinCode!=userPin) {
			System.out.println("basarisiz pin girisi! tekrar deneyin :");
			userPin=scan.nextInt();
		}
        System.out.println("gayet basarili pin onaylandi");
	
	
	
	
	scan.close();
	
	
	}

}
