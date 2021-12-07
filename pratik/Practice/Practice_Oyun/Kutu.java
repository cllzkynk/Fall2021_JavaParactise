package Practice.Practice_Oyun;

public class Kutu {
	
	private int kutuNumarasi;
	private int paraMiktari;
	
	public Kutu(int sayi1,int sayi2) {
		
		this.kutuNumarasi=sayi1;   // sayi1 kutunumarasi     sayi2  paramiktari
		this.paraMiktari=sayi2;	
		
	}

	public int getKutuNumarasi() {
		return kutuNumarasi;
	}

	public int getParaMiktari() {
		return paraMiktari;
	}
	
	

}