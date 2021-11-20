package day06_Method_Creation;

import java.util.Scanner;

public class Q10_powerOfThreeMethod {

    /*
     Problem Tanimi :
        powerOfThree isminde bir method olusturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayi verildiginde, 3 ussu olup olmadigini teyit edin. 3'un ussu(kuvveti) ise true, degilse false dondurun.
        Ornek 1:
        Girdi: 27
        Cikti: true
        ACiklama: 3*3*3 =27
        SonuC= true

        Ornek 2:
        Girdi: 0
        Cikti: false
        Ornek 3:
        Girdi: 9
        Cikti: true
        ACiklama: 3*3 = 9
        SonuC= true

        Ornek 4:
        Girdi: 45
        Cikti:: false
        ACiklama: 3*3*3*3 =81
        SonuC= false
        45, 3un ussu (kuvveti) degildir.
     */
  public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("lutfen 3un kuvveti olmaya aday bir sayi giriniz");
	int sayi=scan.nextInt();	
	
	
	powerOfThree(sayi);
	
	
	System.out.println("Girilen sayinin 3un kuvveti olmasi durumu : "+powerOfThree(sayi)); 
	scan.close();
}

	public static boolean powerOfThree(int n) {
		int ucunkuvvetleri=1;
		
		do {
			ucunkuvvetleri*=3;
			
		} while (ucunkuvvetleri<n);
		if (ucunkuvvetleri==n) {
			return true;
		}else {
			return false;
		}
		

		
	}
    
}
