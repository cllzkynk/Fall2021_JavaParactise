package Practice.Practice_13_Abstract01;

public class Dikdortgen extends Sekil{

	public int kk,uk;
	
	
	// Kullanicidan almazsak parametreli cons olusturup yapabiliriz...
	public Dikdortgen(int kk, int uk) {
		super();
		this.kk = kk;
		this.uk = uk;
	}

	@Override
	public int cevre() {
	
		return 2*(kk+uk);
		
	}

	@Override
	public int alan() {
		
		return kk*uk;
		
	}

}