package day09_Arrays;

import java.util.Arrays;

public class Q08Teacher {

	public static void main(String[] args) {

		/*
		 * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun String str =
		 * "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
		 */
		String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
		String arr[] = str.split(" ");
		System.out.println(Arrays.toString(arr));
		int topDolar = 0;
		int topSterlin = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("$")) {
				topDolar += Integer.parseInt(arr[i].replace("$", ""));
			} else {
				topSterlin += Integer.parseInt(arr[i].replace("£", ""));
			}
		}
		System.out.println("toplam dolar tutari :" + topDolar);
		System.out.println("toplam sterlin tutari :" + topSterlin);
	}
}