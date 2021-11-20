package day01_27_10_Odevler;

import java.util.Scanner;

public class Q2_SeciliRakamlar_Toplami {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
		 *   Ex :
		 *   input  : 12345
		 *   output : 12  */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen 5 basamakli bir tam sayi giriniz");
		
		int sayimiz=scan.nextInt();
		 // burada 100ler basamagini toplamam katmamak lazim birler onlar son iki basamak 
		// 100leri atla binler ve onbinler basamaklarini topla diyor 
		
		int birler= (sayimiz%10) ;         //birler basamagi elde
		int onlar = (sayimiz/10)%10 ;      //onlar basamagi elde
		int yuzler =(sayimiz/100)%10 ;     //  aslinda bu lazim degil spor olsun diye bulduk bu da yuzler basamagi elde
		int binler=(sayimiz/1000)%10;      // binler basamagi elde
		int onBinler=(sayimiz/10000)%10;   // onbinler basamagi elde 
		
		// simdi  yuzler basamagi rakami haric topla diyor 
		
		System.out.println("Girilen sayinin ilk iki ve son iki rakami toplami :  "
		+ (birler+onlar+binler+onBinler));
		
		scan.close();
	}

}
