package Emlak;

import java.util.ArrayList;
import java.util.Scanner;

import Emlak.Emlak;

/**
 * @author CELİL
 */
public class Runner {
	static String patronID = "1";
	static String patronSifre = "1";

	static String calisanID = "2";
	static String calisanSifre = "2";

	static Scanner scan = new Scanner(System.in);

	static String evTipi = null;
	static String il = null;
	static int odaSayisi = 0;
	static double fiyat = 0;
	static String stokDurumu = "";
	static int listeNo = 99;

	static ArrayList<Emlak> envanter = new ArrayList<>();

	public static void main(String[] args) {

		String id = "";
		String sifre = "";
		boolean girisBasarili = true;

		while (girisBasarili) {

			System.out.println("Sila Emlak Iyi Gunler  Diler");
			System.out.print("ID : ");
			id = scan.next();
			System.out.print("Sifre : ");
			sifre = scan.next();
			if (id.equals(patronID) && sifre.equals(patronSifre)) {
				girisBasarili = false;
				Admin();
			} else if (id.equals(calisanID) && sifre.equals(calisanSifre)) {
				girisBasarili = false;
				Calisan();
			} else {
				System.out.println("Giris basarisiz. Tekrar deneyiniz");
				girisBasarili = true;
			}

		}

	}

	public static void Calisan() {
		System.out.println("\t\t\t\t _______________________________________"
				+ "\n\t\t\t\t/\\\t\t\t\t\t|\n\t\t\t       /  \\\t    𝓢𝓘𝓛𝓐 𝓔𝓜𝓛𝓐𝓚 \t\t\t|\n\t\t\t      /    \\\t 𝓢𝓘𝓒𝓐𝓚 𝓑𝓘𝓡 𝓨𝓤𝓥𝓐 𝓘𝓒𝓘𝓝\t\t|\n\t\t\t   "
				+ "  /      \\\t\t\t\t\t|" + "\n\t\t\t     --------------------------------------------"
				+ "\n\t\t\t    |        |\t\t _______\t\t|" + "\n\t\t\t    |        |\t\t|\t|\t\t|"
				+ "\n\t\t\t    |        |\t\t|\t|\t\t|" + "\n\t\t\t    |        |\t\t|\t|\t\t|"
				+ "\n\t\t\t    |        |\t\t -------\t\t|" + "\n\t\t\t    |        |\t\t\t\t\t|"
				+ "\n\t\t\t    |        |\t\t\t\t\t|" + "\n\t\t\t    |        |\t\t\t\t\t|"
				+ "\n\t\t\t    ---------------------------------------------");
		System.out.println("Gunaydin emekci.Satislardaki %0.001 Prim seni motive edecektir diye hatirlatayim dedim");
		while (true) {
			System.out.print("\n1-Ekle \n2-Listele \n3-Cik \nSecenek:");

			int secenek = scan.nextInt();

			switch (secenek) {
			case 1:
				Emlak emlak1 = new Emlak(++listeNo, evTipi, il, odaSayisi, fiyat, stokDurumu);

				envanter.add(emlak1);

				break;
			case 2:
				System.out.println("--------------------------------------");

				System.out.println("Envanter:");
				for (int i = 0; i < envanter.size(); i++) {
					
					envanter.get(i).listeleEmlak();
				}

				
				System.out.println("Toplam Emlak Sayisi   : " + envanter.size());
				break;
			case 3:
				System.out.println("Yine bekleriz..");
				break;

			default:
				System.out.println("yanlis giris yaptiniz lutfen tekrar deneyiniz");
				break;
			}

		}

	}

	public static void Admin() {
		System.out.println("\t\t\t\t ______________________________________"
				+ "\n\t\t\t\t/\\\t\t\t\t\t|\n\t\t\t       /  \\\t 𝓢𝓘𝓛𝓐 𝓔𝓜𝓛𝓐𝓚 \t\t\t|\n\t\t\t      /    \\\t 𝓢𝓘𝓒𝓐𝓚 𝓑𝓘𝓡 𝓨𝓤𝓥𝓐 𝓘𝓒𝓘𝓝\t\t|\n\t\t\t   "
				+ "  /      \\\t\t\t\t\t|" + "\n\t\t\t     --------------------------------------------"
				+ "\n\t\t\t    |        |\t\t _______\t\t|" + "\n\t\t\t    |        |\t\t|\t|\t\t|"
				+ "\n\t\t\t    |        |\t\t|\t|\t\t|" + "\n\t\t\t    |        |\t\t|\t|\t\t|"
				+ "\n\t\t\t    |        |\t\t -------\t\t|" + "\n\t\t\t    |        |\t\t\t\t\t|"
				+ "\n\t\t\t    ---------------------------------------------");
		System.out.println("Gunaydin patron. Gene istifliyon paralari :D");

		while (true) {

			System.out.print("\n1-Ekle \n2-Listele \n3-Sil \n4-Duzenle \n5-Cik \nSecenek:");
			int secenek = scan.nextInt();
			switch (secenek) {
			case 1:
				Emlak emlak = new Emlak(++listeNo, evTipi, il, odaSayisi, fiyat, stokDurumu);

				envanter.add(emlak);
				break;
			case 2:
				System.out.println("--------------------------------------");

				System.out.println("Envanter:");
				for (int i = 0; i < envanter.size(); i++) {
				
					envanter.get(i).listeleEmlak();
				}

				
				System.out.println("Toplam Emlak Sayisi   : " + envanter.size());

				break;
			case 3:
				System.out.println(
						"ooo patron sildigine gore sattin gene mali Hangisini hangisini silelim numarasini gir ");
				int silinen = scan.nextInt() - 100;
				System.out.println("Tebrikler " + envanter.get(silinen).getFiyat() + "   tutarinda satis yapmissin");
				
				envanter.remove(silinen);
				

				break;

			case 5:
				System.out.println("Iyi gunler");
				break;
			case 4:
				for (int i = 0; i < envanter.size(); i++) {
					
					envanter.get(i).listeleEmlak();
				}
				System.out.println("Duzenlemek isteigin urunun liste nosunu gir");
				int duzenlenecek = scan.nextInt() - 100;
				if (duzenlenecek<envanter.size()) {
				System.out.println(
						"Mulkun hangi ozelligini duzenlemek istiyorsun \n1-Ev tipi \n2-il \n3-Oda sayisi \n4-Fiyat \n5-Stok Durumu");
				int neyi = scan.nextInt();
			 
				
			
				switch (neyi) {
				case 1:
					System.out.println("Duzenlemeyi gir");
					envanter.get(duzenlenecek).setEvTipi(scan.nextLine());
					
					break;
				case 2:
					System.out.println("Duzenlemeyi gir");
				envanter.get(duzenlenecek).setIl(scan.nextLine());
				
					break;
				case 3:
					System.out.println("Duzenlemeyi gir");
					envanter.get(duzenlenecek).setOdaSayisi(scan.nextInt());
					
					break;
				case 4:
					System.out.println("Duzenlemeyi gir");
					envanter.get(duzenlenecek).setFiyat(scan.nextInt());
					
					break;
				case 5:
					System.out.println("Duzenlemeyi gir");
                   envanter.get(duzenlenecek).setStokDurumu(scan.next());
                    
					break;

				default:
					System.out.println("Yanlis giris yaptiniz");
					break;
				}

				break;
			}else {
				System.out.println("Sanki o kadar urun var. Olan bisi gir");
			}

			default:
				System.out.println("Bi ogrenemedin su programi kullanmayi he");
				break;
			}

		}

	}

}
