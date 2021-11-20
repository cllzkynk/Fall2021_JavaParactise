package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02_UcgenEsitsizligi {

	public static void main(String[] args) {
		/*Kullanicidan 3 tene pozitif tam sayi alniz. bu uc sayinin ucgen olusturma
		 * durumunu kontrol ediniz eger ucgen olabiliyor ise, es kenar ucgen olma
		 * durumunu da kontrol edniz
		 * ucgen olma sarti :herhangi iki kenar toplami diger kenardan buyuk, herhangi
		 * iki kenar farki diger kenardan buyuk olmali a+b>c>a-b a+c>b>a-c b+c>a>b-c
		 * a=b=c ise es kenar ucgen
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Sirasiyla ucgenin kenarlarini giriniz \n1. kenar :");
		double k1 = input.nextDouble();
		System.out.println("2.kenar");
		double k2 = input.nextDouble();
		System.out.println("3.kenar");
		double k3 = input.nextDouble();

		if (((k1 + k2 > k3 && k3 > k1 - k2) && ((k1 + k3 > k2) && k2 > k1 - k3) && ((k2 + k3 > k1) && k3 > k2 - k3))
				&& k1 > 0 && k2 > 0 && k3 > 0) {
			System.out.println("Girilen uzunlular ile ucgen olusturulabilir.");
			if (k1 == k2 && k2 == k3) {
				System.out.println("Ve olusan ucgen eskanar ucgendir.");
			}else if ((k1 == k2 ||k1 == k3) || (k2 == k1 || k2 == k3) || (k3 == k1 || k3 == k2)) {
				System.out.println("Ve olusan ucgen ikizkenar ucgendir.");
			}
			if (k1 != k2 && k2 != k3 && k1 != k3) {
				System.out.println("Ve olusan ucgen cesitkenar ucgendir.");
			}

		} else {
			System.out.println("Girilen degerler  ile ucgen olusturulamaz.");
		}
		input.close();
	}
}
