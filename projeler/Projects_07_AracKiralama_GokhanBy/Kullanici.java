package Projects_07_AracKiralama_GokhanBy;

public class Kullanici {
	
	String adiSoyadi;
	int yas;
	double kimlikNo;
	double kartNo;
	
	String alinacakSehir;
    String alinacakGun; //(MM,dd--> ay gun formatinda olmali)
    String alisSaati;
    String teslimGunu;  //(MM,dd--> ay gun formatinda olmali)
    String teslimSaati;
	
    @Override
	public String toString() {
		return "Kullanici [adiSoyadi=" + adiSoyadi + ", yas=" + yas + ", kimlikNo=" + kimlikNo + ", kartNo=" + kartNo
				+ ", alinacakSehir=" + alinacakSehir + ", alinacakGun=" + alinacakGun + ", alisSaati=" + alisSaati
				+ ", teslimGunu=" + teslimGunu + ", teslimSaati=" + teslimSaati + "]";
	}

    
    
  
    
}
