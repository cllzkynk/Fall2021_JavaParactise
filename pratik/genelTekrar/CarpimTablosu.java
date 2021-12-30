package genelTekrar;

import java.util.Scanner;

public class CarpimTablosu {

	public static void main(String[] args) {
//		Kullanıcıdan bir tamsayı isteyip, çarpım tablosu oluşturan bir program yazın
//		Ör : Input =3 Output= 1 2 3
//		                      2 4 6
//		                      3 6 9
//		Ipucu : printf(%4d) kullanın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int input = scan.nextInt();
		
		for (int i = 1; i <=input; i++) {
			for (int j = 1; j <=input; j++) {
				System.out.printf("%4d",i*j);
				
			}
			System.out.println("");
			
		}
			
		}

	}


