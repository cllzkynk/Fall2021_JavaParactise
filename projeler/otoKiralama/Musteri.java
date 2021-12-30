package otoKiralama;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//musterinin ad, soyad, yas, telefon, id  ve kredi kartı bilgileri
public class Musteri {
String adSoyad;
String yas;
String tlf;
String kimlikNo;
String kartNo;

List<Musteri>musteriList=new ArrayList<>();


public Musteri() {
	
}

public Musteri(String adSoyad, String yas, String tlf, String kimlikNo, String kartNo) {
	super();
	this.adSoyad = adSoyad;
	this.yas = yas;
	this.tlf = tlf;
	this.kimlikNo = kimlikNo;
	this.kartNo = kartNo;
}
public void musteriBilgileri() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Lütfen Ad-Soyad giriniz..");
	adSoyad=scan.nextLine();
	System.out.println("Lütfen yasinizi giriniz..");
	yas=scan.next();
	System.out.println("Lütfen kimlik no giriniz..");
	kimlikNo=scan.next();
	System.out.println("Lütfen kredi kart nosunu giriniz..");
	kartNo=scan.next();
	System.out.println("Lütfen tlf no giriniz..");
	tlf=scan.next();
	
	System.out.println("Lütfen girdiginiz bilgileri kontrol ediniz..");
	Musteri musteri=new Musteri(adSoyad, yas, tlf, kimlikNo, kartNo);
	musteriList.add(musteri);
	
	System.out.println(toString());

	
}

@Override
public String toString() {
	return "Musteri [adSoyad=" + adSoyad + ", yas=" + yas + ", tlf=" + tlf + ", kimlikNo=" + kimlikNo + ", kartNo="
			+ kartNo + "]";
}
	
}
