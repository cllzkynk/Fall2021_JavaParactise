package day08_While_DoWhile;

import java.util.Scanner;

public class Q15Kombinasyon {

    public static void main(String[] args) {
         /*  Problem Tanimi
        Verilen iki sayinin kombinasyonunu bulan kodu yaziniz.
        Hatirlatma C(n,r) = n! / (r!(n-r)!)

        Ekran ciktisi
        Birinci sayiyi giriniz: 15
        Ikinci sayiyi giriniz: 4
        Kombinasyon: 1365

        Birinci sayiyi giriniz: 5
        Ikinci sayiyi giriniz: 3
        Kombinasyon: 10


C (n, r) = n!/(n−r)!*r! ===>C (6, 2) = 6!/((6−2)!*2!) = 6!/(4!*2!)=6*5/2=15
      */
		 Scanner klavye=new Scanner(System.in);
	        System.out.println("N Değerini Giriniz");
	        long n=klavye.nextLong();
	        
	        System.out.println("R Değerini Giriniz");
	        long r=klavye.nextLong();
	        
	        if(n<r){
	            
	            System.out.println("N Sayısı R Sayısından Büyük Olmalıdır. Lütfen Tekrar N Değerini Giriniz.");
	            n=klavye.nextInt();
	            KombinasyonHesapla(n,r);
	        }else{
	            KombinasyonHesapla(n,r);
	        }
	        klavye.close();
	    }

	public static void KombinasyonHesapla(long n, long r) {
	        
		long nfak=1;
		long rfak=1;
		long NeksiRfak=1;
		long fark=n-r;
	        
	        for(int i=1;i<=n;i++){
	            
	        	nfak=nfak*i;
	        }
	        System.out.println("N Sayısının Faktöriyeli : " + nfak);
	        
	        for(int j=1;j<=r;j++){
	            
	        	rfak=rfak*j;
	        }
	        System.out.println("R Sayısının Faktöriyeli : " + rfak);
	        
	        for(int k=1;k<=fark;k++){
	            
	            NeksiRfak=NeksiRfak*k;
	        }
	        System.out.println("(N-R)'nin Faktöriyeli   : " + NeksiRfak);
	        
	        long carpim=rfak*NeksiRfak;
	        long kombinasyon=nfak/carpim;
	        
	        System.out.println("\t       C("+n+","+r+")"+ "  = " + kombinasyon);
	    }

	}
