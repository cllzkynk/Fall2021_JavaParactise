package okul_Yonetimi_x;

public class Ogretmen extends Kisi {

  private  String  sicilNo;
  private  String  bolum;

    public Ogretmen() {

    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String sicilNo, String bolum) {
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