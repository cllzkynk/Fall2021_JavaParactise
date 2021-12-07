package Practice.inheritance04;

public class Yonetici extends Calisan {

	public Yonetici(String isim, int maas, String departman) {

		super(isim, maas, departman);
	}

	public void zam(int zamMiktari) {
		System.out.println("Yapilacak zam miktari : " + zamMiktari);
	}



}
