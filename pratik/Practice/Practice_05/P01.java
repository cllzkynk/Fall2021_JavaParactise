package Practice.Practice_05;

import java.util.Scanner;

public class P01 {

	public static void main(String[] args) {

		// Kullanicidan alinan bir sayinin
		// Armstrong sayi olup olmadigini kontrol eden program yazin
		// Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
		// 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen Armstrong oldugunu kontrol edeceginiz tamsayiyi yaziniz : ");
		int sayi = scan.nextInt();
		int ilkdeger = sayi;// ilk deger atanmaz ise sayi degeri while islemden sonra degiserek 0 oluyor.
		int rakam;
		int kuplerToplami = 0;

		while (sayi != 0) {
			rakam = sayi % 10;
			sayi /= 10;
			kuplerToplami += rakam * rakam * rakam;
		}
		if (kuplerToplami == ilkdeger) {
			System.out.println("gayet basarili girdiginiz sayi amstrong sayidir :)");

		} else
			System.out.println("maalesef giridiginiz sayi amstrong sayi degildir :( ");

		scan.close();
	}

}