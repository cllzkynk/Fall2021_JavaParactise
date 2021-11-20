package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gunu giriniz");
		int gun=scan.nextInt();
		System.out.println("Lutfen ay giriniz");
		int ay=scan.nextInt();
		System.out.println("Lutfen yil giriniz");
		int yil=scan.nextInt();
	
	if ((12<=gun && gun<=31) && (ay>=1 && ay<=12) && yil>=1 ) {
		System.out.println("girdiginiz tarih gun ay yil seklindedir:" + (gun + "." +ay+"."+yil));
	}
	else if ((1<=gun && gun<11) && (ay>=1 && ay<=12) && yil>=1 ) {
		System.out.println("girdiginiz tarih gun ay yil seklinde:" + (gun + "." +ay+"."+yil)+"\n ay gun yil yil seklinde:" );
		
	} {
		System.out.println("girdiginiz tarih gun yil seklindedir:" + (ay + "." +gun+"."+yil));
	}
scan.close();
	}

}
