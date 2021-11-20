package day06_Method_Creation;

import java.util.Scanner;

public class Q05_CumleKacKelime {

    public static void main(String[] args) {
         /*
        Problem tanimi :
        Bir String icinde kac kelime oldugunu yazdiran bir method yaziniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */


		Scanner scan = new Scanner(System.in);
		System.out.println("uzunca bisiler gir bakiim ");
		String cumle = scan.nextLine();
    	
    	kelimeBul(cumle);

       scan.close();
    }

	public static void kelimeBul(String cumle) {
		int count=0;
		for (int i = 0; i <cumle.length(); i++) {
			if (cumle.charAt(i)==' ') {
				count+=1;
			}
			
		}
		System.out.println("Girilen ifade "+(count+1)+" kelime icermektedir");
	}
}
