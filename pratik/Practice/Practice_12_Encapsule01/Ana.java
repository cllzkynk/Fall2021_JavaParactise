package Practice.Practice_12_Encapsule01;

public class Ana {

	private String ad="Ahmet";
	private int yas=40;
	String adres="Ankara";
	
	public Ana() { // parametresiz constructor
		
	}

	
	public Ana(String ad, int yas, String adres) { // parametreli constructor
		
		this.ad = ad;
		this.yas = yas;
		this.adres=adres;
	}

	
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	// toString();

	@Override
	public String toString() {
		return "Ana [ad=" + ad + ", yas=" + yas + ", adres=" + adres + "]";
	}
	
	
	
}
