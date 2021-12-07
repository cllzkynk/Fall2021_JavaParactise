package java_practice_day_9;

public class Patient {

	private String name;
	private String lastName;
	private int patientId;
	private Case patientCase;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public Case getPatientCase() {
		return patientCase;
	}

	public void setPatientCase(Case patientCase) {
		this.patientCase = patientCase;
	}

}
