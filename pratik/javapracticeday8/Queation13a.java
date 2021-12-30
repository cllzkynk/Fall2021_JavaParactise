package javapracticeday8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Queation13a {
	/*
	 * ATM uygulaması yapınız.
	 * 
	 * 1. Adım : Bankamızdaki müşterilerin musteriNumarasi ve 4 haneli şifresini tutan bir HashMap oluşturalım.
	 * 		     Ve şu müşterileri biz ekleyelim.
	 * 			Integer, Integer
	 * 
	 * 			Müşteri No  -- Şifre
	 * 			12345678	   1876
	 * 			22222222	   1234
	 * 			98765432	   1453
	 * 			55554444	   2020
	 * 
	 * 2. Adım : Bankamızdaki müşterilerin hesaplarındaki para miktarini tutan bir tane HashMap oluşturalım.
	 * 		     Ve şu miktarları müşteri numarasıyla birlikte ekleyelim
	 * 			Integer,Float
	 * 
	* 			Müşteri No  -- Para
	 * 			12345678	   120.0
	 * 			22222222	   3000.0
	 * 			98765432	   7000.0
	 * 			55554444	   50.0
	 *  	
	 * 3. Adım : Giriş ekranı oluşturalım. Müşteri buradan giriş yapsın.
	 * 			 Kullanıcı adı ve şifre isteyelim, doğru ise giriş yapsın.
	 * 
	 * 4. Adım : Doğru müşteri numarası ve şifre kontrol eden methodlar yazalım.
	 * 			 musteriNumarasiDogruMu(int no)
	 * 			 	Hashmap listemizde varsa, doğru müşteri numarasıdır.
	 * 
	 * 			sifreDogruMu (int no, int sifre)
	 * 				HashMap'teki şifre ile uyuşuyorsa doğru şifredir.
	 * 
	 * 5. Adım : Girş yaptıktan sonra karşısına 3 tane seçenek çıksın : 
	 * 			 Bunları da menuGoster() methodu ile yapalım.
	 * 			 1- Para Çek			// 300
	 * 			 2- Para Yükle			// 500 + 100
	 * 			 3- Toplam Paramı Gör	// 200
	 * 			 4- Çıkış Yap	
	 * 
	 * 6. Adım : Çıkış methodu oluşturalım.
	 * 			 Giriş yapan müşteri çıkış yapmak isterse, toplamPara ve girisYapanMusteriNo'yu sıfırlayalım.
	 * 			 Tekrar giriş ekranına yöndendirelim.	
	 * 
	 * 6. Adım : Toplam parami gor methodu oluşturalım. toplamParamiGor()
	 * 			
	 * 7. Adım : 1- Para Çekme Methodu Oluşturalım
	 * 			 Hesaba giriş yapan müşteriye hesabındaki toplam parayı gösterelim.
	 * 			 Kullanıcıdan çekmek istediği tutarı öğrenelim.	
	 * 			 Hesabında yeterli para varsa, para çeksin yoksa uyarı verelim.
	 * 			 Çektiği tutarı, toplam parasından düşelim ve kaydedelim.		
	 *			 Başka işlem yapmak isteyip istemediğini soralım, isterse yaptıralım, yoksa çıkış işlemi gerçekleştirelim.
	 * 		  
	 * 8. Adım : 1- Para Yükleme Methodu Oluşturalım
	 * 			 Hesaba giriş yapan müşteriye hesabındaki toplam parayı gösterelim.
	 * 			 Kullanıcıdan yüklemek istediği tutarı öğrenelim.	
	 * 			 Yüklediği tutarı, toplam parasına ekleyelim ve gösterelim.
	 * 			 Başka işlem yapmak isteyip istemediğini soralım, isterse yaptıralım, yoksa çıkış işlemi gerçekleştirelim.
	 * 
	 * */
	//Müşteri No ve Şifreyi tutmak için HashMap oluşturduk.
	static Map<Integer,Integer> musteriBilgileri = new HashMap<>();
	//Müşteri No ve Hesaptaki parasını tutmak için HashMap oluşturduk.
	static Map<Integer,Float> toplamParaMiktarlari = new HashMap<>();
	//Kullanıcıdan veri almak için oluşturduk.
	static Scanner scan = new Scanner(System.in);
	//Kullanıcı giriş yaptıktan sonra, kullanıcın bilgilerini bu iki değişkene atayalım.
	//Ve işlemlerimizi bu iki değişkeni kullanarak yapalım.
	static int girisYapanKullanicinMusteriNumarasi = 0;
	static float girisYapanKullanicinHesabindakiPara = 0;
	public static void main(String[] args) {
				//			 KEY	   VALUE
		musteriBilgileri.put(12345678, 1876);
		musteriBilgileri.put(22222222, 1234);
		musteriBilgileri.put(98765432, 1453);
		musteriBilgileri.put(55554444, 2020);
		toplamParaMiktarlari.put(12345678, 120.0f);
		toplamParaMiktarlari.put(22222222, 1000.0f);
		toplamParaMiktarlari.put(98765432, 5.0f);
		toplamParaMiktarlari.put(55554444, 255.0f);
		girisEkrani();	
	}
	private static void girisEkrani() {
		System.out.println("Müşteri numaranızı giriniz : ");
		int musteriNo = scan.nextInt();
		if(musteriBilgileri.get(musteriNo) == null) {
			System.out.println("Böyle bir müşteri yok.");
			girisEkrani();
			return;
		}else {
			System.out.println("Müşteri numaranız : " + musteriNo);
			System.out.println("Lütfen şifrenizi giriniz : ");
			int sifre = scan.nextInt();
			/// 12345678
			/// musteriBilgileri.get(12345678)
			if(musteriBilgileri.get(musteriNo) == sifre) {
				System.out.println("HOŞGELDİNİZ");
				girisYapanKullanicinMusteriNumarasi = musteriNo;
				girisYapanKullanicinHesabindakiPara = toplamParaMiktarlari.get(musteriNo);				
				menuGoster();
			}else {
				System.out.println("ŞİFRENİZ YANLIŞ.");
				girisEkrani();
				return;
			}
		}
	}
	private static void menuGoster() {	
		//System.out.println("SEÇİM YAPINIZ : \n1-PARA ÇEK\n2-PARA YÜKLE\n3-TOPLAM PARAMI GÖR\n4-ÇIKIŞ YAP");
		System.out.println("SEÇİM YAPINIZ : \n");
		System.out.println("1-PARA ÇEK");
		System.out.println("2-PARA YÜKLE");
		System.out.println("3-TOPLAM PARAMI GÖR");
		System.out.println("4-ÇIKIŞ YAP");
		int secim = scan.nextInt();
		switch (secim) {
			case 1:
				paraCek();
				break;
			case 2:
				System.out.println("Ne kadar para yatırmak istersiniz ? ");
				float miktar = scan.nextFloat();
				girisYapanKullanicinHesabindakiPara = girisYapanKullanicinHesabindakiPara + miktar;
				//üstteki satırla aynı işlemi yapar : girisYapanKullanicinHesabindakiPara += miktar;
				System.out.println("Para hesaba yatırıldı.");
				System.out.println("Toplam paranız : " + girisYapanKullanicinHesabindakiPara);
				toplamParaMiktarlari.put(girisYapanKullanicinMusteriNumarasi, girisYapanKullanicinHesabindakiPara);
				menuGoster();
				break;
			case 3:
				System.out.println("Hesabınızdaki Toplam Para :" + girisYapanKullanicinHesabindakiPara);
				menuGoster();
				break;
			case 4:
				System.out.println("Çıkış yapıldı.");
				girisEkrani();
				break;				
			default:
				System.out.println("YANLIŞ SEÇİM.");
				menuGoster();
				break;
		}
	}
	private static void paraCek() {
		System.out.println("Hesabınızdan ne kadar para çekmek istiyorsunuz : ");
		float miktar = scan.nextFloat();
		if(miktar > girisYapanKullanicinHesabindakiPara) {
			System.out.println("Hesabınızda sadece " + girisYapanKullanicinHesabindakiPara + " lira var");
			paraCek();
		}else {
			girisYapanKullanicinHesabindakiPara = girisYapanKullanicinHesabindakiPara - miktar;
			toplamParaMiktarlari.put(girisYapanKullanicinMusteriNumarasi, girisYapanKullanicinHesabindakiPara);
			System.out.println("Para Çekildi");
			System.out.println("Kalan Tutar : " + girisYapanKullanicinHesabindakiPara);
			menuGoster();
		}
	}
}