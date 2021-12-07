package Practice.Practice_02;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// kullaniciya fahrenheit degeri gir.
		// celciusa cevir
		// c=(f-32)*5/9
		
		
Scanner scan = new Scanner (System.in);
		
System.out.print("Lutfen fahrenheit degerini giriniz : ");
double f = scan.nextDouble();
double c=(f-32)*5/9;

System.out.print("girdiginiz fahrenheit degerinin celcius karsiligi : "+c);
		
scan.close();
	}

}
