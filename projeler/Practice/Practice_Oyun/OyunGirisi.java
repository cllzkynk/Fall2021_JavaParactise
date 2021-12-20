package Practice.Practice_Oyun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OyunGirisi {
	
	/*
	 1. Adim -->  10 farkli kutu olsun ve bu kutular farkli miktarlarda para icersin.
	 				paraListesi isminde bir listte bunlari tutalim...
	 				
	 2. Adim --> 10 tane kutu oludturacagim. bu kutularin icerisine listte olusturdugum para miktarlarini
	 			rastgele bir sekilde atayacagim. Kutu isminde bir class olusturalim. Olusturdugumuz bu classta
	 			kutuNumarasi ve paraMiktari adinda iki int tipinde degisken olmali
	 			
	 3. Adim  --> yeni bir class olusturalim. Kutular ismini verelim. kullanacagimiz methodlari burada olusturalim.
	 
	 
	 4. Adim --> oyunu baslatalim, kullanicidan secmek istedigi kutu numarasini alalim, secilen kutuyu var olan
	 kutularin icerisnden kaldirmamiz gerek...
	 
	 		public void kutuEkle(Kutu kutu)
	 		public void kutuActir(int kutuNumarasi)
	 		public int kalanKutuSayisi()
	 		public int kutulardakiToplamParaMiktari()
	 		public void secilenKutuyuKutularListesindenKaldir()
	 		public void yapimcininTeklifiniAl()
	 		public String acilmamisKutulariGoster()
	 		public void kaybedilenTutarlar()	
	 			 		 
	 
	 */
	
	static List<Integer>paraListesi=new ArrayList<>();
	static Kutular kutular=new Kutular();
	static Scanner scan=new Scanner(System.in);
	
	static int kutuNumaram;
	static int paraMiktarim;

	public static void main(String[] args) {
		
		paraListesi.addAll(Arrays.asList(1,10,500,1000,5000,10000,50000,100000,250000,500000));
		Collections.shuffle(paraListesi);   // belirtilen listteki elemanlarin yerini rastgele degistirir.
		
		for (int i=0; i<10; i++) {    // 0 1 2 3 4 5 6 7 8 9 
			
			int kutuNo=i+1;			//   1 2 3 4 5 6 7 8 9 10
			Kutu kutu=new Kutu(kutuNo,paraListesi.get(i));
			kutular.kutuEkle(kutu);	
			
		}
				
		System.out.println("oyunumuza hosgeldiniz\nLutfen bir kutu secin");
		kutuNumaram=scan.nextInt();
		paraMiktarim=paraListesi.get(kutuNumaram-1);
		
		kutular.secilenKutuyuKutularListesindenKaldir(kutuNumaram);
		kutuSecmeActirma();
		
		}
	
	 	static  public void kutuSecmeActirma() {
		  
		  System.out.println("kalan kutular : "+ kutular.acilmamisKutulariGoster());
		  System.out.println("hangi kutuyu acmak istersiniz.");
		  int secim=scan.nextInt();
		  kutular.kutuActir(secim);
		  
		  if(kutular.kalanKutuSayisi()==7||kutular.kalanKutuSayisi()==4||kutular.kalanKutuSayisi()==1) {
			  System.out.println("Teklifimiz : " + kutular.yapimcininTeklifiniAl(paraMiktarim));
			  System.out.println("teklifi kabul ediyor musun(1-Evet 2-Hayir");
			  int yanit=scan.nextInt();
			  if (yanit==1) {
			  System.out.println("oyun bitti");
			  System.out.println("kazanilan miktar= "+kutular.yapimcininTeklifiniAl(paraMiktarim));
			  System.out.println("kendi kutunuzdaki miktar: " +paraMiktarim);
			  }else {
				  kutuSecmeActirma();
			  }
			  
		  }else {
			  
			  if (kutular.kalanKutuSayisi()>0) {
			  kutuSecmeActirma();
			  }
			  else {
				  System.out.println("oyun bitti");
				  System.out.println("kutunuzdaki miktar : "+paraMiktarim);
			  }
		  }
		  
			
			
		
		}

}