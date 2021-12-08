/**
 * 
 */
package Emlak11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author CELÝL
 */
public class Emlak {
	private String evTipi;
	private String il;
	private int odaSayisi ;
	private double fiyat;
	
	
	/*
	 * static ArrayList<Emlak> envanter = new ArrayList<>();
	static Emlak emlakx = new Emlak("Villa", "Corum", 8, 1000000);
	static Emlak emlaky = new Emlak("Yali", "Bartin", 5, 1800000);
	static   Emlak emlakz = new Emlak("Rezidance", "Sincan", 4, 1250000);
	 *  envanter.add(emlakx);
	 envanter.add(emlaky);
	 envanter.add(emlakz);
	 */
	
	// farkli calisanlarimiza ozel sadece gorme veya sadece degistirme yetkisi verebiliriz.
	public String getEvTipi() {
		return evTipi;
	}
	public void setEvTipi(String evTipi) {
		this.evTipi = evTipi;
	}
	
	
	
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}

	
	
	public int getOdaSayisi() {
		return odaSayisi;
	}
	public void setOdaSayisi(int odaSayisi) {
		this.odaSayisi = odaSayisi;
	}
	
	
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	
	//Constructor olusturduk buradan obje olusturunca gelen verileri ilk olusturdugumuz yukardaki verilerle eslestirecek
	Emlak(String evTipi, String il, int odaSayisi, double fiyat){
		Scanner scan = new Scanner(System.in);
		if (evTipi!=null&& il!=null && odaSayisi!=0&&fiyat!=0) {
		this.evTipi=evTipi;
		this.il=il;
		this.odaSayisi=odaSayisi;
		this.fiyat=fiyat;	
		}else {
		
		System.out.print("Ev Tipi  :");
		evTipi=scan.next();
		this.evTipi = evTipi;
	 
		System.out.print("il      :");
		il=scan.next();
		this.il = il;
	 
		System.out.print("Oda Sayisi:");
		odaSayisi = scan.nextInt();
		this.odaSayisi = odaSayisi;
	 
		System.out.print("Fiyat     :");
		fiyat = scan.nextInt();
		this.fiyat = fiyat;
		 
		}
scan.close();
	}


	
	 // envanterimizi listelemek icin metodumuz
	public void listeleEmlak(){
		System.out.println("\nEv Tipi :" +evTipi + "\nIl :" + il +"\nOda Sayisi :" + odaSayisi + "\nFiyat :" +fiyat+" TL");
	};
	
	
	
	
	public String toString(){
		return evTipi +" "+ il +" "+ odaSayisi + " "+ fiyat;
		
	}
	

	
}
