package day01_27_10_Odevler;

import java.util.Scanner;

public class Q3_HipotenusBulma {

	public static void main(String[] args) {
		/*
		 * Problem Tan�m� Bir dik ��genin iki dik kenar�n� alarak hipoten�s�n�
		 * hesaplayan kod yaz�n�z. �rnek Ekran ��kt�s� birinci kenar: 12 ikinci kenar: 5
		 * hipotenus: 13
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen  dik ucgenimizin kenar uzunluklarini giriniz ");
		
		double k1 , k2  ;
		 k1=scan.nextDouble();
		 k2=scan.nextDouble();
		 
		 System.out.println("Dik kenarlari girilen ucgenin hipotenusu : "+ Math.sqrt(k1*k1+k2*k2));
		 
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
