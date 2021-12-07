package Practice.Practice_04;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
				// ceviren bir method yaziniz.
				// Bu methodu main methodun disinda olusturup main methodun
				// h*3600 s   mil=km*1.6  gram=kg*1000
				// icinden cagiriniz.
				
				Scanner scanner =new Scanner(System.in);
				System.out.print("degistireceginiz birimi giriniz : ");
				
				String birim=scanner.nextLine();//saat  mil kg
				System.out.print("cevirilecek birimin miktarini giriniz : ");
				double miktar =scanner.nextDouble();// 5 saat 35 mil  65kg
				
				scanner.close();
				
				cevirici(birim, miktar);
			}
		
			public static void cevirici(String birim , double miktar) {
				
				switch (birim) {
				case "saat": {
					System.out.println(miktar*3600);
					
					break;
				}
				case "mil": {
					System.out.println(miktar*1.6);
					
					break;
				}
				case "kilogram": {
					System.out.println(miktar*1000);
					
					break;
				}
				default:
					System.out.println("haatli veri girdiniz");;
			
				}

			}
			
		}
