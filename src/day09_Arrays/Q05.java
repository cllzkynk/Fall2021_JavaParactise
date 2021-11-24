package day09_Arrays;

import java.util.Arrays;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * write a java program that calculates the average value of array elements
		 * Print elements that are greater than avarage (dizi elemanlarinin ortalama
		 * degerini hesaplayan ve ortalamadan buyuk olan elemanlari yazdiran bir java
		 * programi yazin) input[]= {1,2,3,4,5,6,7} Output : 4
		 */
		int arr[] = { 1, 2, 3, 4, 5, 6, 7,8 };
		double ort = 0;
		double top = 0;
		int count = 0;
		int indexcount = 0;
		for (int i = 0; i < arr.length; i++) {
			top += arr[i];
		}
		ort = top / arr.length;
		//System.out.println("Ortalama   =  "+ ort);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > ort) {
				count++;
			}
		}
		//System.out.println("Count  =   "+count);
		int arrByk[] = new int[count];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arrByk.length; j++) {

				if (arr[i] > ort) {

					arrByk[j + indexcount] = arr[i];
					indexcount++;
					break;
				}
			}
		}
System.out.println("Ortalamanin ustu olanlarin olusturdugu array "+Arrays.toString(arrByk));
	}

}
