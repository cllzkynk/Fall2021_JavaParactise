package genelTekrar;

public class Vararg {

	public static void main(String[] args) {
//		Birden fazla tamsayıyı input olarak alıp toplamlarını veren bir METHOD yazınız
//		Method adı = toplama
//		toplama(1,2,3) yazarsak output =6
//		toplama(1,2,3,4,5) yazarsak output =15
//		toplama(1,2) yazarsak output =3
		
		toplama(1,3,7,15);
			}
			
			public static void toplama(int... x) {
				
				int sonuc=0;
				for (int each:x) {
					sonuc+=each;
				}
				System.out.println("sonuc = " + sonuc);
			}


}
