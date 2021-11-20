package day01_27_10;

import java.util.Scanner;

public class Q3_ScannerBoyKiloHoca {

	public static void main(String[] args) {
		/*
         * kullanicinin ad soyad yas boy kilosunu alt alata yazdiriniz
         */
    
    
    
    Scanner scan =new Scanner(System.in);
    
    System.out.print("adinizi giriniz :");//kullanicya adýný grmesinin bildirimini yazdýrdýk
    //System.out.print--> girilen veriyi ayni satira yazdirir
    //System.out.println--> girilen veriyi bir alt  satira yazdirir
    String name=scan.nextLine();
    
    System.out.print("soyadinizi giriniz :");
    String surName=scan.nextLine();
    
    System.out.print("yasinizi giriniz :");
    int age=scan.nextInt();
    
    System.out.print("boyunuzu giriniz :");
    int boy=scan.nextInt();
    
    System.out.print("kilonuzu giriniz :");
    int kilo=scan.nextInt();
    
    System.out.println("benim adým:"+name+"\n"
            +"soyadým :"+surName+"\n"
            +"yasim:"+age+"\n"
            +"boyum:"+boy+"cm"+"\n"
            +"kilom:"+kilo+"kg");
    
    /*
        adinizi giriniz :mehmet
        soyadinizi giriniz :yiðit
        yasinizi giriniz :35
        boyunuzu giriniz :188
        kilonuzu giriniz :70
        benim adým:mehmet
        soyadým :yiðit
        yasim:35
        boyum:188cm
        kilom:70kg
     */
    scan.close();

	}

}
