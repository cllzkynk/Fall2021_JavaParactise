package javapracticeday6;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		/*
		 * kullanicidan bir cumle isteyiniz ve cumlenin kelimelerini tersten yazdiriniz 
		 * e.g: I love java ==> java love I 
		 * String reverse = ""; 
		 * 
		 * substring method ile yapiniz veya array ile yapiniz
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir cümle giriniz");
		String str = sc.nextLine();
		
//		1. yol
		String arr1[] =str.split(" ");
	       for (int i = arr1.length-1; i>=0; i--) {
			System.out.print(arr1[i]+" ");
			


	}
	       System.out.println();
//			2. yol
			int ilkBosluk = str.indexOf(" ");
			int sonBosluk = str.lastIndexOf(" ");
			
			System.out.println(str.substring(sonBosluk+1)+str.substring(ilkBosluk,sonBosluk+1)+str.substring(0,ilkBosluk));
		
		

}
}

