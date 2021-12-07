package Practice.Practice_03;
import java.util.Scanner;
public class P5 {
	public static void main(String[] args) {
		
		/*Bakiye sorma para cekme para yatirma ve cikis islemlerinin 
		 * oldugu bir bankamatik projesi kodlayiniz...
		 */
         System.out.println("JAVA BANK ATM'ye Ho�geldiniz...");
         
         System.out.println("1. islem : bakiye sorma\n2. islem : para cekme\n3.islem : para yatirma\n4. islem : cikis");
         
         int bakiye =5000;
         
         Scanner scanner=new Scanner(System.in);
         System.out.print("lutfen yapacaginiz islemi seciniz: ");
         int secim=scanner.nextInt();
         
         switch (secim) {
		case 1: {
			System.out.println("bakiyeniz: " +bakiye);
			
			break;
		}
		case 2: {
			System.out.print("cekeceginiz miktari giriniz : " );
			int cekilenMiktar=scanner.nextInt();
			if (cekilenMiktar>bakiye) {
				System.out.println("bakiyeniz yeterli degil");
				
			}else {
				bakiye-=cekilenMiktar;//bakiyeden cekilenMiktari cikardik
				System.out.println("yeni bakiyeniz :"+bakiye);
			}
			break;
		}
		case 3: {
			System.out.print("yatiracaginiz miktari giriniz: " );
			int yatirilanmiktar=scanner.nextInt();
			bakiye+=yatirilanmiktar; //bakiyeye yatirilanmiktar ekledik
			System.out.println("yeni bakiyeniz :"+bakiye);
			break;
		}
		case 4: {
			System.out.println("islemden cikisiniz yapiliyor: " );
			break;
		}
		default:	
		}
scanner.close();
    }
}
