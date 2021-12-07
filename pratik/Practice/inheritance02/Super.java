package Practice.inheritance02;

public class Super {

	/*
	 * Super class isminde bir method olusturalim
	 * icerine num=20 degerini olusturalim
	 * Goster isminde bir method "superclass i goruntukluyorsunuz" print etsin...
	 * 
	 * Subclass olusturalim
	 * ve superclasstan miras alalim SubClassta num=10 olsun
	 * goster metodu "subClass i goruntukluyorsunuz desin"
	 * 
	 * Runner classta
	 * My_method isminde bit method olusturalim. icerigine SubClasstaki goster ve
	 * SuperClass taki goster metodunu cagiralim ayni zamanda num degerini hem
	 * subBClasstan hem SuperClass tan yazdirin
	 */
	
	int num=20;
	
	public void goster() {
		System.out.println("superclass i goruntuluyorsunuz");
	}

	
	
}
