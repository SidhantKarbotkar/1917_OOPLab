package ex05;

public class Student extends User {
    Integer rollNo;
    public Student() {
        super();
        this.rollNo = 0;
    }

    public Student(String first_name, String last_name, String gender,Integer rollNo) {
        super(first_name,last_name,gender);
        this.rollNo = rollNo;
    }

    public Integer getRollNo() {
        return rollNo;
    }
}
