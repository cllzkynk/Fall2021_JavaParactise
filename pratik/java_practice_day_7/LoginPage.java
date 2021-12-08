package java_practice_day_7;

public class LoginPage {

	String userName;
	String password;
	HomePage homePage = new HomePage();

	public LoginPage() {

	}

	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
		typeUsernamePassword(userName, password);
	}

	public void typeUsernamePassword(String userName, String password) {

		if (userName.length() > 5 && userName.length() < 30) {

			switch (userName) {
			case "Scrum_Master":
				if (password.equals("scrum12345")) {
					homePage.callScrumMaster();
				} else {
					System.out.println("Your password is invalid!");
				}
				break;
			case "Product_Owner":
				if (password.equals("owner12345")) {
					homePage.callProductOwner();
				} else {
					System.out.println("Your password is invalid!");
				}
				break;
			case "Developer":
				if (password.equals("developer12345")) {
					homePage.callDeveloper();
				} else {
					System.out.println("Your password is invalid!");
				}
				break;
			case "Tester":
				if (password.equals("tester12345")) {
					homePage.callTester();
				} else {
					System.out.println("Your password is invalid!");
				}
				break;

			default:
				System.out.println("Your user name is invalid!");

			}

		} else {
			System.out.println("You have an invalid username");
		}

	}

}
