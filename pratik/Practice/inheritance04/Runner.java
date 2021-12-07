package Practice.inheritance04;

public class Runner {

	public static void main(String[] args) {
		/*
		 * 3 sinif olusturacgiz bu ornegimizde: Runner ,calisan ve yonetici siniflari.
		 * Calisan sinifimiz superclass, yonetici sinifimiz da subclass olacak. Runner
		 * sinifimiz da olusturdugumuz kodlari, konsola yazdirabilmek icin
		 * olusturacagiz
		 * 
		 * Calisan sinifinda isim ,maas ve departman degiskenleri olsun. Parmetresi bu
		 * degiskenler olan bir constructor olusturalim. Birde bu degiskenleri
		 * goruntuleyecek bir BilgileriGoster methodu olusturalim.
		 * 
		 * Yonetici sinifinda yine parametresi SperClasstaki degiskenler olan bir
		 * constructor olusturalim.Birde parametresi int zam olan br method olusturalim.
		 * Bu method bize zam miktari belirtildiginde ne kadar zam yapilmasi gerektigini
		 * belirtsin.
		 */
		
		
		Yonetici yonetici = new Yonetici("Ali Can", 10000, "IT");
		
		yonetici.bilgileriGoster();
		yonetici.zam(2000);
		
	
	

	}

}
