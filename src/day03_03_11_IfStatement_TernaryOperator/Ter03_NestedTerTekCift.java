package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03_NestedTerTekCift {

	public static void main(String[] args) {
        // Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı�? yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı�? yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.�?

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lutfen negatif olmayan bir tam  sayi giriniz");
    	
    	if (scan.hasNextInt()) {
    		int sayi=scan.nextInt();
    System.out.println(0<=sayi?((100 <= sayi && sayi <=999) ? 
    		"Girilen sayi uc basamaklidir":(sayi%2==0)? "girilen sayi uc basamakli olmayan cift sayidir":
    			"Girilen sayi   uc basamakli olmayan tek sayidir"):"negatig girme dedik dayiii");		
			
		} else {
			System.out.println("tam sayi diyok emmi");
		}
    scan.close();	
    }
}