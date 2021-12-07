package Practice.Practice_03;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// Kullanicidan notunu alin ve asagidaki kurallara gore ekrana A, B, C veya D yazdirin.
		// 1. 0()dahil ile 50 arasi - D   
		// 2. 50(dahil) ile 60 arasi - C
		// 3. 60(dahil) ile 80 arasi - B
		// 4. 80(dahil) ustu- A
		// Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		// switch() kullanarak yapiniz.
		
		// switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		// switch() de int, byte, short, char, String kullanilir.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen notunuzu giriniz : ");
		int not=scan.nextInt();
		
		if (not>=0 && not<50) {
		    not=50;
		} else if(not>=50 && not<60){
			not=60;
		}else if (not>=60 && not<80) {
			not=80;	
		}else if (not>=80 && not<=100) {
			not=100;
		}
		
		switch (not) {
		case 50: {
			System.out.println("notunuz : D");
			break;
		}
		case 60:{
			System.out.println("notunuz : C");
			break;
		}case 80: {
			System.out.println("notunuz : B");
			break;
		}
		case 100:{
			System.out.println("notunuz : A");
			break;
		}default:
			System.out.println("gecerli not giriniz");
		break;
		}
		scan.close();
	}	
	}
