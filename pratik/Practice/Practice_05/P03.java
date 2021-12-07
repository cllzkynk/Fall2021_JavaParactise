package Practice.Practice_05;

import java.util.Scanner;

public class P03 {

	public static void main(String[] args) {
		 // Kullanicidan 2 sayi aliniz.
         // 1. sayi taban
         // 2. sayi Ust
         // 1 sayinin ussunu hesaplatan bir kod yaziniz.
         // 3, 2 --> 3^2 = 3*3 = 9

         // 2, 5 --> 2^5= 2*2*2*2*2 = 32

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen taban ve uss giriniz : ");
        
        int taban=scan.nextInt();
        int uss=scan.nextInt();
        
        
        
        int sonuc=1; // sonuca etki etmeyecegi icin 1 dedik.
        while (uss!=0) {
			sonuc*=taban;
			uss--;
		}
        System.out.println("While cozumu :) Girdiginiz tabanin uss kuvveti : " + sonuc);
        
        // for ile cozersek ;
        
        for (int i =1; i<uss; i++) {
        	sonuc*=taban;
        	}
        System.out.println("for cozumu:) Girdiginiz tabanin uss kuvveti : "+sonuc);
        
        
        
        scan.close();
	}

}
