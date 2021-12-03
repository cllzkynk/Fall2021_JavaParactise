package javapracticeday5;

public class HarfTekrari {

	public static void main(String[] args) {
		/*
		 * Bir method olusturunuz charSayisi ve 2 parameter ekleyiniz 1- char 2- String
		 * char ch = 'p'; String str = “Ingilizce’de purple mor ve people insanlar
		 * demektir"; int count = 0; Yukaridaki String te elinizdeki char ne kadar
		 * tekrar etmisse o kadar return etsin for loop, increment ve if statements
		 * kullanabilirsiniz
		 */

		String ch = " ";
		String str ="Ingilizce’de purple mor ve people insanlar demektir";
		
		String [] arr = str.split(ch);
		System.out.println(arr.length-1);
				
	}

}
