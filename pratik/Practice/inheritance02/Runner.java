package Practice.inheritance02;

public class Runner {

	public static void main(String[] args) {
		
		
		myMethod();

	}

	public static void myMethod() {
		
		Sub obj1 = new Sub();
		obj1.goster();
		System.out.println("sub degisken degeri : " + obj1.num);
		
		Super obj2 =new Super();
		obj2.goster();
		System.out.println("super degisken degeri : " + obj2.num);
		
	}

}
