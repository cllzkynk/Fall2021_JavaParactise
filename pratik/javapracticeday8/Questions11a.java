package javapracticeday8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Questions11a {
	/*
	 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
	 * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
	 * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
	 * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
	 * 
	 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
	 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
	 * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
	 * 4. Adım : getOrtalamaKazanc() adlı method ile ortlama kazancı alın.
	 * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. 
	 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
	 * 			 ortalama kazançtan yüksekse o günleri return yap.
	 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun. 
	 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
	 * 			 ortalama kazançtan aşağıysa o günleri return yap.	
	 * */
	static List<String> gunler = new ArrayList<>();    /// 7 tane gün
	static List<Float> gunlukKazanclar = new ArrayList<>(); /// Tüm günlere ait kazançlar // 7 TANE DEĞER
	static float toplamKazanc = 0;
	public static void main(String[] args) {
		gunler.add("Pazar");
		gunler.add("Pazartesi");
		gunler.add("Salı");
		gunler.add("Çarşamba");
		gunler.add("Perşembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		int gun = 0;
		Scanner scan = new Scanner(System.in);
		while(gun < 7) { //   7 < 7 = false
			System.out.println("Lütfen "+ gunler.get(gun) +" gününün kazancını giriniz : ");
			float gunlukKazanc = scan.nextFloat(); 
			gunlukKazanclar.add(gunlukKazanc);
			toplamKazanc += gunlukKazanc;
			gun++; // 0 1 2 3 4 5 6 --- 7
		}
		// 0. GÜN İÇİN > 100.0   
		// gunlukKazanclar.add(gunlukKazanc) -- > gunlukKazanclar ( 1 tane 100.0)
		// 0 + 100 = 100
		// 1. GÜN İÇİN > 200.0
		// gunlukKazanclar.add(gunlukKazanc) -- > gunlukKazanclar ( 2 tane 100.0 , 200.0)
		// 100 + 200 = 300
		// 2. GÜN İÇİN > 300.0
		// gunlukKazanclar.add(gunlukKazanc) -- > gunlukKazanclar ( 3 tane 100.0 , 200.0, 300.0)
		// 300 + 300 = 600
		// 6. GÜN İÇİN > 700.0
		// gunlukKazanclar.add(gunlukKazanc) -- > gunlukKazanclar ( 7 tane 100.0 , 200.0, 300.0, 400, 500, 600 ,700)
		// 2100 + 700 = 2800
		System.out.println("Günlük Kazançlar : " + gunlukKazanclar.toString());
		System.out.println("Toplam Kazanç : " + toplamKazanc);
		System.out.println("Ortalama Kazanç : " + ortalamaKazanc() );
		System.out.println("Ortalamanın Üstünde : " + ortalamaninUstundeKazanilanGunler());
		System.out.println("Ortalamanın Altında : " + ortalamaninAltindaKazanilanGunler());
		scan.close();
	}
	private static float ortalamaKazanc() {
		return toplamKazanc / 7;
	}
	private static String ortalamaninUstundeKazanilanGunler() {
		// 100 200 300 400 500 600 700
		String gun = ""; //  Perşembe Cuma Cumartesi
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
