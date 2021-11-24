package day09_Arrays;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde
		// kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)

		int arr[] = new int[8];
		Scanner scan = new Scanner(System.in);
		System.out.println("Listenizin elemanlarini giriniz");
		int i = 0;
		String str = "";
		do {

			int giris = scan.nextInt();
			arr[i] = giris;
			i++;
			if (i == 8) {
				System.out.println("bittiiii");
			} else {
				System.out.println("Devam devam");
			}
		} while (i < 8);

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 3 == 0) {
				str += arr[j] + " ";
			}
		}

		System.out.println("Girilen dizede 3 e bolunen sayilar ===> " + str);

		scan.close();
	}

}
