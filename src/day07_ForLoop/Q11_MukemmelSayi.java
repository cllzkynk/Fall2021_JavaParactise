package day07_ForLoop;

;

public class Q11_MukemmelSayi {
    /*
        Bir sayinin m√ºkemmel olup olmadiƒüini bulan bir method yaziniz.
        M√ºkemmel sayi : bir sayinin kendisi hari√ß b√∂lenlerinin toplamƒ±, kendisine e≈üitse o sayi m√ºkemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (M√ºkemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
    public static void main(String[] args) {
        
    	int toplam=0;
    	
        for(int i=1;i<=1000;i++){
            
        	
        	for(int j=1;j<i;j++){
                
                if(i%j==0){
                    
                    toplam=toplam+j;
                }
                
                }
            if(toplam==i){
                
                System.out.println(i+ " Say˝s˝ Bir M¸kemmel Say˝d˝r.");
            }
            toplam=0;
            
            
        }
        
        
        
        
    }

}
