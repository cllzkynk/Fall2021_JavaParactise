package goemetrikHesaplama;

public class Cember extends Sekil {

	double yariCap;

	public Cember(double yariCap) {
		super(yariCap);
		this.yariCap = yariCap;
	}

	public double cevreHesaplama() {

		return yariCap * 2 * 3.14;

	}

	public double alanHesaplama() {

		return yariCap * yariCap * 3.14;

	}

	@Override
	public String toString() {
		return "CEMBER \nyariCap ==>" + yariCap + "\nCevre   ==>" + cevreHesaplama() + "\nAlan    ==>"
				+ alanHesaplama();
	}

}
