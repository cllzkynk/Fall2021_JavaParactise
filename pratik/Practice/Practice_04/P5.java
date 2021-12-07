package Practice.Practice_04;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		 /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz.
         * 
         * input : ali 
         * output: girdiginiz kelime 3 harfli ve unique karaktere sahip
         * 
         * input : ece
         * output: girdiginiz kelime 3 harfli ve unique karaktere sahip degil
         */

    	Scanner scanner=new Scanner(System.in);
    	System.out.print("adinizi giriniz : ");
    	String name=scanner.nextLine();//eda
    	
    	char c1=name.charAt(0);//e
    	char c2=name.charAt(1);//d
    	char c3=name.charAt(2);//a
    	
    	String result=name.length() == 3 ?((c1!=c2 && c1!=c3 && c2!=c3)? "girdiginiz isim unique karakterlerden olusuyor ":"girdiginiz isim unique karakterlerden olusmuyor " ):"3 karakterden farkl� isim girdiniz";
    	
       System.out.println(result);
       
       scanner.close();
    }
}