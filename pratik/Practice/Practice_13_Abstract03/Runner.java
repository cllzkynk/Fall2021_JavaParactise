package Practice.Practice_13_Abstract03;

public class Runner {

	static Ucgen ucgen=new Ucgen(13,5,12,6);
	public static void main(String[] args) {
		
		System.out.println("Ucgenin Cevresi : " + ucgen.cevre());
		System.out.println("Ucgenin Alani : " + ucgen.alan());

	}

}
