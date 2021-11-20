package day07_ForLoop;

import java.util.Scanner;

public class Q10_SesliSessizHarfHoca {
	 /*Kullanıcıdan bir harf girmesini isteyiniz. 
    Girilen harf sesli ise Sesli harf olduğunu,
   değilse sessiz harf olduğunu ekrana yazdırsın. 
   Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. 
     (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
​
   Sesli harfler: a,e,i,o,u
​
   Test Data:
   a
​
   Beklenen Çıktı:
   a harfi sesli harfdir.
​
   Test Data:
   d
​
   Beklenen Çıktı:
   d harfi sesiz harftir.
​
   Test Data:
   we  yada %
​
   Beklenen Çıktı:
   Yanlis karakter girdiniz!
​
    */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("lutfen bir harf giriniz");
    	String harf=scan.nextLine();
    	String sesliharf="aeiouAEOUI";
    	String sessizler="bcdfghkjlmnprstvyzwq";
    	
    	
    	if (harf.length()==1) {
			
		
    	for (int i = 0; i < 100; i++) {
    		if (harf.charAt(0)==sesliharf.charAt(i)) {
				System.out.println("Girilen harf sesli");
				break;
			}if (harf.charAt(0)==sessizler.charAt(i))
				System.out.println("Girilen harf sessiz");
			break;
		}
    } else {
    	System.out.println("Yanlis karakter girdiniz");
    }
       scan.close();
    }
}

