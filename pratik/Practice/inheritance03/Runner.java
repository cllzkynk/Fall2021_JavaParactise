package Practice.inheritance03;

public class Runner {

	/*
	 * -Hayvanlarn beslenme,barinma, boyut ve solunum ozellikleri ile ilgili
	 * methodlar barindiran Hayvan isminde bir class olusturalim
	 * 
	 * -Hayvan sinifinin SubClassi bir Kus Classi olusturalim ve bu class ucma ve
	 * barinma methodlarini icersin
	 * 
	 * -Hayvan sinifinin SubClassi bir Balik Classi olusturalim ve bu class yuzme ve
	 * Solunum methodlarini icersin
	 * 
	 * -kus sinifinin SubClassi  bir Guversin Classi olusturalim ve bu class beslenme
	 * ve boyut methodlarini icersin
	 * 
	 * -Balik sinifinin SubClassi  bir JaponBaligi Classi olusturalim ve bu class
	 * solunum methodu icersin ve bu methodu Superclasstan alsin
	 * 
	 * --Runner class olusturalim ve olusturdugumuz metholari cagiralim.
	 */

	public static void main(String[] args) {


		Hayvan h = new Hayvan();
		Kus k = new Kus();
		Balik b = new Balik();
		Guvercin g = new Guvercin();
		JaponBaligi j = new JaponBaligi();
		
		h.barinma();
		h.beslenme();
		h.boyut();
		h.solunum();
		
		k.barinma();
		k.ucma();
		
		b.solunum();
		b.yuzme();
		
		g.beslenme();
		g.boyut();
		
		j.solunum();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
