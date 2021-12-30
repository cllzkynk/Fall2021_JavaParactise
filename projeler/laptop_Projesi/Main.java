package laptop_Projesi;

import java.util.Scanner;

public class Main {

	private static Calculation hesap = new Calculation();
	private static Indirim indirim=new Indirim();
	public static int secim;
	
	
	public static void main(String[] args) {
		
		islem();
		
		
	}

	private static void islem() {
		Scanner scan = new Scanner (System.in);
		System.out.println("\n***** QA Computer'a HOSGELDİNİZ *****\n");
		System.out.println("\t1 ==> Laptop'lari incelemek istiyorum"
				+"\n\t2 ==> Cikis\n");
		System.out.print("Isleminizi seciniz ==> ");
		secim=scan.nextInt();
		
		switch (secim) {
		case 1:
			price();
			satinAlma();
			break;
		case 2:
			cikis();
			break;
			
		default:
			System.out.println("Hatali giris yaptiniz");
			islem();
			break;
		}
		
	}

	private static void satinAlma() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Secmis oldugunuz bilgisayar icin yapmak istdiginiz islemi girin "
				+ "\n\t1 ==> Satin alma islemi "
				+ "\n\t2 ==> Laptop'lari incelemeye devam etmek istiyorum"
				+ "\n\t3 ==> Cikis " );
		System.out.print("Islemi seciniz ==> ");
		secim=scan.nextInt();
		
		switch (secim) {
		case 1:
			odeme();
			islem();
			break;
		case 2:
			price();
			satinAlma();
			break;
		case 3:
			cikis();
			break;

		default:
			System.out.println("Yanlis giris yaptiniz : ");
			break;
		}
		
	}

	private static void cikis() {
		
		System.out.println("\nIYI GUNLER DILERIZ \n\tBIZI TERCİH ETTIGINIZ ICIN \n\t\t\t TESEKKUR EDERIZ");
				
	}

	private static void odeme() {
		Scanner scan= new Scanner (System.in);
		KrediKarti kart=new KrediKarti();
		Pesin cash = new Pesin();
		indirim.indirim(hesap.getSumPrice());
		System.out.println("\nOdemeyi nasil yapmak istersiniz : \n\t1 == > Kredi Karti \n\t2 ==> Pesin");
		System.out.print("Islemi secin ==> ");
		secim=scan.nextInt();
		
			if(secim ==1 ) {			
			kart.krediKarti(hesap.getSumPrice());
			}else if(secim == 2) {
				cash.pesin(hesap.getSumPrice());
			} else {
				System.out.println("Hatali giris");
				odeme();
			}
		
		
	}

	private static void price() {
		Scanner scan = new Scanner(System.in);
		System.out.println("***** Laptop Cesitlerimiz *****\n");
		for (int i = 0; i < hesap.laptopNames.length; i++) {
			System.out.println(i+1+" => "+hesap.laptopNames[i] + " \t\t Fiyati => "+hesap.laptopPrice[i]);
		}
		System.out.print("\nAlmak istediginiz bilgisayar'i seciniz ==> ");
		secim=scan.nextInt()-1;
		hesap.setSumPrice(hesap.laptopPrice[secim]);
		System.out.println("\n"+hesap.toString());
		
		System.out.println("\n***** Isletim Sistemleri *****\n ");
		for (int i = 0; i < hesap.cpu.length; i++) {
			System.out.println(i+1+" => "+hesap.cpu[i]+ " \t\t Fiyati => "+hesap.cpuPrice[i]);
		}
		System.out.print("\nTercih ettiginiz isletim sistemini seciniz ==> ");
		secim=scan.nextInt()-1;
		hesap.setSumPrice(hesap.getSumPrice()+hesap.cpuPrice[secim]);
		System.out.println("\n"+hesap.toString());
		
		System.out.println("\n***** Ram Cesitleri *****\n ");
		for (int i = 0; i < hesap.ram.length; i++) {
			System.out.println(i+1+" => "+hesap.ram[i]+ " \t\t Fiyati => "+hesap.ramPrice[i]);
		}
		System.out.print("\nTercih ettiginiz ram turunu seciniz ==> ");
		secim=scan.nextInt()-1;
		hesap.setSumPrice(hesap.getSumPrice()+hesap.ramPrice[secim]);
		System.out.println("\n"+hesap.toString());
		
		System.out.println("\n***** Renk Cesitleri *****\n ");
		for (int i = 0; i < hesap.color.length; i++) {
			System.out.println(i+1+" => "+hesap.color[i]+ " \t\t Fiyati => "+hesap.colorPrice[i]);
		}
		System.out.print("\nTercih ettiginiz color turunu seciniz ==> ");
		secim=scan.nextInt()-1;
		hesap.setSumPrice(hesap.getSumPrice()+hesap.colorPrice[secim]);
		System.out.println("\n"+hesap.toString());
		
		System.out.println("\n***** Laptop Ebat Cesitleri *****\n ");
		for (int i = 0; i < hesap.size.length; i++) {
			System.out.println(i+1+" => "+hesap.size[i]+ " \t\t Fiyati => "+hesap.sizePrice[i]);
		}
		System.out.print("\nTercih ettiginiz color turunu seciniz ==> ");
		secim=scan.nextInt()-1;
		hesap.setSumPrice(hesap.getSumPrice()+hesap.sizePrice[secim]);
		System.out.println("\n"+hesap.toString());	
		
	}

}
