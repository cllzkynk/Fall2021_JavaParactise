package day01_27_10_Odevler;

import java.util.Scanner;

public class Q8_FahrenheitToCelsius {
	// Write a Java program to convert temperature from Fahrenheit to Celsius
	// degree.

	// formula

	// c = (f-32)*5/9

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen Celsius'a donusturmek isteginiz Fahrenayt degerinizi giriniz");
		double fahrnt = scan.nextDouble();

		System.out.println("Girilen Fatrenayt degerinin Celsius kardiligi : " + (fahrnt - 32) * 5 / 9);

		scan.close();
	}

}
