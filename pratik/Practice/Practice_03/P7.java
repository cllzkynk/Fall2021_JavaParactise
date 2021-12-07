package Practice.Practice_03;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {


		// Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz...

		Scanner scanner = new Scanner(System.in);
		System.out.println("bir kelime giriniz :");
		String name1 = scanner.nextLine();

		System.out.println("girdiginiz kelimede " + name1.contains(" "));
		
		scanner.close();
	}
}
