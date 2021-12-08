package java_practice_day_7;

public class HomePage {

	
	String [] scrumMaster= {"Scrum master is a facilitator", 
			"Scrum master organizes the meetings",
			"Scrum master is the bridge between dev team and PO"};

	String [] productOwner = {"PO is responsible for PBIs", 
			"Product owner decides what user stories need to be done",
			"PO has more knowledge about the product"};

	String [] developer = {"Developer is building the application", 
			"Developer is a very technical person",
			"Developer is using a programming language"};

	String [] tester = {"Tester is responsible for testing the application",
			"Tester may be a very detail-oriented person",
			"Tester makes sure application matches requirements"
	};
	
	public void callScrumMaster() {
		System.out.println("Welcome dear Scrum Master to home page!");
		for (int i = 0; i < scrumMaster.length; i++) {
			System.out.println(scrumMaster[i]);
		}
		
	}
	
	public void callProductOwner() {
		System.out.println("Welcome dear Product Owner to Home Page!");
		for (int i = 0; i < productOwner.length; i++) {
			System.out.println(productOwner[i]);
		}
	}
	
	public void callDeveloper() {
		System.out.println("Welcome dear Developer to Home Page!");
		for (int i = 0; i < developer.length; i++) {
			System.out.println(developer[i]);
		}
	}
	
	public void callTester() {
		System.out.println("Welcome dear SDETS to our Home Page!");
		for (int i = 0; i < tester.length; i++) {
			System.out.println(tester[i]);
		}
	}
	
}
