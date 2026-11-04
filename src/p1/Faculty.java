package p1;

public class Faculty extends Employee {
 private String officeHours;
 private String rank;

 public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String officeHours, String rank) {
     //3
	 super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
     this.officeHours = officeHours;
     this.rank = rank;
 }

 public String toString() {
     return "Faculty: " + getName();
 }
}