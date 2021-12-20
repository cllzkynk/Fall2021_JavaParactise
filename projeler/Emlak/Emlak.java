/**
 * 
 */
package Emlak;

import java.util.Scanner;

/**
 * @author CELÝL
 */
public class Emlak {
	
	

	public int listeNo;
	public String evTipi;
	public String il;
	public int odaSayisi;
	private double fiyat;
	public String stokDurumu;
	
	 
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


	public String getStokDurumu() {
		return stokDurumu;
	}


	public void setStokDurumu(String stokDurumu) {
		this.stokDurumu = stokDurumu;
	}

	 
 
	


	Emlak(int listeNo,String evTipi, String il, int odaSayisi, double fiyat, String stokDurumu ){
		Scanner scan = new Scanner(System.in);
		 this.listeNo=listeNo++;
		
		
		System.out.print("Ev Tipi:");
		this.evTipi = scan.next();
		
		System.out.print("il:");
		this.il =scan.next();
		
		System.out.print("Oda Sayisi:");
		this.odaSayisi = scan.nextInt();

		System.out.print("Fiyat:");
		this.fiyat = scan.nextInt();
		
		System.out.print("Stok Durumu:");
		this.stokDurumu = scan.next();
	

	}
	
	
	public void listeleEmlak(){ 
		System.out.println("\nListe no    :"+listeNo+"\nEv Tipi     :" +evTipi + "\nIl          :" + 
	il +"\nOda Sayisi  :" + odaSayisi + "\nFiyat       :" +fiyat+" TL" + "\nStok Durumu :" + stokDurumu);
	};
	

}
