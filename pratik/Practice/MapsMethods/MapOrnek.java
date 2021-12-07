package Practice.MapsMethods;

import java.util.HashMap;
import java.util.Scanner;

public class MapOrnek {

    public static void main(String[] args) {

        HashMap<Integer,String> ogrenciBilgileri=new HashMap<>();
        ogrenciBilgileri.put(937, "Ali Can-7/B");
        ogrenciBilgileri.put(531,"Ayşe Çetin-8/A");
        ogrenciBilgileri.put(856, "Ahmet Demir-5/B");
        ogrenciBilgileri.put(214,"Melek Durmaz-6/C");
        ogrenciBilgileri.put(632,"Can Mert -6/C");

        //yeni bir öğrenci girişi yapısın .var olan numara ile kayıt yapılmaya çalışıldığında
        //o numaralı kaydın olduğunu ve o numaraya ait kişinin bilgisini getirsin
        // eger belirtilen numara kayıtlı değilse kaydınız eklenmiştir desin.
        Scanner scan=new Scanner(System.in);

        System.out.println("numara giriniz");
        int numara=scan.nextInt();
        scan.nextLine();

        System.out.println("ogrenci bilgisi giriniz");
        String bilgi=scan.nextLine();

        if( ogrenciBilgileri.putIfAbsent(numara,bilgi)== null ) {
            // null a esit olursa boyle bir ogrenci yok demektir ve kayit yapilabilir...

            System.out.println("kaydınız eklenmiştir: "+ ogrenciBilgileri.get(numara));

        }else { // eger null a esit ise kaydin kendini getir...
            System.out.println("Böyle bir kayıt mevcuttur : Kayıt "+
                    ogrenciBilgileri.putIfAbsent(numara,bilgi)+" kişisine aittir.");
        }

        // Bir numara girildiğinde o kişiye ait sınıf bilgisini bize göstersin.
        //eğer kayıt yok ise böyle bir kayıt yok mesajı versin

        System.out.println("numara giriniz");
        int numara1=scan.nextInt();
        scan.nextLine();

        System.out.println(ogrenciBilgileri.get(numara1));

        // substring   --> a.substring(baslangıc indexi, bitiş indexi)

        //				-->a.substring(baslangıç indexi)

        System.out.println(ogrenciBilgileri.get(numara1).substring(ogrenciBilgileri.get(numara1).indexOf('-')+1));



    }

}

