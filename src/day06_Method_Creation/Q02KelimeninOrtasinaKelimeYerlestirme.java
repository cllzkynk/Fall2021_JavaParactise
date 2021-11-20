package day06_Method_Creation;

import java.util.Scanner;

/*
 * @author CELIL
 */
public class Q02KelimeninOrtasinaKelimeYerlestirme { /*
					 * name1 ve name2 degiskenlerini olusturun. name1 degiskeninin karakter sayisi
					 * cift ise kelimenin ortasina name2 yi yerlestirin. name1 degiskeninin karakter
					 * sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik"
					 * yazdirinan bir method olusturun e.g: name1= mehmet name2= ahmet Print ==>
					 * mehahmetmet
					 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki isim giriniz\nIsim1 :");
		String name1 = scan.next();
		System.out.println("Isim2:  ");
		String name2 = scan.next();

		yerlestir(name1, name2);

		scan.close();
	}

	public static void yerlestir(String name1, String name2) {
		int OrtaBul;

		if (name1.length() % 2 == 1) {
			OrtaBul = name1.length() / 2;
			System.out.println(name1.substring(0, OrtaBul)+"_" + name2+"_" + name1.substring(OrtaBul + 1));
		} else {
			OrtaBul = name1.length() / 2;
			System.out.println(name1.substring(0, OrtaBul)+"_" + name2+"_" + name1.substring(OrtaBul));
		}

	}

}
