package javapracticeday8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Questions11a {
	/*
	 * Bir bakkalin 7 gunluk tum kazanclarini gunluk olarak gosteren bir program yaziniz.
	 * Ayrica bakkalin bu hafta ortalama kazandigi miktari gosteren bir method yaziniz.
	 * Ayrica bakkalin hangi gunler ortalamanin ustune kazandigini gosteren bir method yaziniz.
	 * Ayrica bakkalin hangi gunler ortalamanin altinda kazandigini gosteren bir method yaziniz.
	 * 
	 * 1. Adim : Gunleri iceren bir tane ArrayList olusturun. (gunler)
	 * 2. Adim : Gunluk kazanclari ekleyecegimiz bir tane ArrayList olusturun. (gunlukKazanclar)
	 * 3. Adim : While dongusu ile kullanicidan 7 gunluk kazanclari tekek teker alip gunlukKazanclar ArrayList'e ekle.
	 * 4. Adim : getOrtalamaKazanc() adli method ile ortlama kazanci alin.
	 * 5. Adim : getOrtalamaninUstundeKazancGunleri() adli method olusturun. 
	 * 			 for dongusu ile tum gunleri ortalama kazanc ile karsilastir
	 * 			 ortalama kazanctan yuksekse o gunleri return yap.
	 * 6. Adim : getOrtalamaninAltindaKazancGunleri() adli method olusturun. 
	 * 			 for dongusu ile tum gunleri ortalama kazanc ile karsilastir
	 * 			 ortalama kazanctan asagiysa o gunleri return yap.	
	 * */
	static List<String> gunler = new ArrayList<>();    /// 7 tane gun
	static List<Float> gunlukKazanclar = new ArrayList<>(); /// Tum gunlere ait kazanclar // 7 TANE DEÄ�ER
	static float toplamKazanc = 0;
	public static void main(String[] args) {
		gunler.add("Pazar");
		gunler.add("Pazartesi");
		gunler.add("Sali");
		gunler.add("Carsamba");
		gunler.add("Persembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		int gun = 0;
		Scanner scan = new Scanner(System.in);
		while(gun < 7) { //   7 < 7 = false
			System.out.println("Lutfen "+ gunler.get(gun) +" gununun kazancini giriniz : ");
			float gunlukKazanc = scan.nextFloat(); 
			gunlukKazanclar.add(gunlukKazanc);
			toplamKazanc += gunlukKazanc;
			gun++; // 0 1 2 3 4 5 6 --- 7
		}
		// 0. GUN Ä°Ã‡Ä°N > 100.0   
		// gunlukKazanclar.add(gunlukKazanc) -- > gunlukKazanclar ( 1 tane 100.0)
		// 0 + 100 = 100
		// 1. GUN Ä°Ã‡Ä°N > 200.0
		// gunlukKazanclar.add(gunlukKazanc) -- > gunlukKazanclar ( 2 tane 100.0 , 200.0)
		// 100 + 200 = 300
		// 2. GUN Ä°Ã‡Ä°N > 300.0
		// gunlukKazanclar.add(gunlukKazanc) -- > gunlukKazanclar ( 3 tane 100.0 , 200.0, 300.0)
		// 300 + 300 = 600
		// 6. GUN Ä°Ã‡Ä°N > 700.0
		// gunlukKazanclar.add(gunlukKazanc) -- > gunlukKazanclar ( 7 tane 100.0 , 200.0, 300.0, 400, 500, 600 ,700)
		// 2100 + 700 = 2800
		System.out.println("Gunluk Kazanclar : " + gunlukKazanclar.toString());
		System.out.println("Toplam Kazanc : " + toplamKazanc);
		System.out.println("Ortalama Kazanc : " + ortalamaKazanc() );
		System.out.println("Ortalamanin Ustunde : " + ortalamaninUstundeKazanilanGunler());
		System.out.println("Ortalamanin Altinda : " + ortalamaninAltindaKazanilanGunler());
		scan.close();
	}
	private static float ortalamaKazanc() {
		return toplamKazanc / 7;
	}
	private static String ortalamaninUstundeKazanilanGunler() {
		// 100 200 300 400 500 600 700
		String gun = ""; //  Persembe Cuma Cumartesi
		for(int i = 0; i < gunlukKazanclar.size() ; i++) {
				// 700				   >  400
			if(gunlukKazanclar.get(i)  > ortalamaKazanc()) {
				gun += " " + gunler.get(i);
			}
		}
		return gun;
	}
	private static String ortalamaninAltindaKazanilanGunler() {
		String gun = "";
		for(int i = 0; i < gunlukKazanclar.size() ; i++) {
			if(gunlukKazanclar.get(i)  < ortalamaKazanc()) {
				gun += " " + gunler.get(i);
			}
		}
		return gun;
	}
}
