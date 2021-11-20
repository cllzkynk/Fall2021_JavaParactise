package day01_27_10_Odevler;

import java.util.Scanner;

public class Q5_VucutKitleEndeksi {

	public static void main(String[] args) {
		/*
		 * Kullanicidan kilosunu ve boyunu alip Vucut kitle indeksini hesaplayan bir
		 * program yaziniz. Ipucu : Vucut Kitle Indeksi (VKI) = Vucut Agirligi(kg.) /
		 * Boy uzunlugunun karesi (m.) ORNEK: INPUT : Kilo: 71 Boy: 1,72 OUTPUT : Vucut
		 * Kitle Indeksiniz : 23
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kilonuzu ve boyunuzu giriniz: ");

		int kilo = scan.nextInt();
		double boy = scan.nextDouble();

		System.out.println((int) (kilo / (boy * boy)));
		
		scan.close();
	}

}
