package day06_Method_Creation;

import java.util.Scanner;

/*
 * @author CELIL
 */
public class Q01_StringManupulationsWihtVoidMetod {
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

		scan.close();
	}

	public static void ilkIkisiz(String str) {
		if (str.startsWith("gh")) {
			System.out.println(str);
		} else if (str.startsWith("g")) {
			System.out.println(str.charAt(0) + str.substring(2));
		} else if (str.charAt(1) == 'h') {
			System.out.println(str.substring(1));
		} else {
			System.out.println(str.substring(2));
		}

	}
}
