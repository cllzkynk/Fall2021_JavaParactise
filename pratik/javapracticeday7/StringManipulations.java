package javapracticeday7;

import java.util.Scanner;

public class StringManipulations {

	public static void main(String[] args) {
		/*
        Kullanicidan isim ve soy isim isteyiniz ve bas harfleri buyuk 
        geri kalan harfleri kucuk yazdiriniz
        String isimSoyIsim
        */
        
        Scanner scan  = new Scanner(System.in);
        System.out.println("Isminizi ve soy isminiz bir bosluk ara ile yaziniz");
        String isimSoyIsim = scan.nextLine();
//        1. yol
        int ikinciBasNok = isimSoyIsim.indexOf(" "); 
      System.out.print(isimSoyIsim.substring(0,1).toUpperCase());
      System.out.print(isimSoyIsim.substring(1, ikinciBasNok+1).toLowerCase());
      System.out.print(isimSoyIsim.substring(ikinciBasNok+1, ikinciBasNok+2).toUpperCase());
      System.out.println(isimSoyIsim.substring(ikinciBasNok+2).toLowerCase());
        
//        2. yol
        String []isimler = isimSoyIsim.split(" ");
        for (int i = 0; i < isimler.length; i++) {
        	isimler[i]=isimler[i].toLowerCase();
        	System.out.print(isimler[i].substring(0,1).toUpperCase()+isimler[i].substring(1)+" ");
			
		}
//  
	}

}
