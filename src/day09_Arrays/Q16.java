package day09_Arrays;


import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        /*
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */


		Scanner scan=new Scanner (System.in);
		System.out.println("Gir bisiler");
		String str=scan.nextLine();		
		convertor(str);
scan.close();
	}

	public static void convertor(String str) {
	int toplam=0;
		String strarr[]=str.split("");
	for (int i = 0; i < strarr.length; i++) {
		char ch= strarr[i].charAt(0);
		if( Character.isDigit(ch)) {
			toplam+=Integer.valueOf(strarr[i]);
		}
	}
		System.out.println(toplam);
	}

}