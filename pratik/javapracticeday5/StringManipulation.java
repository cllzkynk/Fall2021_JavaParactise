package javapracticeday5;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		/*
		Kullanicidan bir e-mail addressi  isteyiniz eger email id de "hotmail" varsa  "gmail" ile degistiriniz
		e.g: mesutyaman@hotmail.com  ==> mesutyaman@gmail.com
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Mail adresini giriniz");
		//1.yol
		String mail=sc.nextLine();
		System.out.println(mail.replace("hotmail", "gmail"));
		
//		2 yol
		if(mail.contains("hotmail")) {
			mail=mail.replaceAll("hotmail", "gmail");
			System.out.println(mail);
			
			
		}
	}

}
