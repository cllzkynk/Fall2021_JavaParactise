package day08_While_DoWhile;

import java.util.Scanner;

public class Q01Armstrong {

	public static void main(String[] args) {
        // verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

		Scanner scan = new Scanner(System.in);
		System.out.println("Amstrong sayiya aday bir sayi gir");
		int ady = scan.nextInt();
		int depo = ady;

		String aday = Integer.toString(ady);
		int uzunluk = aday.length() - 1;
		if(uzunluk<2) {
			uzunluk=2;
		}else {
			 uzunluk= uzunluk;
		}

		int basamak = 0;

		int total = 0;

		while (ady != 0) {
			int basamakDepo = 1;
			basamak = ady % 10;
			for (int i = uzunluk; i >= 0; i--) {
				basamakDepo *= basamak;
			}

			total = total + basamakDepo;
			// basamakDepo=1;

			ady /= 10;

		}

		if (total == depo) {
			System.out.println(depo + "  is an Amstrong number");
		} else {
			System.out.println(depo + "  is not an Amstrong number");
		}
System.out.println("entered num is  "+depo+" digit sum is "+total);
		scan.close();
	}

}
