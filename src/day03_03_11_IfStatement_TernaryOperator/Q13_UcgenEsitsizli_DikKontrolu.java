package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;
public class Q13_UcgenEsitsizli_DikKontrolu {

	public static void main(String[] args) {

		/*
		 * Problem tanimi Kullanicidan uc adet sayi alarak bu sayilarin bir dik ucgenin
		 * kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz (Yardim: Bir
		 * ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor baglantisindan
		 * yararlanabilirsiniz)
		 */
		
		 
			Scanner scan = new Scanner(System.in);
			System.out.println(" Lutfen ucgenin kenarlarini sirayla  giriniz.\nK1 : ");
			double k1=scan.nextDouble();
			System.out.println("k2 : ");
			double k2=scan.nextDouble();
			System.out.println("k3 : ");
			double k3=scan.nextDouble();
			double temp=0;
			
			if ((((k1 + k2 > k3 && k3 > k1 - k2) && ((k1 + k3 > k2) && k2 > k1 - k3) && ((k2 + k3 > k1) && k3 > k2 - k3))
					&& k1 > 0 && k2 > 0 && k3 > 0)) {
				if (k1!=k2||k1!=k3||k2!=k3) {
					
					if (k1>k2&&k1>k3) {
						temp=k1;
						k1=k3;
						k3=temp;
						if (((k1*k1)+(k2*k2))==(k3*k3)) {
							System.out.println("Kenarlari girilen ucgen dik ucgendir");
						}  else {
							System.out.println("Ucgen olusabilir ama  dik ucgen olamaz");
						}
					} else if (k2>k1&&k2>k3) {
						temp=k2;
						k2=k3;
						k3=temp;
						if (((k1*k1)+(k2*k2))==(k3*k3)) {
							System.out.println("Kenarlari girilen ucgen dik ucgendir");
						}else {
							System.out.println("Ucgen olusabilir ama  dik ucgen olamaz");
						}
					}else if (k3>k1&&k3>k2) {
						
						if (((k1*k1)+(k2*k2))==(k3*k3)) {
							System.out.println("Kenarlari girilen ucgen dik ucgendir");
						} else {
							System.out.println("Ucgen olusabilir ama  dik ucgen olamaz");
						}
					} 
					
				} else {
					System.out.println("Ucgen olusabilir ama  dik ucgen olamaz. ");
				}
				
			} else {
				System.out.println("Girilen degerler  ile ucgen olusturulamaz.");
			}
		scan.close()	;

	}
}
