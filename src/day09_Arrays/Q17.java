package day09_Arrays;

import java.util.Arrays;

public class Q17 {
    //  Elinizde bir miktar farkli boylarda somun ve bu somunlara uyacak civatalar olsun.
//Civatalari somunlara eslemek icin nasil bir algoritma yazarsiniz.

    public static void main(String[] args) {
    	
    	int a[][]= {{1,2,3,4},{2,3,5},{8,6},{2},{8,1}};
    	int b[][]= {{0,0,3,7},{9,9,5},{8,6},{7},{1,2,3,4,5,6,7},{9,8,7}};
    	
    	for (int i = 0; i < b.length&&i<a.length; i++) {
			if (a[i].length==b[i].length) {
				System.out.println(Arrays.toString(a[i])+"==> civatasinin somunu ==> "+Arrays.toString(b[i]));
			}
		}
    	
    }

}
