package day09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
	static int i=0;
	public static void main(String[] args) {
		// kullanicidan alinan bir String'deki herbir karakterin adedini bir array
		// icinde yazdiran bir java programi yazin.
		// String "Javacilar cook afilli" ise cevap soyle olmalidir:
		// { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}

		Scanner scan = new Scanner(System.in);
		System.out.println("bisiler gir");
		String str = scan.nextLine();
		
		//String str="Javacilar cook afilli";
		String arr[] = str.split("");
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		
		//tekle(arr);
String tek=tekle(arr);
String tekliarr[]=tek.split("");

//System.out.println(Arrays.toString(tekliarr));	
		
String nihayi = adetSay(tekliarr,arr);	
//System.out.println(adetSay(tekliarr,arr));

String nihayet[]=new String [tek.length()];

for (int i = 0; i < nihayet.length; i++) {
	nihayet[i]=tekliarr[i]+"="+nihayi.charAt(i);
}

System.out.println(Arrays.toString(nihayet));

scan.close();

	}
	public static String adetSay(String tekliarr[], String[] arr) {
		String sayici="";
		int sayac=0;
		for (int i = 0; i <tekliarr.length; i++) {
			sayac=0;
			for (int j = 0; j <arr.length; j++) {
				if(tekliarr[i].equals(arr[j])) {
					sayac++;
					
				}
				
			}
			sayici+=sayac+"";
			//System.out.println(tekliarr[i]+"====>"+sayici);
		}
		
		
		
		
	return sayici;	
	}
	public static String tekle(String[] arr) {
		String tekli="";
		for (int i = 0; i < arr.length; i++) {
			if (!tekli.contains(arr[i])) {
				tekli+=arr[i];
			}
		}
	return tekli;	
	}

}
