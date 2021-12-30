package otoKiralama;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//String marka; (liste araclari --> opel toyota volvo)
//String model;  (astra corolla s60)
//String yakitTipi;  (diesel benzin)
//String vites; (manuel otomatik)
//double gunlukUcret; ( 100 120 150... liste dısı arac=300)
public class Araba {
static List<Araba>aracList=new ArrayList<>();
  String marka;
  String model; 
  String yakitTipi; 
  String vites;
  static double gunlukUcret;

  public Araba() {
	  
  }
  
public Araba(String marka, String model, String yakitTipi, String vites, double gunlukUcret) {
	super();
	this.marka = marka;
	this.model = model;
	this.yakitTipi = yakitTipi;
	this.vites = vites;
	this.gunlukUcret = gunlukUcret;
}
	

public void aracListesi() {

Araba arac1=new Araba("Toyota", "Corolla", "Dizel", "Otomatik", 250);
Araba arac2=new Araba("Opel", "Astra", "Benzin", "Manuel", 150);
Araba arac3=new Araba("Volvo", "S60", "Dizel", "Otomatik", 350);

aracList.add(arac1);
aracList.add(arac2);
aracList.add(arac3);


}
public void aracEkle() {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Aracin markasini yaziniz..");
	marka=scan.next();
	
	System.out.println("Aracin modelini yaziniz..");
	model=scan.next();
	
	while(yakitTipi==null) {
	System.out.println("Yakit türünü seciniz..\n1.Diesel\n2.Benzin\n3.Hibrit");
	int yakitSecimi=scan.nextInt();
	if(yakitSecimi==1) {
		yakitTipi="Diesel";
	}else if(yakitSecimi==2) {
		yakitTipi="Benzin";
	}else if(yakitSecimi==3) {
		yakitTipi="Hibrit";
	}else {System.out.println("Lütfen 1-3 arasi bir deger girin..");
	}}
	
	while (vites==null) {
	System.out.println("Vites türünü giriniz..\n1.Otomatik Vites\n2.Manuel Vites");
	int vitesSecim=scan.nextInt();	
		if(vitesSecim==1) {
			vites="Otomatik";
		}else if (vitesSecim==2) {
			vites="Manuel";
		}else {System.out.println("Lütfen 1-2 arasi bir deger girin..");}
	}	
	Araba arac=new Araba(marka, model, yakitTipi, vites,500);
	aracList.add(arac);
}

public void aracGoster() {
	aracListesi();
Scanner scan=new Scanner(System.in);
for (int i = 0; i < aracList.size(); i++) {
	System.out.println((i+1)+". "+aracList.get(i).marka);
}
System.out.println("4. Diger");

System.out.println("Lütfen istediginiz araci seciniz..");
int aracSecim=scan.nextInt();
switch (aracSecim) {
case 1:
System.out.println(aracList.get(aracSecim-1).toString());
	break;
case 2:
	System.out.println(aracList.get(aracSecim-1).toString());	
	break;
case 3:
	System.out.println(aracList.get(aracSecim-1).toString());	
	break;
case 4:
	aracEkle();
	System.out.println(aracList.get(aracSecim-1).toString());	
	break;
default:
	System.out.println("1 - 4 arasi bir deger giriniz..");
	break;
}
}

@Override
public String toString() {
	return "Araba [marka=" + marka + ", model=" + model + ", yakitTipi=" + yakitTipi + ", vites=" + vites
			+ ", gunlukUcret=" + gunlukUcret + "]";
}

}
