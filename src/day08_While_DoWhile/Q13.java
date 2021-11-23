package day08_While_DoWhile;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /*
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */

    	
    		

    		Scanner giris = new Scanner(System.in); // scanner in ismi scan olmak zorunda degil
    		System.out.println("Lutfen aldiginiz urunun adedini giriniz");
    		int quantity = giris.nextInt();

    		System.out.println("Lutfen aldiginiz urunun fiyatini giriniz");
    		double price = giris.nextInt();
    		double totalPrice = quantity * price;

    		System.out.println("Lutfen musteri kartiniz varsa E yoksa H giriniz");
    		char card = giris.next().toLowerCase().charAt(0);

    		if (card == 'e') {
    			if (quantity >= 10) {
    				price = price * 0.8;
    				totalPrice = quantity * price;

    				System.out.println(
    						"10 ve uzeri urun aldiginiz icin %20 indirim kazandiniz \n ve odeyeceginiz toplam fiyat :"
    								+ totalPrice);

    			} else {
    				price = price * 0.85;
    				totalPrice = quantity * price;

    				System.out.println(
    						"10 dan az urun aldiginiz icin %15 indirim kazandiniz \n ve odeyeceginiz toplam fiyat :"
    								+ totalPrice);
    			}

    		} else if (card == 'h') {
    			if (quantity >= 10) {
    				price = price * 0.85;
    				totalPrice = quantity * price;

    				System.out.println(
    						"10 ve uzeri urun aldiginiz icin %15 indirim kazandiniz \n ve odeyeceginiz toplam fiyat :"
    								+ totalPrice);

    			} else {
    				price = price * 0.9;
    				totalPrice = quantity * price;

    				System.out.println(
    						"10 dan az urun aldiginiz icin %10 indirim kazandiniz \n ve odeyeceginiz toplam fiyat :"
    								+ totalPrice);
    			}
    		} else {
    			System.out.println("Lutfen dogru giris yapiniz");
    		}
    		giris.close();
    	}

    	}
