package Projects_04_hastaneOtomasyon_GokhanBy;

public class Hastane extends VeriBankasi{
	
	
	Doktor doktor = new Doktor();
	Hasta hasta = new Hasta();
	
	@Override
	public String toString() {
		return "Hastane [doktor=" + doktor + ", hasta=" + hasta + "]";
	}
	public Doktor getDoktor() {
		return doktor;
	}
	public void setDoktor(Doktor doktor) {
		this.doktor = doktor;
	}
	public Hasta getHasta() {
		return hasta;
	}
	public void setHasta(Hasta hasta) {
		this.hasta = hasta;
	}
	
}
