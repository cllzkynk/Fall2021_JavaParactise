package goemetrikHesaplama;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Cemberin yaricapini gir==>");

		Cember c = new Cember(scan.nextDouble());
		c.cevreHesaplama();
		System.out.println(c);

		System.out.print("\nKarenin kanarini giriniz==>");
		double kare = scan.nextDouble();
		Kare k = new Kare(kare, kare);
		k.alanHesaplama();
		k.cevreHesaplama();
		System.out.println(k);

		System.out.print("\nDikdortgenin kisa kenarini giriniz==>");
		double dikkisa = scan.nextDouble();
		System.out.print("Dikdortgenin uzun kenarini giriniz==>");
		double dikuzun = scan.nextDouble();
		Dikdortgen d = new Dikdortgen(dikkisa, dikuzun);

		d.alanHesaplama();
		d.cevreHesaplama();
		System.out.println(d);
		
		
		scan.close();
	}

}
