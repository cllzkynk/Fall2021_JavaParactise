package day01_27_10;

import java.util.Scanner;

public class Q1_SayininRakamlariniYazdirma {

	public static void main(String[] args) {
		/* Write a Java program to break an integer into a sequence of individual digits.
		Hint: use / and %
		 ex: input: 12345
	    output: 1
	            2
	            3
                4
	            5
	            */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 5 basamakli bir sayi giriniz");
		
		int sayi=scan.nextInt();
	
		int ilkRakam=(sayi/10000)%10 ;  
		int ikinciRakam=(sayi/1000)%10 ;
		int ucuncuRakam=(sayi/100)%10 ; 
		int dorduncuRakam=(sayi/10)%10 ; 
		int sonRakam=sayi%10;            
		   
		     
	

		System.out.println(ilkRakam+"\n"+ikinciRakam+"\n"+ucuncuRakam+"\n"+dorduncuRakam+"\n"+sonRakam);
		scan.close();
	}

}
