package day09_Arrays;

import java.util.Arrays;

public class Q08 {

	public static void main(String[] args) {

		/*
		 * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
		 * 
		 * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
		 */
		String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 $9";
		String[] strarr = str.split(" ");
		System.out.println(Arrays.toString(strarr));
		int dolartop = 0;
		int paundtop = 0;
		for (int i = 0; i < strarr.length; i++) {
			if (strarr[i].contains("$")) {
				strarr[i] = strarr[i].replace("$", "");
				int dolar = Integer.valueOf(strarr[i]);
				dolartop += dolar;	}
			if (strarr[i].contains("£")) {
				strarr[i] = strarr[i].replace("£", "");
				int paund = Integer.valueOf(strarr[i]);
				paundtop += paund;  }  }
		System.out.println("Amerigan paralari toplami    = " + dolartop);
		System.out.println("Anglasakson paralari toplami = " + paundtop);
		
		
} }
