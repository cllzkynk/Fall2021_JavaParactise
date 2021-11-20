package day06_Method_Creation;
public class Q11_YaziTuraOyunu {
	public static void main(String[] args) {
		int yazi = 0;
		int tura = 0;
		int dik = 0;
//0.5 den kucukler yazi  //0.5 den buyukler tura  //0.5 dik geldi
	
		for (double i = 1; i <= 100; i=i+0.5) {
			double sayi = Math.random();
			if (sayi < 0.5) {
				yazi++;
			} else if (sayi > 0.5) {
				tura++;
			} else {
				dik++;
		
			}} 	
		System.out.println("yazi gelme sayisi :  " + yazi);
		System.out.println("tura gelme sayisi :  " + tura);
		System.out.println("dik gelme sayisi  :  " + dik);
		
	}
}
