package JavaDersiPratikleri;

import java.util.Scanner;

public class Ders01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// /Asagidakilerde ne tur yanlisliklar vardir? Ekrana dogru hallerini yazdiriniz.
//      int nm =11A;
//      String str = Merhaba;
//      char ch = "T";
//      boolean bl = "Dogru";
//      long ln = 1324.67;
//      double dl = 62;
//      float fl = 5.2;
	/*	
      int nm =11;
      String str = "Merhaba";
      System.out.println(str);
      char ch = 'T';
      System.out.println(ch);
      boolean bl = true;
      System.out.println(bl);
      long ln = 1324;
      System.out.println(ln);
      double dl = 62;
      System.out.println(dl);
      float fl = 5.2f;
      System.out.println(fl);			*/
      
   // Asagidaki sonuc nedir?
//    int harf = '1';
//    char ch = '2';
//
//    System.out.println(harf+ch); //12 mi?, 3 mu? 99 mu?
//
//    System.out.println(harf); // 1 mi? 49 mu?
//
//    System.out.println(ch); // 2 mi? 50 mi?
//
//    char deneme = 50;
//
//    System.out.println(deneme); // 2 mi? 50 mi?
      
   // Asagidaki sonuc nedir?
      int harf = '1';
      char ch = '2';
	
   /*   System.out.println(harf+ch); // 99 mu?
      System.out.println(17+3); //20
      System.out.println(17+ "" + 3);//173
      System.out.println(" " +17 + 3);// 173
      System.out.println(17 + 3 + " ");// 20
      System.out.println(24 + 3 + 6 + " " + 10);//3310   
      
      System.out.println(harf); // 1 mi? 49 mu?
      System.out.println(harf + " " + ch);//49 2
      System.out.println(ch); // 2 
  
      char deneme = 50;//2
      int num = '@';
      
      System.out.println(deneme); // 2
      System.out.println(num); //64 			*/

    /*  int unlem='!';
        System.out.println(unlem);
      int yuzde='%';
      	System.out.println(yuzde);
      int yıldız='*';
      	System.out.println(yıldız);
      int dolar='$';
      	System.out.println(dolar);
      int et='@';
      	System.out.println(et);
      int ve='&';
      System.out.println(ve); 		*/
    //int ve long data tipinin maximum ve minimum degerlerini bulup ekrana yazdiriniz.
      
      int maxValue = Integer.MAX_VALUE; // <--- ileride baska bir code icerisinde kullanilabilir
      System.out.println(maxValue);
      System.out.println(Integer.MAX_VALUE);
      int minValue = Integer.MIN_VALUE;
      System.out.println(minValue);
      int yeniValue = maxValue + minValue;
      System.out.println(yeniValue);
      int yuksekDeger = 2_147_483_647; //2147483647
      System.out.println(yuksekDeger + " Alt Cizgili");
//      int telefon = 5352003030;
      String tlf = "5352003030";
      double tfln = 535.200_3030;
      int dusukDeger = -2_147_483_648;
      long maxLng = Long.MAX_VALUE; //9223372036854775807
      System.out.println(maxLng);
      long tlfLng = 535_200_3030L;
      System.out.println(tlfLng);
      long minLng = Long.MIN_VALUE; //-9223372036854775808
      System.out.println(minLng);
      long yeniLong = maxLng + minLng;
      System.out.println(yeniLong);
     
    //Kullanicidan iki farkli kelime yazsin - (String) olarak
    //Program bu kelimeleri beraberce ekrana yazdirsin ve sonuna unlem isareti eklesin.
    /* NOT ; ---> String'leri kullanicidan almak icin ya next() veya nextLine()
    kullaniriz. next() tek kelimelik String'ler icin kullanilir.
    Space gorunce String'i almayi birakir.
    nextLine() girilen tum String'i almak icin kullanilir.*/
    Scanner scan = new Scanner(System.in);
   /* System.out.println("Birinci Kelimeyi Yaziniz");
    String str1 = scan.next();
    str1 = str1 + " ";
    System.out.println("Ikinci Kelimeyi Yaziniz");
    String str2 = scan.next();
    String cumleSonuIsareti = "!";
    String yeniCumle = str1 +  str2 + cumleSonuIsareti;
    System.out.println("Yeni Cumleniz; " + yeniCumle);  */
    
    /*
    Kullanici  iki sayi girsin 
    Program girilen sayilarin karesini ayri ayri ekrana yazdirsin //
    Ayri olarak; Program girilen sayilari ayri ayri 5 ile carpimini
    ve sonucunu ekrana yazdirsin. //
    Ayri olarak; Program girilen sayilara ayri ayri 12 eklesin //
    Ayri olarak; Program girilen sayilardan ayri ayri 5 cikarsin //
  */
    System.out.println("Birinci sayıyı yaziniz");
    int num1 = scan.nextInt();
    System.out.println("Ikinci sayıyı yaziniz");
    int num2 = scan.nextInt();
    int ilkKare= num1*num2;
    System.out.println("İlk sayı karesi= " + ilkKare);
     int ikinciKare= num2*num2;
     System.out.println("İkincı sayı karesi= " + ikinciKare);
     
    int ilk5carp= num1*5;
    System.out.println(ilk5carp);
    
    int ikinci5carp= num2*5;
    System.out.println(ikinci5carp);
    
    int ilk12ekle= num1+12;
    System.out.println(ilk12ekle);
    
    int ikinci12ekle= num2+12;
    System.out.println(ikinci12ekle);
    
    int ilk5cikar= num1-5;
    System.out.println(ilk5cikar);
    
    int ikinci5cikar= num2-5;
    System.out.println(ikinci5cikar);
    
    scan.close();	
	}

}
