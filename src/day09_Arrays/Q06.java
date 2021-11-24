package day09_Arrays;



public class Q06 {
	public static void main(String[] args) {

		/*
		 * write a java program to find the second largest number in the array? Maximum
		 * and minimum number in the array? (Dizideki en buyukk ikinci sayiyi, maksimum
		 * ve minimum sayiyi bulmak icin bir java programi yazin)
		 * 
		 * int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
		 * 
		 */

		int[] arr = { 100, 10001, 10002, -90, 845, 8787, 898, 0, 1, -90 };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int max_2 = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max_2 && arr[i] < max) {
				max_2 = arr[i];
			}

		}
		System.out.println("max = " + max + "\nMin = " + min + "\n2.en buyuk = " + max_2);

	}

}
