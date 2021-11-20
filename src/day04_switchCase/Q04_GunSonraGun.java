package day04_switchCase;

import java.util.Scanner;

public class Q04_GunSonraGun {
	public static void main(String[] args) {

		// Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
		// pazartesi haftanin ilk gunu olarak aliniz..


		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gun nosunu Pazar 0`dan baslayacak sekilde giriniz");
		int gunNo = scan.nextInt();
		int sonragun=0;
		String gunAdi = "";
		String xGunsonraAd="";
		switch (gunNo) {
		
		case 1:
			gunAdi = "Pazartesi";
			break;
		case 2:
			gunAdi = "Sali";
			break;
		case 3:
			gunAdi = "Carsamba";
			break;
		case 4:
			gunAdi = "Persembe";
			break;
		case 5:
			gunAdi = "Cuma";
			break;
		case 6:
			gunAdi = "Cumartes";
			break;
		case 7:
			gunAdi = "Pazar";
			break;
		default:
			System.out.println("Gecerli gun numarasi giriniz");

		}
		System.out.println(gunAdi);

		System.out.println("Kac gun gun sonrasinin hangi gun oldugunu merak ediyin ");
		int xGunsonra = scan.nextInt();

		sonragun = (gunNo + xGunsonra) % 7;
		
		switch (sonragun) {
		case 0:
			xGunsonraAd = "Pazar";
			break;
		case 1:
			xGunsonraAd = "Pazartesi";
			break;
		case 2:
			xGunsonraAd = "Sali";
			break;
		case 3:
			xGunsonraAd = "Carsamba";
			break;
		case 4:
			xGunsonraAd = "Persembe";
			break;
		case 5:
			xGunsonraAd = "Cuma";
			break;
		case 6:
			xGunsonraAd = "Cumartes";
			break;
			
		}
		
		System.out.println("Girilen gun nosu " +gunNo+ "  ve gunlerden " +gunAdi + ","+ xGunsonra+ " gun sonra gunlerden  "+xGunsonraAd + "  olcak");

	
	scan.close();
	}

}
