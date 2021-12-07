package Practice.hashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Kitapci {
	
	static Scanner scan=new Scanner(System.in);
	static HashMap<Integer,String> kitap=new HashMap<>(); // 3. adim
	

	public static void main(String[] args) {
	
		
		/* Bir kitapci icin program yapalim
	     *
	     * Kitap no 1000'den baslayarak sirali no olsun
	     * Her kitap icin kitapAdi, yazarAdi,yayinYili,fiyati bilgilerini girelim
	     *
	     * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini sorsun // 1. adim ve 2. adim
	     * 1- kitap ekle
	     * 2- numara ile kitap goruntule
	     * 3- bilgi ile kitap goruntule
	     * 4- numara ile kitap sil
	     * 5- Tum kitaplari listele
	     * 6- Bitir
	     */
		
		topluKitapEkle(); // 4. adim da method olusturuyoruz..
		
		menu(); // 1. adim menu isminde method olustur ve 6 maddeyi yazdiralim...

	}

	public static void menu() { // 

		System.out.println("1-Kitap ekle \n" + "2-Numara ile kitap goruntule \n" + "3-Bilgi ile kitap goruntule \n"
				+ "4-Numara ile kitap sil \n" + "5-Tum kitaplari listele \n" + "6-Cikis");

		// 2. adim Scanner ve Switch olusturmaliyiz..
		
		System.out.println("Hangi islemi yapmak istiyorsunuz");
		int secim = scan.nextInt();
		switch (secim) {
		case 1:
			kitapEkle();
			break;
		case 2:
			noIleGoruntule();
			break;
		case 3:
			bilgiIleGoruntule();
			break;
		case 4:
			noIleSil();
			break;
		case 5:
			listele();
			break;
		case 6:
			cikis();
			break;
		default:
			break;
		}
		
		// 3. adimda ise static bir HashMap oluturuyoruz.. key ve value olacak... 

	}

	public static void cikis() {
		// TODO Auto-generated method stub

	}

	public static void listele() {

		for (Entry<Integer, String> entry : kitap.entrySet()) { // for each ile yapildi...Entry class i...
			System.out.println("No = " + entry.getKey() + ", Kitap Bilgileri= " + entry.getValue());
		}
	}

	private static void noIleSil() {
		// TODO Auto-generated method stub

	}

	private static void bilgiIleGoruntule() {

		scan.nextLine();
		System.out.println("Hangi bilgi ile goruntuleme yapmak istiyorsunuz");
		String bilgi = scan.nextLine();

		int flag = 0;

		for (Entry<Integer, String> entry : kitap.entrySet()) {
			if (entry.getValue().contains(bilgi)) {

				System.out.println("No = " + entry.getKey() + ", Kitap Bilgileri= " + entry.getValue());
				flag = 1;
			}

		}
		if (flag == 0) {

			System.out.println("aradiginiz kritere uygun kitap bulunamadi");
		}

		menu();

	}

	private static void kitapEkle() {
		// TODO Auto-generated method stub

	}

	public static void noIleGoruntule() {

		System.out.println("listelemek istediginiz kitap numarasini girin");
		int kitapNo = scan.nextInt();

		System.out.println(kitap.get(kitapNo));

	}

	public static void topluKitapEkle() {
		kitap.put(9999, "ali can evde, ali han, 2001, 11");
		kitap.put(9998, "ali can yolda, ali han, 2005, 10");
		kitap.put(9997, "yanlizlik, Veli Kul, 2005, 21");
		kitap.put(9996, "Sen, Ayse Unal, 2005, 30");
	}

}