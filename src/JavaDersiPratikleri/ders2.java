package JavaDersiPratikleri;

public class ders2 {

	public static void main(String[] args) {
		/* Operators
		1)Parantez ici islemler yapilir
		2)Carpma ve bolmeler yapilir.Carpma ve bolmeden soldaki once yapilir.
		3)Toplama ve cikarmalar yapilir.Toplama ve cikarmadan soldaki once yapilir.
		*/
		     int i1 = 23;
		     int i2 = 15;
		     int i3 = 38;
		     int i4 = 14;
		     
		     System.out.println(i1 + i2*i3); 
		     System.out.println(i1*i2 + i3*i4);
		     System.out.println((i1+i2)/i4);
		     System.out.println(i4 * (i2 + i1 / 3 )); 
		     
		  // Interview Sorusu
		   //Iki tane variable'in degerlerini yer degistiriniz
		   // sayi1=23, sayi2=54 ==> sayi1=54, sayi2=23 (Bu isleme swap denir)
		   // Gecici(temporary)(temp) bir variable kullanarak
		   int sayi1=23;
		   int sayi2=54;
		   System.out.println("Degismeden Onceki Halleri");
		   System.out.println("sayi1 "+sayi1);
		   System.out.println("sayi2 "+sayi2);
		   int gecici = 0;
		   gecici = sayi1; //23
		   sayi1 = sayi2; // 54
		   sayi2 = gecici; // 23
		   System.out.println("Degismeden Sonraki Halleri");
		   System.out.println("sayi1 "+sayi1);
		   System.out.println("sayi2 "+sayi2);
		   
		   // Gecici(temporary)(temp) variable kullanmadan
		   int sayiA=67;
		   int sayiB=12;
		   System.out.println("Degismeden Onceki Halleri");
		   System.out.println("sayiA "+sayiA);
		   System.out.println("sayiB "+sayiB);
		   sayiA = sayiA + sayiB;
		   sayiB = sayiA - sayiB;
		   sayiA = sayiA - sayiB;
		   System.out.println("Degismeden Sonraki Halleri");
		   System.out.println("sayiA "+sayiA);
		   System.out.println("sayiB "+sayiB);
		    
		    
		    
		   		 
		     
	}
	

}
