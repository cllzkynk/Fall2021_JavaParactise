package otoKiralama_2;

import java.sql.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//String alinacakSehir;
//String alinacakGun; (MM,dd--> ay gun formatında olmalı)
//double alisSaati;
//String teslimGunu;  (MM,dd--> ay gun formatında olmalı)
//double teslimSaati;
public class Islemler {
  String alinacakSehir;
  java.util.Date alinacakGun;
  double alisSaati;
  java.util.Date teslimGunu;
  double teslimSaati;
  
  public Islemler() {
	  
  }
public Islemler(String alinacakSehir, java.util.Date alinacakGun2, double alisSaati, java.util.Date teslimGunu2, double teslimSaati) {
	super();
	this.alinacakSehir = alinacakSehir;
	this.alinacakGun = alinacakGun2;
	this.alisSaati = alisSaati;
	this.teslimGunu = teslimGunu2;
	this.teslimSaati = teslimSaati;
}

public void reservasyon() {
	try {
	Scanner scan=new Scanner(System.in);
	System.out.println("Lütfen araci teslim almak istediginiz sehri yaziniz..");
	alinacakSehir=scan.next();
	
	 SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
     System.out.println("Lütfen araci alış tarihini şu şekilde girin (gg.aa.yy):");
     String alim = scan.next();
     if (null != alim && alim.trim().length() > 0) {
			this.alinacakGun = format.parse(alim);
     }
     System.out.println("Lütfen araci alacaginiz saati yazin..");
     alisSaati = scan.nextDouble();
     SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
     System.out.println("Teslim Tarihi şu şekilde girin (gg.aa.yy):");
     String teslim = scan.next();
     if (null != teslim && teslim.trim().length() > 0) {
			this.teslimGunu = format1.parse(teslim);		
     }  System.out.println("Lütfen araci teslim edeceginiz saati yazin");
     	teslimSaati = scan.nextDouble();
     	
     	Islemler islem=new Islemler(alinacakSehir, alinacakGun, alisSaati, teslimGunu, teslimSaati);
     	
     	System.out.println(toString());
		
     	
	}catch (Exception e) {
            System.out.println("Lütfen istenen bilgileri doğru bir şekilde girin...");
           reservasyon();
        }
}
double topFiyat() {
    int toplam;

    // Date alıp kaç gün kiralanacağını bulacağız ve fiyatı ona göre ayarlayacağız
    long difference_In_Time
            = this.teslimGunu.getTime() - this.alinacakGun.getTime();
    int fark = (int) (TimeUnit
            .MILLISECONDS
            .toDays(difference_In_Time)
            % 365);

    toplam = (int) (Araba.gunlukUcret * fark);

    return toplam;
}

@Override
public String toString() {
	return "Islemler [alinacakSehir=" + alinacakSehir + ", alinacakGun=" + alinacakGun + ", alisSaati=" + alisSaati
			+ ", teslimGunu=" + teslimGunu + ", teslimSaati=" + teslimSaati + "]";
}


  
}
