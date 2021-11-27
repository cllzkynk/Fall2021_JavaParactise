package day09_Arrays;

import java.util.Arrays;

public class Main_Deneme {

    @SuppressWarnings("unused")
	public static void karakterSayaci(String str) { 
        if (str == null) 
        return; 
        String[] karakterDizisi = {"a","b","c","ç","d","e","f","g","ð","h","ý","i","j","k","l","m","n","o","ö", 
            "p","q","r","s","þ","t","u","ü","v","w","x","y","z", 
            "0","1","2","3","4","5","6","7","8","9"," "}; //43 adet 
        int[] sayacDizisi = new int [43]; 
        int sayac = 0; 
        for (int i = 0; i < str.length(); i++) { 
            char charKarakter = str.charAt(i); 
            String strKarakter = Character.toString(charKarakter); 
            for(int j=0;j<karakterDizisi.length;++j) 
            { 
                if (karakterDizisi[j].equals(strKarakter)||karakterDizisi[j].equals(strKarakter.toLowerCase())) 
                { 
                    int l = sayacDizisi[j]; 
                    sayacDizisi[j]= l+1 ; 
                } 
            } 
            sayac++; 
        } 
        System.out.println(str + " içindeki harfler"); 
        for (int k = 0; k < 42; k++) { 
            if (sayacDizisi[k] != 0) 
                    System.out.println(sayacDizisi[k] + " adet " + karakterDizisi[k] );
            System.out.println(Arrays.toString(sayacDizisi));
            System.out.println(Arrays.toString(karakterDizisi));
        } 
 
    } 
    public static void main(String[] args) { 
        karakterSayaci("Araba"); 
        karakterSayaci("Ankara");
    }
}