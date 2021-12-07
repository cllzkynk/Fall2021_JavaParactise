package Practice.Practice_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* Basrili Market al��-veri� program�.
*
* 1. Ad�m: �r�nler ve fiyatlar� i�eren listeleri olu�turunuz.

* 			No 	   �r�n 		  Fiyat
		   ====	 =======	 	=========
			00	 Domates   	 	 2.10 TL
			01	 Patates   	 	 3.20 TL
			02	 Biber     	 	 1.50 TL
			03	 So�an      	 2.30 TL
			04	 Havu�     	   	 3.10 TL
			05	 Elma      	   	 1.20 TL
			06	 Muz     	 	 1.90 TL
			07	 �ilek 	 		 6.10 TL
			08	 Kavun      	 4.30 TL
			09	 �z�m      	 	 2.70 TL
			10	 Limon     	 	 0.50 TL

* 2. Ad�m: Kullan�c�n�n �r�n nosuna g�re listeden �r�n se�mesini isteyiniz.
* 3. Ad�m: Ka� kg sat�n almak istedi�ini sorunuz.
* 4. Ad�m: Al�nacak bu �r�n� sepete ekleyiniz ve Sepeti yazd�r�n�z.
* 5. Ba�ka bir �r�n al�p almak istemedi�ini sorunuz.
* 6. E�er devam etmek istiyorsa yeniden �r�n se�me k�sm�na y�nlendiriniz.
* 7. E�er bitirmek istiyorsa �deme k�sm�na ge�iniz ve �dem sonras�nda program� bitirinzi.
*/

   /*
   1) 
   a)�r�nler (String) ve �r�n fiyatlari(double) i�in ayri ayri list olu�turulmali list ler class levelde omali 
   cunku: main metod harici diger metodlarda kullan�lacak
   b) Listenen urunleri bir method() ile kullan�c�ya g�sterilmeli 
   ve yazdiran bir method olmali
   c-d)Bu method bir cikti vermeyecegi ve sadece println 
   calisagi icin return type void prmtrsiz olmali.
   e)method --> public static void urunListele(){for, println(i+urun+fiyat)}
   
   2) 
   a)scanner class'indan obj creat edilmeli. 
   b)�runListele() method call edilerek kullan�c� ekran�na �run listesi g�sterilmeli.
   c)Kullan�c�dan urun kodu ve urun miktari istenmeli(println)
   d)int urunNo= kullanicinin girdigi urun kodu atanmali 
   e)double kg= kullanicinin girdigi urun miktari kg atanmali 
   
   3)
   a)Musteri i�in alisveris sepeti olusturulmali. 
   sepetUrunler list(String) 
   sepetKg list(double)
   sepetFiyat list(double) 
   b)public static void sepeteEkle(int urunKodu, double kg){sepetFiyat=urunFiyati*kg__list(double)}
   
   Her sepet alisverisinden sonra olusan sepet fiyatini toplayan bir primitive 
   (double) toplamFiyat olusturlmali
   toplamFiyat+=sepetFiyati  
 
   4) 
   sepete eklenen urunler miktari toplamFiyati 
   vs sepetin son durumunu hesaplatip yazdirilimali ki 
   Kullan�c� devem etmeyece�ini sorabilelim.
   public static double(toplamFiyat) sepetYazdir(){println(urunler+ fiyat+kg)}
  
   5) 
   Kullan�c�ya alisverise devam edip etmecegi sorulmali.
   kullanici cevabi:boolean(true/false) String(e/h) int (1/0)) 
   cevap verisine gore islem akisi icin  if kontrolu olmali--> 
   cevap Evet ise tum �slemler bastan tekrar edilmeli
   do-While(cevap)--cevap evet ise "do" hay�rsa alisveris bitirilmeli odeme talep edilmeli.
  
   6) 
   public static void odeme(println(double toplamFiyat){println()}
  
  
    */


public class BasariliMarket {
	public static List<String> urunler = new ArrayList<>();
	public static List<Double> urunFiyatlari = new ArrayList<>(); // 1.a ve 1.b

	public static List<String> sepetUrunler = new ArrayList<>(); // 3.a
	public static List<Double> sepetkg = new ArrayList<>(); // 3.a
	public static List<Double> sepetFiyat = new ArrayList<>(); // 3.a

	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		urunler.addAll(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun",
				"Uzum", "Limon"));

		urunFiyatlari.addAll(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));

		double toplamFiyat = 0.0; // 3.c
		String secim;
		double toplam = 0.0;

		urunListele(); // 2.b

		do {
			Scanner scan = new Scanner(System.in); // 2.a
			System.out.println("Urun kodunu giriniz : "); // 2.c
			int urunNo = scan.nextInt(); // 2.d
			System.out.println("Urun miktarini giriniz(kg cinsinden) : "); // 2.c
			double urunMiktari = scan.nextDouble(); // 2.e

			sepeteEkle(urunNo, urunMiktari);

			System.out.println("Alisverise devam etmek ister misiniz? evet ise e hayir ise h giriniz :");

			secim = scan.next();

		} while (secim.equalsIgnoreCase("e"));
		for (double each : sepetFiyat) {
			toplam += each;
		}
		System.out.println(toplam);
		

		odeme(toplam);
	}

	public static void urunListele() { // 1.c ve 1.d

		System.out.println("No\tUrun\tFiyat");
		System.out.println("===\t=======\t=======");

		for (int i = 0; i < urunler.size(); i++) { // 1.e
			System.out.println(i + "\t" + urunler.get(i) + "\t" + urunFiyatlari.get(i));
		}
	}

	public static void sepeteEkle(int urunNo, double urunMiktari) { // 3.b
		sepetUrunler.add(urunler.get(urunNo)); // 3.b
		sepetkg.add(urunMiktari); // 3.b
		sepetFiyat.add(urunFiyatlari.get(urunNo) * urunMiktari); // 3.b

	}

	public static void odeme(double toplam) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Odenecek toplam fiyat : " + toplam);

		System.out.println("Odenecek tutari giriniz : ");
		double odenecekTutar = scan.nextDouble();
		System.out.println("Para ustunuz : " + (odenecekTutar - toplam));
		
		scan.close();

	}
}