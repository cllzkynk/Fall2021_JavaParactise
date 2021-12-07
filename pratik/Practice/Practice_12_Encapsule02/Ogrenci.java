package Practice.Practice_12_Encapsule02;

public class Ogrenci {
	
	/*
	ad(String),telefon(String),no(int) bilgisi olacak
	hepsi private olcak
	farkli bir classta,
	klavyeden girilen 3 adet ogrenciye ait bilgiyi ekranda goruntule
	*/
	
	// ana class
	// 1. adim private bilgileri tanimla...
	// 2. adim parametresiz cons olustur...(source)
	// 3. adim parametreli cons olustur...(source)
	// 4. adim getter ve setter olustur...(source)
	// 5. adim toString olustur...(source)
	
	// main class
	// 6. adim obj olustur..
	// 7. adim for dongusu olusturup icine kullanicidan bilgi iste..
	// 8. adim Scanner objesi olustur static olarak...
	// 9. adim Olusturulan obj1 den bilgileri set edelim..
	// 10. adim yazdirma islemleri icin get() kullanimi...
	
	private String ad;
	private String tel;
	private int no;
	
	public Ogrenci() {
		
	}
	
	public Ogrenci(String ad, String tel, int no) {
		
		this.ad = ad;
		this.tel = tel;
		this.no = no;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", tel=" + tel + ", no=" + no + "]";
	}
	
	
	

}
