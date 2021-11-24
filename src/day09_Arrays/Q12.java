package day09_Arrays;

import java.util.Arrays;

public class Q12 {

	public static void main(String[] args) {
	//Asagidaki multi dimensional array`in ic array`lerindeki tum elemanlarin 
	//toplamini birer birer bulan ve herbir sonucu yeni bir array`in elemani yapan
	// ve yeni array`i ekrana yazdiran bir program yaziniz  
	// Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}  
			
		int arr1[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 28 }, { 5, 1 } };
		int arrYeni[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arrYeni[i] += arr1[i][j];
			}
		}

		System.out.println(Arrays.toString(arrYeni));

	}

}
