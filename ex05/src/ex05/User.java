package ex05;

public class User {
    String firstName;
    String lastName;
    String gender;
    public User() {    
        this.firstName=" ";
        this.lastName="";
        this.gender="";
    }

    public User(String first_name,String last_name,String gender) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.gender = gender;
    }

    public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}
}