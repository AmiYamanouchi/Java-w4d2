package schoolManagement;

public class Instructor {
	
	private String firstName;
	private String lastName;
	private String phoneNum;
	private int experienceYear;
	
	//constructor
	public Instructor(String firstName, String lastName, String phoneNum, int experienceYear) {
		setFirstName(firstName);
		getLastNameString(lastName);
		setPhoneNum(phoneNum);
		getExperienceYear(experienceYear);
	}
	
	public String getStatus() {
		
		switch(experienceYear) {
		case 1:
			return "Junior Instructor";
		case 2: case 3:
			return "Intermediate Instructor";
		default:
			return "Senior Instructor";
		}
		
	}
	
	
	//getter
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public int getExperienceYear() {
		return experienceYear;
	}
	
	//setter
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
	}
	
	public void getLastNameString(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	
	public void setPhoneNum(String phoneNum) {
		if (!phoneNum.isEmpty() && !phoneNum.equalsIgnoreCase(null)) {
			this.phoneNum = phoneNum;
		} else {
			this.phoneNum = "Unknown";
		}
	}
	
	public void getExperienceYear(int experienceYear) {
		if (experienceYear > 1) {
			this.experienceYear = experienceYear;
		} else {
			this.experienceYear = 1;
		}
	}

}
