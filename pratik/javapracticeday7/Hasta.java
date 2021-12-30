package javapracticeday7;
public class Hasta {
/*
    3 instance variable olusturunuz ve encapsulation kullaniniz
    getter ve setter olusturyorsunuz
    String isim
    String soyIsim
    Case suankiDurum ;
    */
    private String isim;//null
    private String soyIsim;//null
    private Case suankiDurum;//null
    
    
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
    public Case getSuankiDurum() {
        return suankiDurum;
    }
    public void setSuankiDurum(Case suankiDurum) {
        this.suankiDurum = suankiDurum;
    }
    
}