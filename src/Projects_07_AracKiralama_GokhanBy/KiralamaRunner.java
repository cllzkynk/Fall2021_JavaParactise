package Projects_07_AracKiralama_GokhanBy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KiralamaRunner {

	static String cikis="H";
	static Arac secim;
	static Scanner scan = new Scanner(System.in);
	static List<Arac> araclar = new ArrayList<>();
	static List<Kullanici> kullanicilar = new ArrayList<>();

	public static void main(String[] args) {
		
		do {
		
		System.out.println("======== ARAÃ‡ KÄ°RALAMA SÄ°STEMÄ°NE HOÅ�GELDÄ°NÄ°Z =======\n");
		System.out.print("Ã‡ikiÅŸ iÃ§in E' ye, Devam Etmek iÃ§in H'ye basiniz: \n");
		cikis=scan.next();
		if (!cikis.equalsIgnoreCase("H")) {
			System.out.println("YÄ°NE BEKLERÄ°Z .....");
			break;
			
		}
		aracEkle(araclar);

		kampanyaliAracListele(araclar);
		
		tumAraclariListele(araclar);
		
		aracSecim();
		
		kullaniciBilgileriEkle(kullanicilar);
		
		}while(cikis.equalsIgnoreCase("H"));

	}

	private static void tumAraclariListele(List<Arac> araclar) {
		System.out.println("\n=====================TÃœM ARAÃ‡ LÄ°STESÄ°===========================\n");
		int counter =1;
		for (Arac arac : araclar) {
			
			System.out.println(counter+". "+arac.toString());
			counter++;
			
		}System.out.println();
		
	}

	private static void kullaniciBilgileriEkle(List<Kullanici> kullanicilar) {

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMM/d/uuuu");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
		LocalDateTime dateTime = LocalDateTime.now();
				
		System.out.println("Bilgilerinizi Girin :");
		
		System.out.print("Adiniz :");
		scan.nextLine();// DUMMY
		String adSoyad = scan.nextLine();
		//scan.nextLine();// DUMMY
		System.out.print("Yasiniz: ");
		int yas = scan.nextInt();
		System.out.print("Kimlik No :");
		double kimlikNo=scan.nextDouble();
		System.out.print("KK Numaraniz :");
		double kartNo = scan.nextDouble();
		
		
		System.out.print("KaÃ§ GÃ¼nlÃ¼k Kiralayacaksiniz:");
		int kacGun = scan.nextInt();
		System.out.print("Aracin AlinacaÄŸi Å�ehir");
		String sehir = scan.next();
		
		
		Kullanici kullanici = new Kullanici();
		kullanici.adiSoyadi=adSoyad;
		kullanici.yas=yas;
		kullanici.kimlikNo=kimlikNo;
		kullanici.kartNo=kartNo;
		kullanici.alinacakSehir=sehir;
		kullanici.alinacakGun=dtf1.format(dateTime);
		kullanici.alisSaati=dtf2.format(dateTime);
		kullanici.teslimGunu=dtf1.format(dateTime.plusDays(kacGun));
		kullanici.teslimSaati=dtf2.format(dateTime.plusDays(kacGun));
		
		kullanicilar.add(kullanici);
		
		System.out.println(kullanicilar.toString()+"\n");
		
		System.out.println("Ã–denecek Tutar :"+ secim.gunlukUcret*kacGun+"TL\n");
			
		
	}

	public static void aracSecim() {

		
		System.out.println("LÃ¼tfen kiralamak istediÄŸiniz araÃ§ bilgilerini giriniz:\n");
		System.out.print("Marka :");
		String marka=scan.next();
		System.out.print("Model :");
		String model=scan.next();
		System.out.print("Yakit Tipi :");
		String yakitTipi=scan.next();
		System.out.print("Vites :");
		String vites=scan.next();
		
		
		for (Arac arac : araclar) {
			if (arac.marka.equalsIgnoreCase(marka) && 
					arac.yakitTipi.equalsIgnoreCase(yakitTipi) &&
					arac.vites.equalsIgnoreCase(vites)) {
					secim=arac;
				
			}
		}
		
		System.out.println("=========== SEÃ‡Ä°MÄ°NÄ°Z =========");
		System.out.println(secim.toString());
		
	}

	private static void kampanyaliAracListele(List<Arac> araclar) {
		int counter = 1;

		System.out.println("========= KAMPANYALI ARAÃ‡ LÄ°STESÄ° ============\n");
		for (int i = 0; i < araclar.size(); i++) {
			if (araclar.get(i).marka.equalsIgnoreCase("Opel") || araclar.get(i).marka.equalsIgnoreCase("Toyota")
					|| araclar.get(i).marka.equalsIgnoreCase("Volvo")) {
				System.out.println(counter + ". " + araclar.get(i).toString());
				counter++;

			}
		}System.out.println();

	}

	public static void aracListele(List<Arac> araclar) {

		int counter = 1;
		System.out.println("=============== ARAÃ‡ LÄ°STESÄ° =================");
		for (Arac each : araclar) {

			System.out.println(counter + ". " + each.toString());
			counter++;
		}

	}

	public static List<Arac> aracEkle(List<Arac> araclar) {

		for (int i = 0; i < 40; i++) {
			Arac arac = new Arac();
			araclar.add(arac);
		}
		int vites = 0;
		int k = 0;
		int araba = 0;

		for (int i = 0; i < araclar.size(); i++) {

			araclar.get(i).vites = AracVeriTabani.vites.get(vites);
			vites++;
			if (vites == 2)
				vites = 0;

			araclar.get(i).yakitTipi = AracVeriTabani.yakitTipi.get(k);
			k++;
			if (k == 4)
				k = 0;

			araclar.get(i).marka = AracVeriTabani.marka.get(araba);
			araclar.get(i).model = AracVeriTabani.model.get(araba);
			araclar.get(i).gunlukUcret = AracVeriTabani.gunlukUcret.get(araba);
			araba++;
			if (araba == 5)
				araba = 0;
		}
		return araclar;

	}

}
