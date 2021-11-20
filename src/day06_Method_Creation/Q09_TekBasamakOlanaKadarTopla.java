package day06_Method_Creation;

import java.util.Scanner;

public class Q09_TekBasamakOlanaKadarTopla {
	public static void main(String[] args) {
		/*Problem Tanimi: addDigits isminde bir method olusturun. Parametresi int
		 * Return tipi de int Pozitif int degerler ver ve en son sonuc tek basamakli
		 * cikana kadar basamaklari birbiriyle topla. Tek basamakli ciktiginda, dondurun
		 * 
		 * Ornek1: Girdi 38 Cikti: 2 Aciklama: Islemler soyle olacak: 3 + 8 = 11, 1 + 1
		 * = 2. 2 , tek basamakli oldugundan, bunu dondurun. */

		Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        
        int num=scan.nextInt();
        
        addDigits(num); 
        scan.close();
    }
    private static int addDigits(int num) {
        nasil("agam kolay gelsin method run oluyor");
        
        for (int i = 0; i < 5; i++) {
            num=sum(num);
        
        if (num<10) 
            break;
        }
        return num;
    }
    private static int sum(int num) {
        
        int toplam =0;
        int rakam =0;
        while (num>0) {
            
            rakam = num%10;
            toplam+=rakam;
            num/=10;
        }
        System.out.println("Girdiginiz sayinin rakamlar toplami: "+toplam);
    
        return toplam;
    }
    private static void gozunAydin(String goygoy) {
        System.out.println("gozunAydin calisti "+goygoy);
        
    }
    private static void nasil(String mesaj) {
        System.out.println("nasýl methodu calisti:"+mesaj);
        
        gozunAydin("helal olsun bu method calisti ise dewamkeee");
        
    }
    
    
}
