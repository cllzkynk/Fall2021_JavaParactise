package day02;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		/*
		 * SORU 8
		 * 
		 * Kullanicidan 3 basamakli bir sayi alip sayinin okunusunu yazdirin
		 * 
		 * Input : 356 
		 * Output : Ucyuzellialti
		 * 
		 * 
		 */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("3 basamakl� bir say� giriniz" );
		int sayi =scan.nextInt();

		
		// 1) 1 ler basamagindaki sayiyi bulun
		 
		int birler= sayi%10;
		System.out.println("girdiginiz sayinin birler basamagi " + birler);
		sayi/=10;
		
		// 2) 10 lar basamagindaki sayiyi bulun
		
		int onlar= sayi%10;
		System.out.println("girdiginiz sayinin onlar basamagi " + onlar);
		
		// 3) 100 ler basamagindaki sayiyi bulun
		int yuzler=sayi/=10;
		System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);
		
		switch (yuzler) {
		case 1:
			System.out.print("y�z");
			break;
		case 2:
			System.out.print("ikiy�z");
			break;
		case 3:
			System.out.print("��y�z");
			break;
		case 4:
			System.out.print("d�rty�z");
			break;
		case 5:
			System.out.print("be�y�z");
			break;
		case 6:
			System.out.print("alt�y�z");
			break;
		case 7:
			System.out.print("yediy�z");
			break;
		case 8:
			System.out.print("sekizy�z");
			break;
		case 9:
			System.out.print("dokuzy�z");
			break;

		}
		switch (onlar) {
		case 1:
			System.out.print("on");
			break;
		case 2:
			System.out.print("yirmi");
			break;
		case 3:
			System.out.print("otuz");
			break;
		case 4:
			System.out.print("k�rk");
			break;
		case 5:
			System.out.print("elli");
			break;
		case 6:
			System.out.print("altm��");
			break;
		case 7:
			System.out.print("yetmi�");
			break;
		case 8:
			System.out.print("seksen");
			break;
		case 9:
			System.out.print("doksan");
			break;
			default:
				System.out.print("");
		

	}
		switch (birler) {
		case 1:
			System.out.println("bir");
			break;
		case 2:
			System.out.println("iki");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("d�rt");
			break;
		case 5:
			System.out.println("be�");
			break;
		case 6:
			System.out.println("alt�");
			break;
		case 7:
			System.out.println("yedi");
			break;
		case 8:
			System.out.println("sekiz");
			break;
		case 9:
			System.out.println("dokuz");
			break;
			default:
				System.out.println(" ");
				break;
		}
		scan.close();
	}
}

