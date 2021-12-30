package laptop_Projesi;

public class Indirim {
	
	static int indirim;
	
	protected static int indirim(int toplam){
		
		if (toplam > 8500 ) {
			indirim=30;
		}else if(toplam >7500) {
			indirim=20;
		}else if (toplam >4500) {
			indirim=10;
		}
		return indirim;
	}
	
}
