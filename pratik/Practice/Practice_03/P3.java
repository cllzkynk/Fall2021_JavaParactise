package Practice.Practice_03;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// Kullanicidan alinan  Yilinn  ay numarasina gore , ayin kac gun oldugunu yazdiriniz

    	Scanner scanner = new Scanner(System.in);
		System.out.print("lutfen yilin kacinci ayinda oldugunuzu giriniz : ");
		int ay = scanner.nextInt();
	
		
		switch (ay) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("girdiginiz ay 31 gun cekiyor");
			break;
	
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("girdiginiz ay 30 gun cekiyor");
			break;
		case 2:
			System.out.print("yilinizi giriniz :");
			int yil=scanner.nextInt();
			
			if (yil%4==0) {
				System.out.println("girdiginiz ay 29 gun cekiyor");
				
			}else {
				System.out.println("girdiginiz ay 28 gun cekiyor");
				
			}
			break;
		
    default:
		System.out.println("hatali giris yaptniz");
		}
      
   scanner.close();
}
}