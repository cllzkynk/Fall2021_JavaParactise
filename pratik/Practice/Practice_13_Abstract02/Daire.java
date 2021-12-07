package Practice.Practice_13_Abstract02;

public class Daire extends Sekil{
	
	public double pi;
	public double r;

	
	public Daire(double pi, double r) {
		super();
		this.pi = pi;
		this.r = r;
	}

	@Override
	public double cevre() {
		
		return 2*pi*r;
	}

	@Override
	public double alan() {
		
		return pi*r*r;
	}

	
	

}
