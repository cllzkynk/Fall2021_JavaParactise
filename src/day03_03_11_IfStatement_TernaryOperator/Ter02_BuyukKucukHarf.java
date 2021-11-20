package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02_BuyukKucukHarf {

    public static void main(String[] args) {
        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii değeri

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lutfen bir karakter giriniz");
    	char ch=scan.next().charAt(0);
    	System.out.println(('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')? (('a'<=ch&&ch<='z')?"Kucuk Harf": "Buyuk Harf"):"Harf degil");
    	
    	scan.close();
    }
}
