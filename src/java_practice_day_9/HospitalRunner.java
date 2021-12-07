package java_practice_day_9;

public class HospitalRunner {

	private static Hospital hpt1 = new Hospital();

	public static void main(String[] args) {

		String patientCase = "Headaches";
		String title = doctorTitle(patientCase);

		hpt1.setDoctor(findDoctor(title));
		System.out.println("Doctor name: " + hpt1.getDoctor().getName());
		System.out.println("Doctor last name: " + hpt1.getDoctor().getLastName());
		System.out.println("Doctor title: " + hpt1.getDoctor().getTitle());

		hpt1.setPatient(findPatient("Warren"));
		System.out.println("Patient name: " + hpt1.getPatient().getName());
		System.out.println("Patient last name: " + hpt1.getPatient().getLastName());
		System.out.println("Patient id " + hpt1.getPatient().getPatientId());
		System.out.println("Patient actual case: " + hpt1.getPatient().getPatientCase().getActualCase());
		System.out.println("Patient situation emergency: " + hpt1.getPatient().getPatientCase().isEmergency());

	}

	// custom method
	public static String doctorTitle(String actualCase) {

		if (actualCase.equals("Allergies")) {
			return hpt1.titles[0];
		} else if (actualCase.equals("Diabetes")) {
			return "Endocrinologists";
		} else if (actualCase.equals("Heart diseases")) {
			return "Cardiologist";
		} else if (actualCase.equals("Migraine")) {
			return "Generalist";
		} else if (actualCase.equals("Corona")) {
			return "Pediatrician";
		} else if (actualCase.equals("Allergies")) {
			return "Generalist";
		} else if (actualCase.equals("Headaches")) {
			return "Neurologist";
		} else {
			return "Wrong title";
		}

	}

	public static Doctor findDoctor(String actualCase) {
		Doctor doctor = new Doctor();
		for (int i = 0; i < hpt1.titles.length; i++) {
			if (hpt1.titles[i].equals(actualCase)) {
				doctor.setName(hpt1.doctorNames[i]);
				doctor.setLastName(hpt1.doctorLastNames[i]);
				doctor.setTitle(actualCase);
			}
		}

		return doctor;

	}

	public static Case findPatientCase(String actualCase) {
		Case patientCase = new Case();

		switch (actualCase) {
		case "Allergies":
			patientCase.setActualCase(actualCase);
			patientCase.setEmergency(false);
			break;
		case "Diabetes":
			patientCase.setActualCase(actualCase);
			patientCase.setEmergency(false);
			break;
		case "Heart diseases":
			patientCase.setActualCase(actualCase);
			patientCase.setEmergency(true);
			break;
		case "Migraine":
			patientCase.setActualCase(actualCase);
			patientCase.setEmergency(true);
			break;
		case "Corona":
			patientCase.setEmergency(true);
			patientCase.setActualCase(actualCase);

			break;
		case "Cold":
			patientCase.setActualCase(actualCase);
			patientCase.setEmergency(false);
			break;
		case "Headaches":
			patientCase.setActualCase(actualCase);
			patientCase.setEmergency(true);
			break;
		default:

		}

		return patientCase;
	}

	public static Patient findPatient(String title) {
		Patient patient = new Patient();
		for (int i = 0; i < hpt1.patientNames.length; i++) {
			if (hpt1.patientNames[i].equals(title)) {
				patient.setName(hpt1.patientNames[i]);
				patient.setLastName(hpt1.patientLastNames[i]);
				patient.setPatientId(hpt1.patientIds[i]);
				patient.setPatientCase(findPatientCase(hpt1.cases[i]));
			}
		}

		return patient;
	}

}
