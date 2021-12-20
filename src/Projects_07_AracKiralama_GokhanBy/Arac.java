package Projects_07_AracKiralama_GokhanBy;

public class Arac {
	
	String marka; //(liste araclari --> opel toyota volvo)
    String model;  //(astra corolla s60)
    String yakitTipi; // (diesel benzin)
    String vites; //(manuel otomatik)
    double gunlukUcret; //( 100 120 150... liste dısı arac=300)
    
    
    
    public Arac() {
    	
    }

    
    public Arac(String marka, String model, String yakitTipi, String vites, double gunlukUcret) {
    	this.marka=marka;
    	this.model=model;
    	this.yakitTipi=yakitTipi;
    	this.vites=vites;
    	this.gunlukUcret=gunlukUcret;
    	
    }


	@Override
	public String toString() {
		return "Arac [marka=" + marka + ",\t model=" + model + ",\t yakitTipi=" + yakitTipi + ",\t vites=" + vites
				+ ",\t gunlukUcret=" + gunlukUcret + "]";
	}
    
    
}
