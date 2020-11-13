package ex05;

public class Staff extends User{
    private Integer staffId;
    private String deptName;
    private Float salary;

    private static float totalSalary = (float) 0;
    public Staff () {
        super();
        this.staffId = 0;
        this.deptName = "";
        this.salary = (float) 0;
    }
    
    public Staff(String firstName, String lastName, String gender, Integer staffId, String deptName , Float salary) {
		super(firstName, lastName, gender);
		this.staffId = staffId;
		this.salary = salary;
		this.deptName = deptName;
		totalSalary = totalSalary + salary;
	}

    public Float getSalary() {
		return this.salary;
	}
	
	public static Float getTotalSalary() {
		return totalSalary;
	}

	public Integer getStaffID() {
		return staffId;
	}

	public String getDepartment() {
		return deptName;
	}
}
