package day07_ForLoop;



public class Q13_KelimedeHarfTekrariSayisi {
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

		String str="Java ogrenmek cok guzel.";
		char harf='e';
		int sayac =0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='e') {
				sayac++;
				
			}
			
		}
		
		
		System.out.println(sayac);
		
		
		
		
		
	}

}
