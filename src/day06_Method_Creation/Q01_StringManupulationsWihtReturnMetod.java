package day06_Method_Creation;

import java.util.Scanner;

/*
 * @author CELÝL
 *
 */
public class Q01_StringManupulationsWihtReturnMetod {
	/*
	 * StringMethods String girildiginde ilk iki karakteri haric string return eden
	 * java programi yaziniz Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu
	 * karakterler de return edilsin ORNEK: INPUT : goat photo ghost kalem OUTPUT :
	 * gat hoto ghost lem
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir yazi gir");
		String str = scan.nextLine();

		ilkIkisiz(str);
		
		System.out.println(ilkIkisiz(str));

		scan.close();
	}

	public static String ilkIkisiz(String str) {
		str=str+"a";
		
		String kalanHarfler="";
		if (str.startsWith("gh")) {
			kalanHarfler=str;
		} else if (str.startsWith("g")) {
			kalanHarfler=str.charAt(0) + str.substring(2);
		} else if (str.charAt(1) == 'h') {
			kalanHarfler=str.substring(1);
		} else {
			kalanHarfler=str.substring(2);
		}
		return kalanHarfler;

	}
}
