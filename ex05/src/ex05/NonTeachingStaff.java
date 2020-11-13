package ex05;

public class NonTeachingStaff extends Staff {
    private String role;

    public NonTeachingStaff() {
        super();
        this.role = "";
    }

	public NonTeachingStaff(String firstName, String lastName, String gender, Integer staffId, String deptName, Float salary, String role) {
		super(firstName, lastName, gender, staffId, deptName, salary);
		this.role = role;
	}

	public String getRole() {
		return role;
	}
}
