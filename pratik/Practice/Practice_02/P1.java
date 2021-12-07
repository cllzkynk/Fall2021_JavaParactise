package Practice.Practice_02;

import java.util.Scanner;

	public class P1 {

	public static void main(String[] args) {
						
		 /*  Problem Tanimi
        Bir dik ucgenin iki dik kenarini alarak hipotenusunu hesaplayan kod yaziniz.

        Ornek Ekran ciktisi
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13    
       kok almak icin Math.sqrt(sayi) metodunu kullaniniz
         */

Scanner scan=new Scanner(System.in);
System.out.print("a dik kenarini giriniz : ");
int a=scan.nextInt();

       
System.out.print("b dik kenarini  giriniz : ");
int b=scan.nextInt();

double h =Math.sqrt((a*a)+(b*b));
System.out.println("Ucgeninizin hipotenusu :"+h);

scan.close();
    }
	
	
}
