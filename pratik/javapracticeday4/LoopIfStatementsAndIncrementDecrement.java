package javapracticeday4;

import java.util.Scanner;

public class LoopIfStatementsAndIncrementDecrement {

	public static void main(String[] args) {
		/*
         * bir userName (kullanici adi)olusturunuz ve onun ozellikleri sirasi ile soyle
         * olmalidir; 1_ uzunlugu => en az 8 karakter (chars) olmalidir 2_ icinde sadece
         * alfabetik karakterler bulunmalidir
         */
        // 01234
        String userName = "SelimTopbas".toLowerCase();// length of the userName => 5
        int count = 0;
        if (userName.length() >= 8) {
            for (int i = 0; i < userName.length(); i++) {
                char temp = userName.charAt(i);
                if (!(temp < 'a' || temp > 'z')) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Olusturdugunuz user name basarili bir sekilde isleme gecmistir");
            } else {
                System.out.println("User name basarili bir sekilde olusturulamamistir");
                System.out.println("Lutfen tekrar deneyiniz");
            }
        } else {
            System.out.println("username length i yetersizdir!");
            System.out.println("Lutfen tekrar deneyiniz");
        }

	}
	}
		
		
	


