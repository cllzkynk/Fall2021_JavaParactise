package java_practice_day_7;

import java.util.Scanner;

public class ScrumRunner {

	public static void main(String[] args) {
		//create 2 String variables
		//userName , password
		//Then pass them to typeUsernamePassword method
//		LoginPage login = new LoginPage("Tester","tester12345");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your username and password");
		String userName = scan.next();
		String password = scan.next();
		LoginPage login = new LoginPage(userName,password);
		
		System.out.println('a');
		
//		login.typeUsernamePassword("Scrum_Master", "scrum12345");
		

		

		
		
		
		
		
		
		
		
		//if you are scrum master, Then I should know it by your 
		//username and password
	}
	
	
}
