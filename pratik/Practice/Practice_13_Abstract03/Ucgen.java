package Practice.Practice_13_Abstract03;

public class Ucgen extends Sekil {
	
	public int a,b,c,h;

	public Ucgen(int a, int b, int c, int h) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}

	@Override
	public int cevre() {
		
		return (a+b+c);
	}

	@Override
	public int alan() {
		// TODO Auto-generated method stub
		return h*a/2;
	}


	
	

}
