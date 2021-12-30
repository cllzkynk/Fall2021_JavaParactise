package genelTekrar;

import java.util.Scanner;

public class Karekok {

	public static void main(String[] args) {
// Kullanıcıdan bir tamsayı isteyip, sayının karekökünü bulan bir program yazınız.
//		Sonuçta virgülden sonra 3 rakam olmalıdır.
//		Ör : Input =2 Output=1,415
//		    Input =9 Output=3,000
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int input = scan.nextInt();
		
		double count = 0;
		for(double i=1; i*i<input; i+=0.001) {
				count=i;
			
		}
		System.out.println("Karekok "+count);
		System.out.printf("girdiginiz sayi=%-10d, karekoku %.3f", input,count);

	}
	
	

}
