package day04_switchCase;

import java.util.Scanner;
/*
 * @author CELÝL
 */
public class AygirKacgunGor {
	// Girilen bir ay numarasýna göre , ayýn kaç gün olduðunu sayý ile yazdýrýnýz.
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
    	System.out.print("gununu oðrenmek istediginiz ay nosunu giriniz : ");
    	int ayNo=scan.nextInt();
    	
    	switch (ayNo) {
		    case 1: case 3: case 5: case 7:  case 8: case 10: case 12:			
				System.out.println("girdiginiz ay 31 gun");		
			break;
			
			case 4:  case 6: case 9: case 11: 
		System.out.println("girdiginiz ay 30 gun");
			break;
				case 2:
				System.out.print("yili giriniz : ");
				int yil=scan.nextInt();
				if (yil%4==0) {
					System.out.println("girdiginiz ay 29 gun");
				}
				else {
					System.out.println("girdiginiz ay 28 gun");
				}
				
				break;
		default:
			System.out.println("agam boyle bir ay yok...");
			break;
		}
    	
      scan.close();
    }
}
