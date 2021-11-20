package day04_switchCase;

import java.util.Scanner;

public class Soru_SeyahatProjesi {

	public static void main(String[] args) {

		/*
		 * bulundugunuz yerden, bir yere yolculuk edeceksiniz.
		 * 
		 * 1. Koln veya Frankfurta gidebilirsiniz. 2. Bilet fiyati hesabi = Her 20 Km
		 * basina 5 euro. orn: (100 km yol. Bilet parasi (100/20)* 5 =25 euro
		 * 
		 * todo IPUCU: toplamTutar, islem, FrankfurtKm, KmBirimFiyat gibi sabit veri
		 * tipleri olusturabilirsiniz. Islemlerde direkt bunlari cagirabilirsiniz.
		 * 
		 * 
		 * 
		 * todo ILK OLARAK;
		 * 
		 * "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM --- Koln : 80 KM ---
		 * (20 KM basina 5 euro bilet parasi alinmaktadir..) yazisi gelsin.
		 * 
		 * 1. Frankfurt veya Koln olarak bir giris yapin. (Girdiginiz sehrin harfleri ,
		 * girildikten sonra buyuk hale gelsin.
		 * 
		 * todo Frankfurt girildiyse, orn: girdi= Frankfurt case=FRANKFURT:
		 * 
		 * Rota = Frankfurt yazdirin. Frankfurt km hesabi islemi yapin.
		 * 
		 * son olarak konsolda: Frankfurt 15 Euro yazsin.
		 * 
		 * 
		 * todo case: KOLN ise
		 * 
		 * "Rota = Koln" yazdirin. km hesabina gore islemi yapiniz.
		 * 
		 * son olarak konsolda: Koln 20 Euro yazsin.
		 * 
		 * 
		 * 
		 * 2. Sistem bize "Kac kisilik bilet istiyorsunuz? (Max 2 kisilik olabilir):   "
		 * sorusunu sorsun.
		 * 
		 * case:1 ise " 1 kisilik " yazdirin. (1 kisilik secerseniz bir islem yapmaniza
		 * gerek kalmaz, bilet ucreti yukarida coktan belirlenmis olur.)
		 * 
		 * case:2 ise
		 * 
		 * "2 kisilik " yazdirin 2 kisi icin bilet fiyatini hesaplayin.
		 * 
		 * 
		 * todo Son olarak yolculugunuzu check edin; //
		 * 
		 * konsolda orn: Frankfurt - 2 Kisilik yazsin.
		 * 
		 * 1.Bakiyemi belirtin. 2.Toplam Tutari belirtin. 3.double paraUstu olusturun ve
		 * hesaplayin. 4.Double para ustunu yazdirin.
		 * 
		 * 
		 */
		String yolAdi = "";
		int biletFiyat = 0;
		System.out.println("𝓒𝓔𝓛𝓲𝓛   𝓣𝓤𝓡𝓲𝓩𝓜𝓔  𝓗𝓞𝓢𝓖𝓔𝓛𝓓𝓲𝓝𝓲𝓩 ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen seheyat edeceginiz destinasyonu seciniz"
				+ "\nFirmamizda ucretlendirme  Km basina 5€ olarak belirlenmistir.\n1-Koln      : 800km"
				+ "\n2-Frankfurt : 600km\n3-NewYork   : 1500km\n4-Pekin     : 1870km ");
		if (scan.hasNextInt()) {
			int yolNo = scan.nextInt();
			if (yolNo >= 0 && yolNo <= 4) {

				switch (yolNo) {
				case 1:
					yolAdi = "KOLN 800km";
					biletFiyat = 800 * 5;
					break;
				case 2:
					yolAdi = "FRANKURT 600km";
					biletFiyat = 600 * 5;
					break;
				case 3:
					yolAdi = "NEWYORK 1500km";
					biletFiyat = 1500 * 5;
					break;
				case 4:
					yolAdi = "PEKIN 1870km";
					biletFiyat = 1870 * 5;
					break;

				}

				System.out.println("ROTA : " + yolAdi + "\nBILET TUTARI : " + biletFiyat + "€");

				System.out.println("Seyahatinizi kac kisilik planliyorsunuz ");
				if (scan.hasNextInt()) {
					int kisisayisi = scan.nextInt();
					if (kisisayisi >= 1) {
						System.out.println("Bilet Durumunuz ;\nROTA : " + yolAdi + " " + kisisayisi
								+ " Kisilik\nBILET TUTARI : " + (kisisayisi * biletFiyat) + "€");

						System.out.println("Lutfen Bakiyenizi giriniz");
						if (scan.hasNextInt()) {
							int bakiye = scan.nextInt();
							double paraUstu = bakiye - biletFiyat;
							if (bakiye>=biletFiyat) {
								
							
							System.out.println(yolAdi + " icin " + kisisayisi + " lik biletiniz icin " + bakiye
									+ "€ olan bakiyeniden " + biletFiyat + "€ odeme cekilmistir.\nParaustunuz "
									+ paraUstu + "€ ve kalan bakiyeniz " + (bakiye - biletFiyat) + "€ dur");

							}else System.out.println("Uzgunuz... Yetersiz bakiye");	} else
							System.out.println("Gecersiz bakiye");
					} else {
						System.out.println("Kisi sayisi gecerli degil. Tekrar deneyiniz");
					}
				} else {
					System.out.println("Lutfen gecerli kisi sayisi giriniz");
				}
			} else { // has next ifinin sonu
				System.out.println("Lutfen belirtilen guzergah numarasini dogru giriniz");

			}
		} else { // has next ifinin sonu
			System.out.println("Lutfen belirtilen guzergah numarasini dogru giriniz");
		}
		System.out.println(
				"𝓑𝓲𝔃𝓲 𝓽𝓮𝓻𝓬𝓲𝓱 𝓮𝓽𝓽𝓲𝓰𝓲𝓷𝓲𝔃 𝓲𝓬𝓲𝓷 𝓽𝓮𝓼𝓮𝓴𝓴𝓾𝓻 𝓮𝓭𝓮𝓻𝓲𝔃  𝓨𝓲𝓷𝓮 𝓫𝓮𝓴𝓵𝓮𝓻𝓲𝔃");
		scan.close();
	}
}
