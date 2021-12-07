package Practice.inheritance05;

public class Yonetici extends Calisan {

	

	/*
	3 sinif olusturacgiz bu ornegimizde: Runner ,calisan ve yonetici siniflari.
	Calisan sinifimiz superclass, yonetici sinifimiz da subclass olacak.
	Runner sinifimizda da olusturdugumuz kodlari, konsola yazdirabilmek icin olusturacgiz

	Calisan sinifinda isim ,maas ve departman degiskenleri olsun.
	Parmetresi bu degiskenler olan bir constructor olusturalim.
	Birde bu degiskenleri goruntuleyecek bir BilgileriGoster methodu olusturalim.

	Yoneticisinifinda  yine parametresi SperClasstaki degiskenler olan bir constructor olusturalim.
	Birde parametresi int zam olan br method olusturalm.
	Bu method bize zam miktari belirtildiginde ne kadar zam yapilmasi gerektigini belirtsin.
	 */
	
	

	public Yonetici(String isim, int maas, String departman) {
		super(isim, maas, departman);
	}

	public Yonetici() {

	}
	
	

	
	@Override
	public String toString() {
		return "isim=" + isim + "\nmaas= $" + maas + "\ndepartman=" + departman;
	}

	public void zam(int zamOrani) {

		System.out.println("Zam sonrasi calisan maasi : $" + (maas+zamOrani));

	}

}
