package Practice.Practice_01;

public class P2 {

	public static void main(String[] args) {

// Write a Java program to break an integer into 
		// a sequence of individual digits.
// Hint: use / and %
// ex: input: 12345
// output: 

// 1
// 2
// 3
// 4
// 5
		int x = 12345;
		int birler = x % 10; // 5
		int onlar = x / 10 % 10; // 4
		int yuzler = x / 100 % 10; // 3
		int binler = x / 1000 % 10; // 2
		int onbinler = x / 10000;

		System.out.println(onbinler + "\n" + binler + "\n" + yuzler + "\n" + onlar + "\n" + birler + "\n");
	}
}
