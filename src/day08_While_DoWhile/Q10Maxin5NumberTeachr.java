package day08_While_DoWhile;

import java.util.Scanner;

public class Q10Maxin5NumberTeachr {

    public static void main(String[] args) {
        // Kullan�c�dan 5 say� isteyiniz, bu say�lardan en b�y���n� bularak yazd�r�n�z.
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
        System.out.println("enbuyu�k sayi :"+enbSayi);
   scan.close(); }
}