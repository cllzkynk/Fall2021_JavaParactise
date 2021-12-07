package Practice.Practice_01;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		
        /*
        Kulanicidan aracinin hizini aliniz
        Trafik cezasinin degerini hesaplayin.
            45 hiz siniridir.
            Eger hiziniz 55-74 arasinda ise:
            Ceza 100 $'dir.

            Eger hiziniz 75 - 84 arasinda ise:
            Ceza 150 $'dir.

            Eger hiziniz 85 -94 arasinda ise:
            Ceza 320 $'dir.

            Eger hiziniz 94'den daha fazla ise:
            Ceza 500 $'dir.

            ve ayrica,
            Eger surucunun ehliyeti yoksa cezaya 200 $ eklenir.

            Orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Orn;

            currentSpeed(Hiziniz) 87
            ve isDriverLicenceAvailable(Ehliyeti var mi?) = true;

            sonuc 320 olmalidir

            currentSpeed(Hiziniz) 65
            ve isDriverLicenceAvailable(Ehliyeti var mi?) = false;

            sonuc 300 olmalidir
     */
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Hiziniz giriniz : ");
		int hiz=scan.nextInt();
		
		System.out.println("Ehliyetiniz var ise 1 yoksa 0 yaziniz : ");
		int ehliyet=scan.nextInt();
		
         if (ehliyet==1) {
			
			if (hiz>54 && hiz<75) {
				System.out.println("Cezaniz 100 dolar..");
				
			}else if (hiz>75 && hiz<84) {
				System.out.println("Cezaniz 150 dolar..");
			}else if (hiz>85 && hiz<94) {
				System.out.println("Cezaniz 320 dolar..");
			}else if (hiz>95) {
				System.out.println("Cezaniz 500 dolar..");
			}
		
		}else {
			if (hiz>54 && hiz<75) {
				System.out.println("Cezaniz 300 dolar..");
				
			}else if (hiz>75 && hiz<84) {
				System.out.println("Cezaniz 350 dolar..");
			}else if (hiz>85 && hiz<94) {
				System.out.println("Cezaniz 620 dolar..");
			}else if (hiz>95) {
				System.out.println("Cezaniz 800 dolar..");
			}else {
				System.out.println("ceza ehliyet 300 dolar");
			}
			scan.close();
		}	
		
    	
    }
}
