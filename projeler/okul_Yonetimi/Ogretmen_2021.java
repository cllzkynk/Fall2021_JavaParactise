package okul_Yonetimi;

import okul_Yonetimi_x.Kisi;

public class Ogretmen_2021 extends Kisi {

  private  String  sicilNo;
  private  String  bolum;

    public Ogretmen_2021() {

    }

    public Ogretmen_2021(String adSoyad, String kimlikNo, int yas, String sicilNo, String bolum) {
        super(adSoyad, kimlikNo, yas);
        this.sicilNo = sicilNo;
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {

        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +"ad soyad="+getAdSoyad()+",kimlik No :"+getKimlikNo()+", yas="+getYas()+
                ", sicilNo='" + sicilNo + '\'' +
                ", bolum='" + bolum + '\'' +
                '}';
    }
}
