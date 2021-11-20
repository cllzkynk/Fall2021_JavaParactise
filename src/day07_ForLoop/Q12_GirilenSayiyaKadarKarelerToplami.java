package day07_ForLoop;

public class Q12_GirilenSayiyaKadarKarelerToplami {
	public static void main(String[] args) {

		/*
		 * Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin ve 1'den girilen
		 * tam sayıya kadar olan sayıların karelerinin toplamını hesaplayan kodu
		 * yazınız.
		 * 
		 * Örnek Ekran Çıktısı Girilen sayı=4 Kareler toplamı=30
		 */

		int toplam = 0;
		int a = 6;
		for (int i = 0; i <= a; i++) {
          toplam+=i*i;
          System.out.println(i+"===>"+toplam);
		}
System.out.println(toplam);
	}
}
