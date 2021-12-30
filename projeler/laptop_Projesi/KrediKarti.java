package laptop_Projesi;

import java.util.Scanner;

public class KrediKarti {
	
	private static int indirimliFiyat;
	private static Data hesap=new Data();
	public static String sifre="";

	protected static void krediKarti(int toplam) {
		Scanner scan = new Scanner (System.in);
		Indirim obj=new Indirim();		
		System.out.println("Toplam tutar "+toplam);
		System.out.println("Indirim orani = "+" %"+obj.indirim);
		indirimliFiyat = toplam-(toplam*obj.indirim/100);
		System.out.println("Odenecek Tutar = "+indirimliFiyat);
		
		
		for (int i = 1; i > 0; i++) {
			Scanner scan1=new Scanner (System.in);
			System.out.print("\nLutfen 16 haneli kredi kart numaranizi giriniz ==> ");
			String nu=scan1.nextLine().replaceAll("\\s", "");
			
			
			if(nu.length() == 16) {
				for (int j = 0; j < hesap.kartNo.length; j++) {					
					if(hesap.kartNo[j].equals(nu)) {
						sifre=hesap.sifre[j];
						break;
						}
				}
				System.out.println("Sifrenizi giriniz :");
				String sfr=scan1.next();
				
				if (sfr.equals(sifre)) {
					System.out.println("Odemeniz basariyla gerceklesti");
					break;
				} else System.out.println("Hatali giris ");
				
			}else System.out.println("Kart numarasini yanlis girdiniz : ");
			
		}
		
		
		
		
	}
	
}
