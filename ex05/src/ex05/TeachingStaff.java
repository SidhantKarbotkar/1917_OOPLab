package ex05;

public class TeachingStaff extends Staff {
    String subject;

    public TeachingStaff() {
        super();
        this.subject = "";
    }
	public TeachingStaff(String firstName, String lastName, String gender, Integer staffId, String deptName, Float salary, String subject) {
		super(firstName, lastName, gender, staffId, deptName, salary);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
    }
}
