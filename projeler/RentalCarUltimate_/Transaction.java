package RentalCarUltimate_;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Transaction {

    // Getter-setter kullanilmadi çünkü veriler sadece bu classta kullanildi.
    private String alinacakSehir;
    private Date alinacakGun;
    private double alisSaati;
    private Date teslimGunu;
    private double teslimSaati;
    List<Transaction> girilenIslemler = new ArrayList<>();

    public Transaction() {
    }

    public Transaction(String alinacakSehir, Date alinacakGun, double alisSaati, Date teslimGunu, double teslimSaati) {
        this.alinacakSehir = alinacakSehir;
        this.alinacakGun = alinacakGun;
        this.alisSaati = alisSaati;
        this.teslimGunu = teslimGunu;
        this.teslimSaati = teslimSaati;
    }

    double topFiyat() {
        int toplam;

        // Date alip kaç gün kiralanacağini bulacağiz ve fiyati ona göre ayarlayacağiz
        long difference_In_Time
                = this.teslimGunu.getTime() - this.alinacakGun.getTime();
        int fark = (int) (TimeUnit
                .MILLISECONDS
                .toDays(difference_In_Time)
                % 365);

        toplam = (int) (Vehicle.dailyPrice * fark);

        return toplam;
    }

    void islemler() { // Kullanicidan alinacak tarih saat ve şehir bilgisi...
        Scanner scan = new Scanner(System.in);
        try { // Olasi exceptionslara karşi try-catch kullanildi.
            System.out.print("Almak istediğiniz şehir : ");
            String city = scan.next();

            // Bunu internetten çarptim :)
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            System.out.println("Aliş Tarihi şu şekilde girin (gg.aa.yy):");
            String alim = scan.next();
            if (null != alim && alim.trim().length() > 0) {
                this.alinacakGun = format.parse(alim);
            }
            System.out.println("Alim Saati seçin");
            double saat1 = scan.nextDouble();

            SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
            System.out.println("Teslim Tarihi şu şekilde girin (gg.aa.yy):");
            String teslim = scan.next();
            if (null != teslim && teslim.trim().length() > 0) {
                this.teslimGunu = format1.parse(teslim);
            }
            System.out.println("Teslim Saati seçin");
            double saat2 = scan.nextDouble();
            Transaction transaction = new Transaction(city, this.alinacakGun, saat1, this.teslimGunu, saat2);
            girilenIslemler.add(transaction);

            System.out.println("Ödemeniz gereken toplam ücret : " + topFiyat() + " TL'dir");
        } catch (Exception e) {
            System.out.println("Lütfen istenen bilgileri doğru bir şekilde girin...");
            islemler();
        }
    }

    @Override
    public String toString() {
        return "Alinacak �?ehir : '" + alinacakSehir + '\'' +
                ", Alinacak Gün : " + alinacakGun +
                ", Aliş Saati : " + alisSaati +
                ", Teslim Günü : " + teslimGunu +
                ", Teslim Saati : " + teslimSaati;
    }
}
