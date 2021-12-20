/**
 * 
 */
package Emlak11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author CELİL
 */
public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String evTipi = null;
		String il = null;
		int odaSayisi = 0;
		double fiyat = 0;
		double total = 0; // toplam elimizdeki evlerin degeri ( Servetimizi gorelim )
		ArrayList<Emlak> envanter = new ArrayList<>();

		// Scanner scan = new Scanner(System.in);

		/*
		 * System.out.println("\t\t\t\t _______________________________________" +
		 * "\n\t\t\t\t/\\\t\t\t\t\t|\n\t\t\t       /  \\\t�?���?���?���?�? �?���?���?���?�?�?�� \t\t\t|\n\t\t\t      /    \\\t�?���?���?���?�?�?�� �?���?���?�� �?���?���?���?�? �?���?���?���?�?\t\t|\n\t\t\t   "
		 * + "  /      \\\t\t\t\t\t|" +
		 * "\n\t\t\t     --------------------------------------------" +
		 * "\n\t\t\t    |        |\t\t _______\t\t|" +
		 * "\n\t\t\t    |        |\t\t|\t|\t\t|" + "\n\t\t\t    |        |\t\t|\t|\t\t|"
		 * + "\n\t\t\t    |        |\t\t|\t|\t\t|" +
		 * "\n\t\t\t    |        |\t\t -------\t\t|" +
		 * "\n\t\t\t    |        |\t\t\t\t\t|" + "\n\t\t\t    |        |\t\t\t\t\t|" +
		 * "\n\t\t\t    |        |\t\t\t\t\t|" +
		 * "\n\t\t\t    ---------------------------------------------");
		 */

		while (true) {

			System.out.print("\n1-Ekle \n2-Listele \n3-Cik \nSecenek:");

			int secenek = scan.nextInt();

			if (secenek == 1) { // Switch case de deneyebilirsiniz secenek az oldugundan ifle yurumek istedim

				Emlak emlak1 = new Emlak(evTipi, il, odaSayisi, fiyat);

				envanter.add(emlak1);

			} else if (secenek == 2) {
				System.out.println("--------------------------------------");

				System.out.println("Envanter:");
				for (int i = 0; i < envanter.size(); i++) {
					total += envanter.get(i).getFiyat();
					envanter.get(i).listeleEmlak();
				}

				System.out.println("\nToplam Emlak Portfoyu : " + total + " TL");
				System.out.println("Toplam Emlak Sayisi   : " + envanter.size());

			} else if (secenek == 3) {
				System.out.println("Yine bekleriz..");
				break;

			} else {
				System.out.println("yanlis giris yaptiniz lutfen tekrar deneyiniz");
			}
		}
		scan.close();
	}
//Emlak emlak = new Emlak(++listeNo,evTipi, il, odaSayisi, fiyat, stokDurumu);
}
