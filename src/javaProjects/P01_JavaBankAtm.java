package javaProjects;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class P01_JavaBankAtm {
   /*      ATM
        Kullaniciya giriÅŸ iÃ§in kart numarasi ve ÅŸifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boÅŸluk ile girerse de eger doÄŸruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceÄŸi iÅŸlemleri ekrana yazdirin,

        Bakiye sorgula, para yatirma, para Ã§ekme, para gÃ¶nderme, sifre deÄŸiÅŸtirme ve cikis.

        Para Ã§ekme ve para gonderme iÅŸleminde mevcut bakiyeden buyuk para Ã§ekilemez,
        Para gÃ¶nderme iÅŸleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger deÄŸilse menÃ¼ ekranina geri donsun.
        Sifre deÄŸiÅŸtirme iÅŸleminde mevcut ÅŸifreyi teyit ettikten sonra, sifre deÄŸiÅŸiklik iÅŸlemini yapmali,       */

    static double bakiye;
    static String kartNo = "1234123412341234";
    static int sifrem = 1234;

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Java bank'a hosgeldiniz !\n");
        int sifre;

        do {
            System.out.println("Lutfen kart numaranizi giriniz...");
            kartNo = scan.nextLine();

            System.out.println("Lutfen sifrenizi giriniz...");
            sifre = scan.nextInt();
            scan.nextLine();
            if (sifre != sifrem || kartNo.replace(" ", "").length() != 16) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Islem Basarisiz !");
                System.out.println("Hatali tuslama yaptiniz !");
            }
        } while (sifre != sifrem || kartNo.replace(" ", "").length() != 16);

        atmPanel();

    }


    public static void atmPanel() {
        System.out.println("ï¼«ï½�ï½�ï½”ï½’ï½�ï½Œ ï½…ï½„ï½‰ï½Œï½‰ï½™ï½�ï½’ï¼�ï¼�ï¼�");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Sifreniz dogrulandi !\n");


        char islem = ' ';
        do {
            System.out.println("Lutfen yapmak istediginiz islemi giriniz â†“ "
                    + "\nA->Bakiye sorgula\nB->Para yatirma\nC->Para cekme\nD->Para gonderme"
                    + "\nE->Sifre degistirme \nF->Cikis\n");
            islem = scan.next().toUpperCase().charAt(0);
            switch (islem) {
                case 'A':
                    bakiyeSorgula();
                    break;
                case 'B':
                    paraYatir();

                    break;
                case 'C':
                    paraCekme();
                    break;
                case 'D':
                    paraGonder();
                    break;
                case 'E':

                    sifreDegistir();
                    break;

                case 'F':
                    System.out.println("Bilgi fisi almak ister misiniz\nEvet icin 'E' Dogayi korumak icin 'H'");
                    char a = scan.next().toUpperCase().charAt(0);
                    if (a == 'E') {
                        fatura();
                    } else {
                        System.out.println("AFERIN DOGA'YI KURTARDIN !!!");
                    }
                    break;

                default:
                    System.out.println("Lutfen gecerli bir islem seciniz !\n");
                    break;
            }
        } while (islem != 'F');

        System.out.println("Cikis yapildi");


    }


    private static void sifreDegistir() {

        System.out.println("Lutfen eski sifrenizi dogrulayiniz...");
        int sifre = scan.nextInt();


        if (sifrem == sifre) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Sifreniz dogrulandi! Lutfen yeni sifrenizi giriniz...");
            sifre = scan.nextInt();
            System.out.println("Islem tamamlandi !\n");

        } else {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Islem Basarisiz !");
            System.out.println("Sifreler eslesmiyor !");

        }

    }


    private static void paraGonder() {

        System.out.println("Lutfen gondermek istediginiz kisinin hesap numarasini (IBAN) giriniz...");
        scan.nextLine();
        String IBAN = scan.nextLine();

        if (IBAN.startsWith("TR") && IBAN.replaceAll("\\s", "").length() == 26) {

            System.out.println("IBAN kontrol ediliyor...\nIBAN dogrulandi !");
            System.out.println("\nLutfen gondermek istediginiz tutari giriniz...");
            double havaleTutari = scan.nextDouble();
            if (havaleTutari > bakiye) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Islem Basarisiz !");
                System.out.println("Maalesef bakiyenden fazla bir tutar gonderemezsin !\n");
            } else {
                bakiye -= havaleTutari;
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Islem tamamlandi !\n");
            }


        } else {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Gecersiz IBAN !\n");
        }


    }


    private static void fatura() {
        LocalDateTime lcd = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy" + " HH.mm");
        lcd.format(dtf);
        System.out.println("+-------------------+\r\n"
                + "|  " + lcd.format(dtf) + "|\r\n"
                + "|                   |\r\n"
                + "|     JAVA BANK     |\r\n"
                + "|                   |\r\n"
                + "|                   |\r\n"
                + "|   BASIT    DUSUN  |\r\n"
                + "|                   |\r\n"
                + "|    BASIT   YAZ     |\r\n"
                + "|                   |\r\n"
                + "|     TESEKKURLER   |\r\n"
                + "|     JAVACANLAR    |\r\n"
                + "+-------------------+");


    }


    private static void paraCekme() {
        System.out.println("Lutfen cekmek istediginiz tutari giriniz...");
        double cekilenTutar = scan.nextDouble();
        if (bakiye >= cekilenTutar) {
            bakiye -= cekilenTutar;
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Islem tamamlandi !\n");

        } else {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Islem Basarisiz !");
            System.out.println("Maalesef bakiyenden fazla bir tutar cekemezsin !\n");
        }

    }


    private static void paraYatir() {
        System.out.println("Yatirmak istediginiz tutari giriniz...");
        double yatirilanTutar = scan.nextDouble();
        bakiye += yatirilanTutar;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Islem tamamlandi !\n");

    }


    private static void bakiyeSorgula() {
        System.out.println("Bakiyeniz --> $" + bakiye + "\n");
    }
}


