package day12_Varargs;

import java.util.Arrays;

public class Q01 {
	public static void main(String[] args) {
		//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
		// input : "m", "e", "r", "v", "e";
		// output : merve

		String [] arr= {"m", "e", "r", "v", "e"};
		
		birlestir(arr);
		
		
		
		
		
	}

	private static void birlestir(String... s) {
	String str ="";
	for (String string : s) {
		str+=string;
	}
	System.out.println(str);
	}

}
