package _10_ENUM.Ex01;

public class Ex01Main {
    public static void main(String[] args) {
        //verilen ay nosuna gore ayin kacgun oldg yazdiriniz...
        //int ay = 5;
        Aylar ay=Aylar.KASIM;

        System.out.println("ay"+ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay sırasi = " + ay.ordinal());//enum yapısındaki ay obj index sırası :10
        switch (ay) {


            case OCAK://girin ay yıldaki sırası
                System.out.println("ocak");
                break;
            case SUBAT:
                System.out.println("subat");
                break;

            case MART:
                System.out.println("mart");
                break;

            case NISAN:
                System.out.println("nisan");
                break;

            case KASIM:
                System.out.println("iyiki dogdun oguzhan kardesssss");
                break;
        }
    }
}
