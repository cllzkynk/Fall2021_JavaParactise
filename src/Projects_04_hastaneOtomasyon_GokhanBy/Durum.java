package Projects_04_hastaneOtomasyon_GokhanBy;

public class Durum {

	private static String aktuelDurum;
	private static boolean aciliyet;

	@Override
	public String toString() {
		return "Durum [getAktuelDurum()=" + getAktuelDurum() + ", isAciliyet()=" + isAciliyet() + "]";
	}
	public String getAktuelDurum() {
		return aktuelDurum;
	}
	public void setAktuelDurum(String aktuelDurum) {
		this.aktuelDurum = aktuelDurum;
	}
	public boolean isAciliyet() {
		return aciliyet;
	}
	public void setAciliyet(boolean aciliyet) {
		this.aciliyet = aciliyet;
	}

	
}
