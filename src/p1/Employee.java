package p1;

public class Employee extends Person {
 private String office;
 private double salary;
 private MyDate dateHired;

 public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired) {
     
	 //2
	 super(name, address, phoneNumber, emailAddress);
     this.office = office;
     this.salary = salary;
     this.dateHired = dateHired;
 }

 public String toString() {
     return "Employee: " + getName();
 }
 
 public String dateHired() {
     return "dateHired: " + dateHired;
 }
 
 public String superName() {
     return "superName:" + super.getName();
 }
}