package Java_Review_Turkish;

import java.util.Scanner;

public class day1 {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		System.out.println("      1");
		System.out.println("    1   1");
		System.out.println("  1    2   1");
		System.out.println(" 1   3   3   1");
		System.out.println("1  4   6   4   1");
		
		
		
		System.out.println("      A");
		System.out.println("     B  B");
		System.out.println("    C    C");
		System.out.println("   D      D");
		System.out.println("  E        E");
		System.out.println(" F          F");
		System.out.println("  E        E");
		System.out.println("   D      D");
		System.out.println("    C    C");
		System.out.println("     B  B");
		System.out.println("       A ");
		
		
		System.out.println("Sağliğin İçin \"Evde Kal\".");
		
		System.out.println("Would you like \'coffe\' or \'tea\'?");
		
		double db= 10.211;
		
		int num1= (int)db;
		
		System.out.println(num1);
		
		int a=11;
		int b=5;
		double pi=3.14;
		
		System.out.println(a*b);
		System.out.println(a*3.14);
		System.out.println(b/a);
		System.out.println(a*b/pi);
		System.out.println(a+b+pi);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(-pi/a);
		System.out.println((a+b)/pi);
		System.out.println((b/pi)*a);
		
		
		
		System.out.println("hi "+21);
		System.out.println("hi " +  "Harun");
		System.out.println(5 + "TechProEd"+ 2+0+3);
		System.out.println("TechproEd305");
		System.out.println(2+0+5 + "TechProEd"+"305");
			
		System.out.println(-5 + (8*6));
		System.out.println((55+9)% 9);
		System.out.println(20+-3*5/8);
		System.out.println(5+15/3*2-8%3);
		
	
		int num=10;
		num+=100;// toplamı verir
		
		System.out.println(num);
		
		System.out.println(Math.pow(2, 3));// kuvveti
		System.out.println(Math.sqrt(144));//karekok
		System.out.println(Math.round(2.7));// tamamlama,yuvarlama
		
		
		double en = 5.6;
		double boy = 8.5;
		 double cevre = 2* (boy +en);
		double alan = en * boy;
		 
		System.out.println("Çevre= " +cevre);
		System.out.println("Alan= " +alan);
		
		//Kullanıcıdan Dikdörtgenin kenar uzunluğunu alan ve sonra bu dikdörtgen alan ve
		//çevresini hesaplayıp ekrana yazdıran bir program yazınız.
		//integer kullanınız
		//Not: Alan: Boy x En
		//Not: Çevre: 2x (Boy + En)
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lütfen Dikdörtgenin Boy uzunluğunu giriniz: ");
		int boy1=klavye.nextInt();
		System.out.println("Lütfen Dikdörtgenin En uzunluğununu giriniz: ");
		int en1= klavye.nextInt();
		int alan1=boy1*en1;
		int cevre1=2*(boy1+en1);
		System.out.println("Alan= "+alan1);
		System.out.println("Çevre= "+cevre1);
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lutfen 1. sayıyı giriniz:");
		
	int sayi1 = sc.nextInt();
			System.out.println("Lutfen 2. sayıyı giriniz:");
	int sayi2 = sc.nextInt();
			System.out.println("Lutfen 3. sayiyi giriniz:");	
	int sayi3 = sc.nextInt();
	int toplam= (sayi1+sayi2+sayi3);
	System.out.println("Üç Sayının Toplamı= " +toplam);
	
	// veya şağıdaki şekilde
	
	
	
	
		
		
		
		
		
	
		
		
		
		
			
		
		

		
	
		
		
		
		
		sc.close()		;
		
	klavye.close()	;
		
	}

}
