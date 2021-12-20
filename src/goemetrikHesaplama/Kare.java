package goemetrikHesaplama;

public class Kare extends Dikdortgen {

	public Kare(double uzunKenar, double kisaKenar) {
		super(uzunKenar, kisaKenar);

	}

	@Override
	public String toString() {
		return "\nKARE\nUzunKenar ==>" + uzunKenar + "\nKisaKenar ==>" + kisaKenar + " \nCevre     ==>"
				+ cevreHesaplama() + "\nAalan     ==>" + alanHesaplama();
	}

}
