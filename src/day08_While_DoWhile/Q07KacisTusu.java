package day08_While_DoWhile;

import java.util.Scanner;

public class Q07KacisTusu {

    public static void main(String[] args) {
        // Kullanicida x  girilene kadar ekrana "Program calisiyor" yazan
        // ve x girildiginde ise "Program bitti" yazan programi yaziniz.

    	Scanner scan = new Scanner(System.in);
		System.out.println("bisiler gir. X oyunu bitirir");
		char ch=' ';
		
		do {
			 ch=scan.next().charAt(0);
			 if(ch!='x') {
			System.out.println("Program calisiyor");}
		} while (ch!='x');
		if(ch=='x') {
			System.out.println("Program bitti");
		}
		
		
		
		scan.close();
		
    }
}
