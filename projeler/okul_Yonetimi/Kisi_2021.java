package okul_Yonetimi;

public class Kisi_2021 {

   private String adSoyad;
   private String kimlikNo;
   private int yas;

   public  Kisi_2021(){
   }
    public Kisi_2021(String adSoyad, String kimlikNo, int yas) {
        setAdSoyad(adSoyad);
        this.kimlikNo = kimlikNo;
        setYas(yas);
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {

        this.adSoyad = adSoyad.toUpperCase();
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas <0) {
            this.yas=-yas;
        }
        else
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
