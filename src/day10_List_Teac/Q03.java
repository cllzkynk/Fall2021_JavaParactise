package day10_List_Teac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulunuz. Sonucu ekrana yazdırınız.
    */
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("liste atamak için sayi giriniz: ");
        System.out.println("yeterli sayiya ulastiginizda 'q' giriniz ");
        int toplam = 0;
        String islem = "";
        while (!islem.equalsIgnoreCase("q")) {
            System.out.println("sayi giriniz : ");
            islem = scan.next();
            list.add(islem);
        }

        list.remove(list.size() - 1);//icinde q bulunmayan sadece sayi bulun list haline geldi

        //lisr eleemanlri icine girip kareleri toplami bulun
        for (String w : list) {
            int a = Integer.parseInt(w);
            toplam += a * a;
        }
        System.out.println("girilen sayilarin kareleri toplami :" + toplam);
    }
}
