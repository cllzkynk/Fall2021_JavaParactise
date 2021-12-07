package Practice.Practice_02;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
		 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
		    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
		     
		     Ucgen olma sarti :herhangi iki kenar toplami diger kenardan buyuk,
		     * herhangi iki kenar farki diger kenardan buyuk olmali
			 a+b>c>a-b
			 a+c>b>a-c  
		     b+c>a>b-c  
			a=b=c ise es kenar ucgen 
			 
		 */
		
Scanner scan = new Scanner (System.in);


System.out.print("a kenarini giriniz : ");
int a=scan.nextInt();
System.out.print("b kenarini giriniz : ");
int b=scan.nextInt();
System.out.print("c kenarini giriniz : ");
int c=scan.nextInt();

if (a+b>c && a-b<c && a+c>b && a-c<b && b+c>a && b-c<a) {
	if (a==b && b==c) {
		System.out.print("Bu bir eskanar ucgendir");
	}else
		System.out.print("Bu bir eskanar ucgen degildir");
	}else 
		System.out.print("bu bir ucgen degildir");
	
	
scan.close();

	}
	
	}


