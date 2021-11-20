package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q14_derecedenDenklem {  
	/* G�n�n sorusu: if statement
    katsay�lar� verilen 2 bilinmeyenli denklemin k�kleriniz bulunuz.

      ax^2 + bx + c;

      ��z�m ad�mlar�
      kullan�c�dan a,b,c yi okutun.
      Delta = bb - 4ac
      Delta > 0 => 2 tane k�k vard�r x1=(-b + k�k(d)) / (2a)  , x2= (-b - k�k(d)) / (2*a)
      Delta = 0 => 1 tane k�k vard�r x = -b/2a
      Delta < 0 ise k�k yoktur.
 */
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		System.out.println("ax^2+bx+c seklindeki denklemin istenen degerlerinin asagiya giriniz");
		System.out.println("a: ");
		a = giris.nextDouble();

		System.out.println("b: ");
		b = giris.nextDouble();

		System.out.println("c: ");
		c = giris.nextDouble();

		delta = b * b - 4 * a * c;

		if (delta < 0) {
			System.out.println("Gercek kok yoktur. \n");
		} else if (delta == 0) {
			x1 = -b / (2 * a);
			System.out.println("x1=x2=" + x1);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		}

		giris.close();
	}
}
