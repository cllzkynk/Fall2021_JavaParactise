package goemetrikHesaplama;

public class Kare extends Dikdortgen {

	public Kare(double uzunKenar, double kisaKenar) {
		super(uzunKenar, kisaKenar);

	}

	@Override
	public String toString() {
		return "\nKARE\nKenar1 ==>" + uzunKenar + "\nKenar2 ==>" + kisaKenar + " \nCevre  ==>"
				+ cevreHesaplama() + "\nAalan  ==>" + alanHesaplama();
	}

}
