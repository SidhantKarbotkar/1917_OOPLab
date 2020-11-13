package ex05;

public class MainApp {
   public static void main(String[] args) {
     Student s1 = new Student("Sidhant", "Karbotkar", "Male", 1998);
     TeachingStaff t1 = new TeachingStaff("John", "Cena", "Male", 01, "MCA", (float) 50000, "OOT");
     NonTeachingStaff nt1 = new NonTeachingStaff( "Riya", "Vaz", "Female", 05, "MCA", (float) 10000, "Clerk");
     
     System.out.println("Name of the Student : "+s1.getFirstName()+" "+s1.getLastName());
     System.out.println("Name of the Teaching staff : "+ t1.getFirstName()+" "+t1.getLastName());
     System.out.println("Name of the Non-Teaching staff : "+nt1.getFirstName()+" "+nt1.getLastName());
     
     System.out.println("Total salary to be paid by University: "+ Staff.getTotalSalary());
   }       
}