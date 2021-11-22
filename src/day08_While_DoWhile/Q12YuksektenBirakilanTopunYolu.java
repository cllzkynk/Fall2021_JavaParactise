package day08_While_DoWhile;

import java.util.Scanner;

public class Q12YuksektenBirakilanTopunYolu {

    //Bir top 220 m  yukseklikten atilmaktadir.
    // Atildiktan sonra, atildigi yuksekligin 3/4 u kadar yerden yukari dogru ziplamaktadir
    // Top ziplama  yuksekligi 1 metrenin altina indiginde durmaktadir.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayisini bulunuz.

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	System.out.println("yuksekligi gir");
    	double metre =scan.nextDouble();
    	int count=0;
    	
    	double yol=0;
    	
    	for (double i =metre; i >=1; i=i*3/4) {
			yol+=i+i*3/4;
			
			count++;
		
		}
    	System.err.println("top toplam "+count+ " defa yere vurdu ve toplam  "+ yol+"  metre  yol aldi");
  scan.close() ; }
}
