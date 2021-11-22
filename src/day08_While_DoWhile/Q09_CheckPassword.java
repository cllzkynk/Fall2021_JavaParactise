package day08_While_DoWhile;

import java.util.Scanner;

public class Q09_CheckPassword {
	 public static void main(String[] args) {
		//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazýnýz.
		        Scanner scan = new Scanner(System.in);
		        System.out.print("pin code  giriniz : ");
		        int userPin = scan.nextInt();
		        int systemPin=1453;
		        while (userPin!=systemPin){
		            System.out.println("*****   hatali giris yapildi *****");
		            System.out.println("*****   agam bidaha dene *****");
		            userPin=scan.nextInt();
		        }
		        System.out.println("gayet basarili....");
		        scan.close();
		    }
		}