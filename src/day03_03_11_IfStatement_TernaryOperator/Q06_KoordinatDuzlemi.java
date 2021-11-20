package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06_KoordinatDuzlemi {
    public static void main(String[] args) {
        //// Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

    	Scanner scan = new Scanner(System.in);
		System.out.println("Koordinat noktasi (x,y) seklinde iki degiskenden olusur.\nKoordinat duzlemi 4 bolgeye ayrilir\n"
				+ "Lutfen hangi bolgede oldugunu ogrenmek istediginiz koordinat noktalarini giriniz \nx:");
		double x=scan.nextDouble();
		System.out.println("y:");
		double y=scan.nextDouble();
		
		if (x<0 && y<0) {
			System.out.println("Girdiginiz nokta koordinat duzleminin 3. bolgesindedir");
		} else if (x>0 &&y>0) {
			System.out.println("Girdiginiz nokta koordinat duzleminin 1. bolgesindedir");
		}else if (x<0 &&y>0) {
			System.out.println("Girdiginiz nokta koordinat duzleminin 2. bolgesindedir");
		}else if (x<0 &&y>0) {
			System.out.println("Girdiginiz nokta koordinat duzleminin 1. bolgesindedir");
		}else if (x==0 && y!=0) {
			System.out.println("Girdiginiz nokta koordinat duzleminde y_ekseni uzerindedir ");
		}else if (x!=0 &&y==0) {
			System.out.println("Girdiginiz nokta koordinat duzleminde x_ekseni uzerindedir");
		}
		scan.close();
    }
}
