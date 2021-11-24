package day09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
	static int i=0;
	public static void main(String[] args) {
		// kullanicidan alinan bir String'deki herbir karakterin adedini bir array
		// icinde yazdiran bir java programi yazin.
		// String "Javacilar cook afilli" ise cevap soyle olmalidir:
		// { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}

		Scanner scan = new Scanner(System.in);
		System.out.println("bisiler gir");
		String str = scan.nextLine().toLowerCase();
		String arr[] = str.split("");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		harfsay(arr);
		tekle(arr);
		
		
		
		
	
System.out.println(tekle(arr));
//System.out.println(harfsay(arr[i]));
	}

	public static String tekle(String[] arr) {
		String str = "";
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[i].charAt(0) != arr[j].charAt(0) && i != j) {
					str += arr[i];
					break;
				}
				;
			}

		}
		return str;
	}

	public static int harfsay(String[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
count=0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i].charAt(0) == arr[j].charAt(0) && i != j) {
					count++;
				}
				;
			}
		}

		return count;
	}

}
