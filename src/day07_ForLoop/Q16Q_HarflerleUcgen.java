/**
 * 
 */
package day07_ForLoop;

/**
 * @author CELÝL
 *
 */
public class Q16Q_HarflerleUcgen {

    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        þeklini yazdýrýnýz.  65=A'nýn ascýý deðeri
        */
    public static void main(String[] args) {
        int harf=65;
      for (int baba = 0; baba < 6; baba++) {
          for (int evlat = 0; evlat <=baba; evlat++) {
              System.out.print((char)(harf+evlat)+" ");
            
        }
        System.out.println();
    }
        
    }
}