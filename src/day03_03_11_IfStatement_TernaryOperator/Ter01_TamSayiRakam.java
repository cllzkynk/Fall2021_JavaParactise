package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter01_TamSayiRakam {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lutfen bir tamsayi giriniz ");
    	double sayi=scan.nextDouble();
    	
    	System.out.println(0<=sayi ? (sayi<10? ("Rakam"): "Pozitif sayi"):"Negatif sayi");
    	
    	scan.close();
    }
}
