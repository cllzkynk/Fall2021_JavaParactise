package day08_While_DoWhile;

import java.util.Scanner;

public class Q10Maxin5NumberTeachr {

    public static void main(String[] args) {
        // Kullanýcýdan 5 sayý isteyiniz, bu sayýlardan en büyüðünü bularak yazdýrýnýz.
        Scanner scan = new Scanner(System.in);

        int enbSayi = 0;
        int count = 0;
        while (count < 5) {
            System.out.print("sayi giriniz : ");
            int sayi = scan.nextInt();
            if (sayi > enbSayi) {
                enbSayi = sayi;
           }
            count++;
        }
        System.out.println("enbuyuýk sayi :"+enbSayi);
   scan.close(); }
}