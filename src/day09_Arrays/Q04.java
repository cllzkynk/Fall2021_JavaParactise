package day09_Arrays;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * verilen bir int Arrayde toplamlari istenen degere esit olan sayi ciftlerini
		 * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
		 * istenenToplam=9;
		 */
		int istenenToplam = 9;
		int[] arr = { 5, 7, -6, 4, 2, 15, 3, 8, 1};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == istenenToplam && i > j) {
					System.out.println(
							i + ". indeks + " + j + ". indeks =>\n" + arr[i] + " + " + arr[j] + " = " + istenenToplam);

					System.out.println("============================;");
				}
			}
		}

	}

}
