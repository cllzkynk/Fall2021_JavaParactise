package Java_Review_Turkish;

import java.util.Random;
import java.util.Scanner;

public class day2 {

	public static void main(String[] args) {
		// verilen iki sayının yerlerini değiştiriniz    
        int num1 = 11; // ==>33
        int num2 = 33;// ==>11
        
        System.out.println("---Değişiklik öncesi---");
        System.out.println("1. Sayı= "+num1);
        System.out.println("2. Sayı= "+ num2);
        
        //ilk önce 1. sayı değerini temp(Geçici değer) içerisine atıyoruz
        int temp =num1;
        
        //2. sayı değerini 1. sayı'ya atıyoruz
        num1= num2;
        
        // ve son olarak temp içindeki değeri 2. sayıya eşitliyoruz
        num2= temp;
        
        System.out.println("---Değişiklik sonrası---");
        System.out.println("1. Sayı= "+num1);
        System.out.println("2. Sayı= "+num2);

		
		//*** interview question***
	       // Verilen iki değeri üçüncü bir değer kullanmadan yerlerini değiştiriniz
	       int  x = 50; //=>10
	       int  y  = 10; //=>50
	           
	       x = x+y;
	       y = x-y;
	       x = x-y;
	       
	       System.out.println(x);
	       System.out.println(y);
	       
	    // 0 ile 1000 arası sayı
	     //int ramdomSayi= (int)(Math.random()*10)+10; // 10 ile 20 arası değerler
	             //Random random= new Random();
	             
	         //  int randomSayi = random.nextInt(1000);
	             int randomSayi= (int)(Math.random()*1000);
	             System.out.println("Random sayı="+randomSayi);
	         int birler = randomSayi%10; // birler basamağı
	         
	           randomSayi= randomSayi/10;
	         
	         int onlar = randomSayi%10; // onlar basamağı
	         int yuzler= randomSayi/10; // yüzler basamağı
	         
	         System.out.println("Toplamları= "+(birler+onlar+yuzler));
	         
	      //2. yol
	       
	       //Random random = new Random();
	       //int randomSayi = random.nextInt(1000);
	         
	         
	         //.............................//
	         /* 
	         scanner kullanarak aşağıdaki sorulara cevaplar isteyiniz
	         1.Adım: 3 adet String tanımlayınız. ad, soyad, rapor
	         2.Adım: 2 adet integer tanımlayınız  doğum yılı, şimdiki yıl
	         3.Adım: Kullanıcıdan; "Lütfen adınızı ve soy adınızı giriniz:" isteyin
	                  Harun
	                  Ekinci
	         4.Adım: Kullanıcıdan;"Lütfen doğum yılınızı ve şimdiki yılı giriniz:" isteyin
	                  1983
	                  2020        
	         5.Adım Raporu aşağıdaki gibi yazdırınız      
	                 "Adınız: Harun, Soy adınız: Ekinci, Yaşınız: 37"
	         6. Adım: Yaşınız,Adınızın ilk harfi, soyadınızın ilk ve son harfi, isim ve soyisim karakter uzunluklarını içeren bir şifre oluşturunuz
	            //Şifre= 37HEi56        
	         */
	         
	         /*
	         Scanner scan = new Scanner(System.in);
	          System.out.println("Adınızı giriniz:");
	         System.out.println("Soyadınızı giriniz:");
	         String ad = scan.nextLine();
	         String soyad = scan.nextLine();
	        
	         String rapor = ad + " " + soyad;
	         	
	         System.out.println("Dogum yılınızı giriniz:");
	         System.out.println("Simdiki yılı giriniz:");
	         int dyıl = scan.nextInt();
	         int syıl = scan.nextInt();
 	         int yas = syıl - dyıl;
	         System.out.println("Ad: " + ad + " Soyadınız: " +soyad + " Yasınız: "+ yas  );
	         
	 		char a1 = ad.charAt(0);
	 		char b2 = soyad.charAt(0);
	 		char c3 =soyad.charAt(soyad.length()-1);
	 		int length = ad.length()+soyad.length();
	 		
	 		String yas1 = String.valueOf(yas);
	 		String length1 = String.valueOf(length);
	 		String sifre = yas1+a1+b2+c3+length1;
	 		System.out.println(sifre);
			*/
	         /*
	         String str = "Harun";
	         System.out.println(str.substring(str.length()-1));
	         System.out.println(str.substring(4));
	         */
	         
	      // Scanner kullanarak kullanıcıdan 
	      // saat, dakika ve saniye bilgilerini alarak sonucu yazdırınz
	      // saat,dakika, saniye -->int
	      // PM veya AM--> String
	      // Örn: 11:25:33 PM
	              
	              int saat,dakika,saniye;
	              String amOrPm;
	              
	              Scanner sc= new Scanner(System.in);
	              
	              System.out.println("Lütfen saat değeri giriniz");
	              saat= sc.nextInt();
	              System.out.println("Lütfen dakika değeri giriniz");
	              dakika= sc.nextInt();
	              System.out.println("Lütfen saniye değerini giriniz");
	              saniye= sc.nextInt();
	              System.out.println("Lütfen AM veya PM değerini giriniz");
	              amOrPm= sc.next();
	              
	              System.out.println(saat+":"+dakika+":"+saniye+" "+ amOrPm);

	              // Kullanıcıdan bir sayı girmesini isteyiniz
	      		// Sayı tek sayı ise "Sayınız tek sayıdır."
	      		// Sayı çift sayı ise "Sayınız çift sayıdır." yazdırınız
	              
	              Scanner scan = new Scanner(System.in);
	              
	              System.out.println("Bir tamsayi giriniz");
	              int num = scan.nextInt();
	              String result =  (num%2==0) ? "Cift" : "Tek";
	              System.out.println(result);
	              
	}

}
