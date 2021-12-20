package goemetrikHesaplama;

public class Dikdortgen extends Sekil {

	double uzunKenar;
	double kisaKenar;

	public Dikdortgen(double uzunKenar, double kisaKenar) {
		super(uzunKenar, kisaKenar);
		this.uzunKenar = uzunKenar;
		this.kisaKenar = kisaKenar;

	}

	public double cevreHesaplama() {

		return (uzunKenar + kisaKenar) * 2;

	}

	public double alanHesaplama() {

		return uzunKenar * kisaKenar;

	}

	@Override
	public String toString() {
		return "\nDIKDORTGEN\nuzunKenar ==>" + uzunKenar + "\nKisaKenar ==>" + kisaKenar + "\nCevre     ==>"
				+ cevreHesaplama() + "\nAlan      ==>" + alanHesaplama();
	}

}
