package filTahminOyunu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FilmTahminOyunu {
	public static void main(String[] args) {
/******************************Filmi Tahmin Et Oyunu**************************************
         *  1. Bir tane film  isim listesi olusturun 
         *  2. Kullanicadan liste uzunlugunda bir sayi isteyip, o siradaki filmi cagirin.. 
         *  3. filmin ismindeki harfleri "-" olacak sekilde  ceviririp kullaniciya gösterin. 
         *  4. Kullanicidan bir harf tahmin etmesini  isteyin 
         *  5. Bu harfin isimde olup olmadigini kontrol edin. 
         *  6. Girilen harf  dogruysa ismin tamaminda bu harfi gösterin. 
		 * 7. Toplam kac yanlis harf tahmin  edildigini gösterin ve limit asildiysa kaybettin yazdirin. 
		 * 8. Eger hepsi  dogru tahmin edildiyse kazandin yazdirin.  */
		
		
		
		Scanner scan = new Scanner(System.in);
		List<String> filmListesi = new ArrayList<>();
		filmListesi.addAll(Arrays.asList("Titanik", "Yuzuklerin Efendisi", "God Father", "Mucize Doktor", "Cesur yurek",
				"Zubuk", "Matrix", "Anakonda", "Babam ve Oglum"));
		Random rd = new Random();
		int filmSira = rd.nextInt(filmListesi.size());

		String gizliIsim = filmListesi.get(filmSira).toUpperCase().replaceAll("\\S", "-");
		System.out.println(gizliIsim);

		int tahminSayisi = 0;
		int hataliGiris = 0;

		do {
			System.out.println("Hakkiniz     : " + (filmListesi.get(filmSira).length() + 2 - tahminSayisi)
					+ "\nHatali Giris : " + hataliGiris);
			System.out.println("Lutfen bir harf tahmin ediniz : ");
			String  harf = scan.next().toUpperCase().substring(0, 1);
			if (!filmListesi.get(filmSira).toUpperCase().contains(harf)) {
				hataliGiris++;
			}

			List<Integer> indexList = new ArrayList<>();

			for (int i = 0; i < filmListesi.get(filmSira).toUpperCase().length(); i++) {
				if (filmListesi.get(filmSira).toUpperCase().charAt(i)==harf.charAt(0)) {
					indexList.add(i);
				}

			}

			for (int i = 0; i < indexList.size(); i++) {
				gizliIsim = gizliIsim.substring(0, indexList.get(i))
						+ filmListesi.get(filmSira).substring(indexList.get(i), indexList.get(i) + 1)
						+ gizliIsim.substring(indexList.get(i) + 1);
			}
			System.out.println(gizliIsim);
			tahminSayisi++;
		} while (tahminSayisi < gizliIsim.length() + 2
				&& !gizliIsim.toUpperCase().equals(filmListesi.get(filmSira).toUpperCase()));

		System.out.println("Game over");
		System.out
				.println(filmListesi.get(filmSira).length() + 2 - tahminSayisi > 0 ? "Tebrikler" : "Baska zaman artik");

	scan.close();}

}