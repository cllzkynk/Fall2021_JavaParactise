package RentalCarUltimate_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicle extends Data {

    // Getter-setter kullanılmadı çünkü veriler sadece bu classta kullanıldı.
    private String marka;
    private String model;
    static double dailyPrice;
    private String yakitTuru;
    private String vitesTuru;
    String randomStr;
    static int secim;
    List<Vehicle> secilenArac = new ArrayList<>();

    public Vehicle() {
    }

    public Vehicle(String marka, String model, String yakitTuru, String vitesTuru) {
        this.marka = marka;
        this.model = model;
        this.yakitTuru = yakitTuru;
        this.vitesTuru = vitesTuru;
    }

    void aracGoster() {
        //getMarkalar();
        int devam;
        do { // Data classtaki arraylari burada döndüreceğiz. Kullanıcı araba marka ve model, yakıt türü ve vites türü seçeceğiz.
            // Hepsinin fiyatı farklı dönecek. Araba kiralamaya uygun değilse menüye dönecek, uygunsa ilerleme veya menüye dönme seçeneği var.

            try {  // Olası exceptionslara karşı try-catch kullanıldı.
                dailyPrice = 0.0;
                System.out.println("=========RENT A CAR'A HO�?GELDİNİZ========");
                System.out.println("Listeden araba markası seçiniz...");
                Scanner scan = new Scanner(System.in);
                for (int j = 0; j < getMarkalar().size(); j++) {
                    System.out.println((j + 1) + ". : " + getMarkalar().get(j) + " - " + getModeller().get(j));
                }
                // System.out.println("7. Diğer");
                secim = scan.nextInt();
                switch (secim) { // Yukarıdaki araç listesinden seçilenleri burada göstereceğiz.
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    {
                        System.out.println("----------------------------");
                        System.out.println("Seçilen yakıt türü : " + yakit());
                        System.out.println("Seçilen vites türü : " + vites());
                        dailyPrice += getDailyPrice().get(secim - 1);
                        System.out.println("----------------------------");
                        System.out.println("Seçilen marka : " + getMarkalar().get(secim - 1) +
                                "\nSeçilen model : " + getModeller().get(secim - 1));
                        System.out.println(randomRent());
                        if (this.randomStr.equalsIgnoreCase("Araba kiralamaya uygun değil.")) {
                            aracGoster();
                        } else {
                            // Seçilen öğeleri seçilen araç listine ekliyoruz. belki birden fazla araç sececek
                            Vehicle vehicle = new Vehicle(getMarkalar().get(secim - 1), getModeller().get(secim - 1), this.yakitTuru, this.vitesTuru);
                            secilenArac.add(vehicle);
                        }
                    }
                }
                System.out.println("Devam etmek için 1'e; Ana menüye dönmek için 0'a basınız...");
                devam = scan.nextInt();
            } catch (Exception e) {
                System.out.println("--------------------------------------");
                System.out.println("Lütfen beklenen aralıktaki sayılardan birini giriniz");
                System.out.println("--------------------------------------");
                devam = 0;
            }
        } while (devam != 1);
    }

    String yakit() { // Yakıt türü seçimi için method
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < getYakitTurleri().size(); i++)
            System.out.println((i + 1) + ". " + getYakitTurleri().get(i));
        System.out.print("Yakıt Türünü Seçiniz : ");
        int yakitSec = scan.nextInt();
        dailyPrice += getDailyPrice().get(yakitSec - 1);
        this.yakitTuru = getYakitTurleri().get(yakitSec - 1);
        return yakitTuru;
    }

    String vites() { // Vites türü seçimi için method
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < getVitesTurleri().size(); i++)
            System.out.println((i + 1) + ". " + getVitesTurleri().get(i));
        System.out.print("Vites Türünü Seçiniz : ");
        int vitesSec = scan.nextInt();
        dailyPrice += getDailyPrice().get(vitesSec - 1);
        this.vitesTuru = getVitesTurleri().get(vitesSec - 1);
        return vitesTuru;
    }

    String randomRent() {
        // Aracın kirada olup olmadığını random döndürüyoruz.. %60 kiralamaya uygun olacak şekilde ayarlanır.
        int random = (int) (Math.random() * 100);
        this.randomStr = random < 60 ? "*****Araba kiralamaya uygun.\n" + "Günlük kiralama ücreti : " + dailyPrice + " TL" :
                "*****Araba kiralamaya uygun değil. Lütfen listeden başka bir araba seçiniz.";

        return randomStr;
    }

    @Override
    public String toString() {
        return "Marka : '" + marka + '\'' +
                ", Model : '" + model + '\'' +
                ", Yakıt Türü : '" + yakitTuru + '\'' +
                ", Vites Türü : '" + vitesTuru;
    }
}
