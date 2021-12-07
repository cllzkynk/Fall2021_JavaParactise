package Practice.MapsMethods;

import java.util.HashMap;
import java.util.Map;

public class NestedMap {

    public static void main(String[] args) {


		/*

		 KimlikNo	: ad    : Nilüfer
		 1213  		  soyad : Demir
		 			  Adres : Ankara
		 			  bolum : dev

		 KimlikNo	:  ad    : ayşe
		 9856		   soyad : Can
		 			   Adres : Ankara
		 			   bolum : qa


		 */

        HashMap<Integer, HashMap<String, String>> kisiListesi = new HashMap<>();

        HashMap<String, String> kisi1 = new HashMap<>();
        kisi1.put("ad", "Nilufer");
        kisi1.put("soyad", "Demir");
        kisi1.put("adres", "Ankara");
        kisi1.put("bolum", "dev");

        kisiListesi.put(1213, kisi1);
        System.out.println("1. kisi : " + kisiListesi.put(1213, kisi1));
        // 1. kisi : {ad=Nilufer, soyad=Demir, adres=Ankara, bolum=dev}

        HashMap<String, String> kisi2 = new HashMap<>();
        kisi2.put("ad", "Ayse");
        kisi2.put("soyad", "Can");
        kisi2.put("adres", "Ankara");
        kisi2.put("bolum", "qa");

        kisiListesi.put(9856, kisi2);
        System.out.println("2. kisi : " + kisiListesi.put(9856, kisi2));
        // 2. kisi : {ad=Ayse, soyad=Can, adres=Ankara, bolum=qa}

        System.out.println(kisiListesi);
        // {9856={ad=Ayse, soyad=Can, adres=Ankara, bolum=qa}, 1213={ad=Nilufer, soyad=Demir, adres=Ankara, bolum=dev}}

        // maplarden data getirme
        System.out.println(kisiListesi.get(1213).get("ad")); // Nilufer
        //mapte get methodu ile value ya karşılık gelen mapi getirdi...

        System.out.println("----------------------------------------");

        for (Map.Entry<Integer, HashMap<String, String>> entry : kisiListesi.entrySet()) {
            System.out.println(entry.getValue().get("ad") + " " + entry.getValue().get("soyad") + " " +
                    entry.getValue().get("bolum"));
            // Ayse Can qa
            // Nilufer demir dev


        }

    }
}