package genelTekrar;

public class FrekansBulma{

	public static void main(String[] args) {
//		Interview sorusu
//		Verilen bir metindeki harflerin frekansını bulup yazdıran bir METHOD yazınız.
//		(Büyük harf-küçük harf ayrımına dikkat edilecek)
//		Input = AAABBCDD 
//		output = A3B2C1D2
		String input="AAABBCDD";
		frekans(input);
	}
	public static void frekans(String input) {
		int count=0;
		String sonuc="";
		
		for (int i = 0; i < input.length(); i++) {
			for (int j = i; j < input.length(); j++) {
				if (input.substring(i, i+1).equals(input.substring(j, j+1))) {
					count++;
				}
				
			} 
			if (sonuc.contains(input.substring(i, i+1))) {
				
			} else sonuc+=input.substring(i, i+1)+count;
			 
			count=0;
		} System.out.println(sonuc);
		
		
		
		
		
		
		
	}
	


}
