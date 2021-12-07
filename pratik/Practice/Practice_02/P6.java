package Practice.Practice_02;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		 /*  Problem Tanimi
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        (ipucu: Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        baglantisindan yararlanabilirsiniz)

        Ornek Ekran Ciktisi
        birinci kenari giriniz: 2
        ikinci kenari giriniz 15
        ucuncu kenari giriniz: 7
        Bu bir dik ucgen degildir.

        Bu bir dik ucgendir
     */
		
Scanner scan = new Scanner (System.in);
		
		System.out.print("Birinci Kenari giriniz : ");
		double a = scan.nextDouble();
		
		System.out.print("Ikinci Kenari giriniz : ");
		double b = scan.nextDouble();
		
		System.out.print("Ucuncu Kenari giriniz : ");
		double c = scan.nextDouble();
		
		if (a<=0 && b<=0 && c<=0) {
			System.out.println("Hatali giris yaptiniz");
		} else {
		if ((a*a)+(b*b) == c*c || (b*b)+(c*c) == a*a || (a*a)+(c*c) == b*b ) {		
		System.out.println("Bu bir dik ucgendir");
	}else
		System.out.println("Bu bir dik ucgen degildir");
		scan.close();
	}

	}
}
