package day06_Method_Creation;

import java.util.Scanner;

public class Q04_IcermeMetod {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
    	Scanner scan = new Scanner(System.in);
        System.out.print("Girin bakalim bisiler ==> ");
        String str=scan.nextLine();
    	
    	icerme(str);
    	
    	
    System.out.println("Girilen ifadenin \"xyz\" dizimi\" icerme durumu ==> "+icerme(str)); 	
    	
    	
    scan.close();	
    	
    }

	public static boolean icerme(String s) {
		String cek="xyz";
		
		if (s.contains(cek)) {
			return true;
		}else {
			return false;
		}
		
		
		
	}

}
