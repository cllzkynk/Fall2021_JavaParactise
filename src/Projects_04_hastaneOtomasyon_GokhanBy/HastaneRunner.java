package Projects_04_hastaneOtomasyon_GokhanBy;

public class HastaneRunner {
	/*
	 * Main metodumuzun hazir oldugundan emin olalim Main method da iki variable
	 * olusturunuz String hastaDurumu String unvan Ve asagidaki custom methodlari
	 * olusturunuz public static String doktorUnvan(String aktuelDurum) { } Sonra
	 * sirasiyla asagidaki adimlari takip ediniz If aktuelDurum ==> Allerji return
	 * Allergist If aktuelDurum ==> Bas agrisi return Norolog If aktuelDurum ==>
	 * Diabet return Genel cerrah If aktuelDurum ==> Soguk alginligi return Cocuk
	 * doktoru If aktuelDurum ==> Migren return Dahiliye If aktuelDurum ==> Kalp
	 * hastaliklari return Kardiolog else return yanlis unvan Sonra bu methodunuzu
	 * unvan variable iniza atayiniz
	 * 
	 * 2. olarak; public static Doktor doktorBul(String unvan){ } Sonra asagidaki
	 * objeyi metodunuzda olusturunuz Doktor doktor= new Doktor(); Simdi loop
	 * kullanarak unvaninizla Doktor objenizin tum variablelarini set ediniz
	 * VeriBankasindan gelen bilgilerle Ve return doktor;
	 * 
	 * 3. olarak; 
	 * 	public static Durum hastaDurumuBul(String aktuelDurum)
		Ve Durum classindan bir Obje olusturunuz
		Durum hastaDurumu = new Durum();
		Sonra asagidaki adimlari sirasi ile yapiniz ve tum durumlari set ediniz
		Switch veya if statement kullanabilirsiniz
		case " Allerji": ïƒ¨ aciliyet => false
		case " Bas agrisi": ïƒ¨ aciliyet => false
		case " Diabet": ïƒ¨ aciliyet => false
		case " Soguk alginligi": ïƒ¨ aciliyet => false
		   
		case " Migren": ïƒ¨ aciliyet => true
		case " Kalp hastaliklari": ïƒ¨ aciliyet => true
		default:
		System.out.println(â€œGecerli bir durum degil");
		Ve return hastaDurumu;
		
		
		ï?µ public static Hasta hastaBul(String actualCase)
		ï?µ Burada Hasta objesi olusturunuz Hasta classindan
		ï?µ Hasta hasta = new Hasta();
		ï?µ Loop kullaniniz ve aktuelDurumu kiyaslayiniz Data classindan
		ï?µ Hasta bilgilerini kullaniniz ve tum Hasta Objesindeki bilgileri set ediniz
		ï?µ Ve sonra hastaDurumuBul method unu cagiriniz ve Durum Objesini set ediniz
		ï?µ Son olarak return hasta;
	 * 
	 */

	private static Hastane hastane1 = new Hastane();
	static String hastaDurumu = "Diabet";
	public static void main(String[] args) {
		//String hastaDurumu = "Alerji";
		String unvan = doktorUnvan(hastaDurumu);
		
		hastane1.setDoktor(doktorBul(unvan)); 
		
		hastane1.setHasta(hastaBul(hastaDurumu));
		
		System.out.println(doktorBul(unvan).toString());
		
		System.out.println(hastaBul(hastaDurumu));
		

	}

	private static String doktorUnvan(String aktuelDurum) {

		if (aktuelDurum.equals("Allerji"))
			return "Allergist";
		if (aktuelDurum.equals("Bas agrisi"))
			return "Norolog";
		if (aktuelDurum.equals("Diabet"))
			return "Genel cerrah";
		if (aktuelDurum.equals("Soguk alginligi"))
			return "Cocuk doktoru";
		if (aktuelDurum.equals("Migren"))
			return "Dahiliye";
		if (aktuelDurum.equals("Kalp hastaliklari"))
			return "Kardiolog";
		else
			return "yanlis unvan";

	}

	public static Doktor doktorBul(String unvan) {
		Doktor doktor = new Doktor();

		for (int i = 0; i < VeriBankasi.unvanlar.length; i++) {
			if (unvan.equals(VeriBankasi.unvanlar[i])) {
				doktor.setIsim(VeriBankasi.doctorIsimleri[i]);
				doktor.setSoyIsim(VeriBankasi.doctorSoyIsimleri[i]);
				doktor.setUnvan(VeriBankasi.unvanlar[i]);
			}

		}

		return doktor;
	}
	
	public static Durum hastaDurumuBul(String aktuelDurum) {
		Durum hastaDurumu = new Durum();
		hastaDurumu.setAktuelDurum(aktuelDurum);
		
		switch(aktuelDurum) {
		case "Allerji":
			hastaDurumu.setAciliyet(false);
			break;
		case "Bas agrisi":
			hastaDurumu.setAciliyet(false);
			break;
		case "Diabet":
			hastaDurumu.setAciliyet(false);
			break;
		case "Soguk alginligi":
			hastaDurumu.setAciliyet(false);
			break;
		case "Migren":
			hastaDurumu.setAciliyet(true);
			break;
		case "Kalp hastaliklari":
			hastaDurumu.setAciliyet(true);
			break;
		default:
			System.out.println("Gecerli bir durum degil");
			break;
		}
		return hastaDurumu;
	}
	
	public static Hasta hastaBul(String actualCase) {
		Hasta hasta = new Hasta();
		for (int i = 0; i < VeriBankasi.durumlar.length; i++) {
			if (hastaDurumu.equals(VeriBankasi.durumlar[i])) {
				hasta.setHastaDurumu(hastaDurumuBul(VeriBankasi.durumlar[i]));
				hasta.setIsim(VeriBankasi.hastaIsimleri[i]);
				hasta.setSoyIsim(VeriBankasi.hastaSoyIsimleri[i]);
				hasta.setHastaID(VeriBankasi.hastaIDleri[i]);
				
			}
			
		}
			
		
		return hasta;
	}

}
