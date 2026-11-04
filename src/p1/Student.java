package p1;

public class Student extends Person {
 public static final String Status1 = "freshman";
 public static final String Status2 = "sophomore";
 public static final String Status3 = "junior";
 public static final String Status4 = "senior";
 
 private String classStatus;

 public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) {
     //2
	 super(name, address, phoneNumber, emailAddress);
     this.classStatus = classStatus;
 }

 public String toString() {
     return "Student: " + getName();
 }
 
 public String getClassStatus() {
     return "status: " + classStatus;
 }
 
}
