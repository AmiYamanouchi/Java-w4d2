package schoolManagement;

public class Student {
	private String firstName;
	private String lastName;
	
	public Student(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
		
	public void setFirstName(String firstName) {
		if(!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		}
	}
	
	public void setLastName(String lastName) {
		if(!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		}
	}
		
		
}
