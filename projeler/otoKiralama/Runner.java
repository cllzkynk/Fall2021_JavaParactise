package otoKiralama;

import java.util.Scanner;

//1-
//kullanıcı  islem fields -->
//            String alinacakSehir;
//            String alinacakGun; (MM,dd--> ay gun formatında olmalı)
//            double alisSaati;
//            String teslimGunu;  (MM,dd--> ay gun formatında olmalı)
//            double teslimSaati;
//
//arac fields -->
//                String marka; (liste araclari --> opel toyota volvo)
//                String model;  (astra corolla s60)
//                String yakitTipi;  (diesel benzin)
//                String vites; (manuel otomatik)
//                double gunlukUcret; ( 100 120 150... liste dısı arac=300)
//
//2-musteriden  yukarida ozellikleri verilen liste araclardan  tercihini alınız. eger musteri farklı bir arac talep ederse
//talep ettigi aracın fields'larını alınız.
//musterinin ad, soyad, yas, telefon, id  ve kredi kartı bilgileri ile   arac tercihine ve islemine gore odemesini gerçekleştriniz..
public class Runner {

	static Araba arac=new Araba();
	static Musteri musteriler=new Musteri();
	static Islemler islem=new Islemler();
	
	public static void main(String[] args) {
		
arac.aracGoster();		
islem.reservasyon();
islemMenu(); 
	}

	public static void islemMenu() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen girdiginiz bilgileri kontrol ediniz.."
     			+ "\nToplam ücret : " +islem.topFiyat()+"'TL"
     			+ "\n1.Islemi onayliyorsaniz Müsteri Bilgilerini girmek üzere lütfen 1'e basiniz.."
     			+ "\n2.Reservasyon bilgilerini düzeltmek icin 2'ye basiniz.."
     			+ "\n0.Islemi iptal etmek icin 0'a basiniz..");
     	int secim=scan.nextInt();
     	switch (secim) {
		case 0:
			System.out.println("Size yardimci olamadigimiz icin üzgünüz.. Yine bekleriz..");
			break;
		case 1:
			musteriler.musteriBilgileri();
			break;
		case 2:
			islem.reservasyon();	
			break;

		default:
			break;
	}
	}}
