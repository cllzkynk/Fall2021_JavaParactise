package javapracticeday8;
import java.util.Scanner;
public class Question12 {
	/*
	 * Kullanıcı tarafından girilen yazı ya da sayının polindrom olup 
	 * olmadığını bulan bir program yazınız.
	 * 
	 * 1. Adım : Kullanıcıdan veri alalım.
	 * 2. Adım : For döngüsü kullanarak aldığımız ifadenin tersini bulalım.
	 * 3. Adım : Tersi ile normal ifadeyi karşılaştıralım.
	 * 
	 *      12321 = 12321
	 *      
	 *      baab = baad
	 *      
	 *      ey edip adanada pide ye
	 * 
	 * */
	public static void main(String[] args) {
		String normalHali = "";
		String tersHali = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen tersini görmek istediğiniz ifadeyi yazınız : ");
		normalHali = scan.nextLine();
		for(int i = normalHali.length()-1 ; i >= 0 ; i--) {
			//System.out.print(normalHali.charAt(i));
			tersHali = tersHali + normalHali.charAt(i);
		}
		if(tersHali.equals(normalHali)) {
			System.out.println("POLİNDROM");
		}else {
			System.out.println("POLİNDROM DEĞİL");
		}
		scan.close();
	}
}



