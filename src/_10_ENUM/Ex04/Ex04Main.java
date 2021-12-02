package _10_ENUM.Ex04;

public class Ex04Main {
    public static void main(String[] args) {
        Aylar ay = Aylar.SUBAT;
        ay.getGunMiktari();
        System.out.println("secilen ay gun sayisi :" + ay.days);
        System.out.println("ay :" + ay);
        //   switch (ay)
        //       {
        //           case OCAK:
        //       System.out.println(31);
        //       break;
        //   case SUBAT:
        //       System.out.println(28);
        //       break;
        //   case MART:
        //        System.out.println(30);
        //       break;
        //   case NISAN:
        //      System.out.println(31);
        //       break;

    }
}
