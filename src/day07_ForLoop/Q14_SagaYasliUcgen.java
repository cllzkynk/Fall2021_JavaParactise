package day07_ForLoop;


public class Q14_SagaYasliUcgen {

    /*  Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

    public static void main(String[] args) {

               int boyut=5;

       for (int i = 0; i <=boyut; i++) {
    	   for (int j = boyut-i; j >=0 ; j--) {
			System.out.print(" ");}
			for (int j2 =boyut-i; j2 <= boyut; j2++) {
				System.out.print("*");
				
			}
			 System.out.println();	
			}
    	  
		}
		
	}
        
        
    

