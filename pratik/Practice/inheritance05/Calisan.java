package Practice.inheritance05;


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

  public class Calisan {

	String isim;
	int maas;
	String departman;
	
	
	
	public Calisan() {
		
	}

	public Calisan(String isim, int maas, String departman) {
		
		this.isim = isim;
		this.maas = maas;
		this.departman = departman;
	}
	
	
	
	
	
}
