package day07_ForLoop;



public class Q16_HarflerleUcgen {
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */

    	
    	for (int i = 'A'; i <= 'M'; i++) {
    		for (int j = 'A'; j <= i; j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
       
    }

}
