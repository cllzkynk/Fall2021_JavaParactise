package Projects_04_hastaneOtomasyon_GokhanBy;

public class Hasta {
	
	private static String isim;
	private static String soyIsim;
	private static int hastaID;
	private static Durum hastaDurumu;
	

	
	@Override
	public String toString() {
		return "Hasta [getIsim()=" + getIsim() + ", getSoyIsim()=" + getSoyIsim() + ", getHastaID()=" + getHastaID()
				+ ", getHastaDurumu()=" + getHastaDurumu() + "]";
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyIsim() {
		return soyIsim;
	}
	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	public int getHastaID() {
		return hastaID;
	}
	public void setHastaID(int hastaID) {
		this.hastaID = hastaID;
	}
	public Durum getHastaDurumu() {
		return hastaDurumu;
	}
	public void setHastaDurumu(Durum hastaDurumu) {
		this.hastaDurumu = hastaDurumu;
	}
	
	

}
