package genelTekrar;

public class StringdekiSayilariToplama {

	public static void main(String[] args) {
//		Bir Stringi input olarak alıp, String içindeki sayıların toplamını veren bir METHOD yazınız
//		Ör: input : ade1r4d3   output : 8
//		İpucu :      Character.isDigit()
//		                 Integer.valueOf()
		
		String input = "ade1r4d3a2";
		topla(input);
	}

	public static void topla(String input) {
		int toplam=0;
		for (int i = 0; i < input.length(); i++) {
			if(Character.isDigit(input.charAt(i))) {
				toplam+= Integer.valueOf(""+input.charAt(i));
			}
			
		} System.out.println("string icindeki rakamlarin toplami= " + toplam);
		
		
	}
	
}