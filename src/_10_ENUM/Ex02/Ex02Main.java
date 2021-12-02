package _10_ENUM.Ex02;

public class Ex02Main {


    public static void main(String[] args) {
        User kullanici = new User();
        kullanici.name = "said";
        // kullanici.role=1;//customer
        //kullanici.status=2;//inactive
        kullanici.yetkisi = Role.ADMIN;
        kullanici.durum = Status.LOGIN;

        User kullanici1 = new User();
        kullanici1.name = "oner";
        // kullanici.role=1;//customer
        //kullanici.status=2;//inactive
        kullanici1.yetkisi = Role.CUSTOMER;
        kullanici1.durum = Status.ACTIVE;

        if (kullanici.yetkisi == Role.CUSTOMER) {
            System.out.println("silme yetkisi yok");
        }
        // Önceden belli olan sabit verilerin
        // atanmasındaki anlama zorluğu yerine
        // bu değerlerin karşılıkları ENUM ile
        // tanımlanarak , atama değeri için kullanılrlar.
        // Bu durum yazma ve anlama kolaylığı sağlar.
        // Enum class değildir. new key word kullanilmadan veri tanımlanır.
        //Enum değerleri değişken değildir static veriable gibi hafızada yer açması gerekmiyoronun için direk kullanılıyor.
        //dynamic değil static bir yapıdır
    }
}
