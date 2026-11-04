package p1;

public class Person {
 private String name;
 private String address;
 private String phoneNumber;
 private String emailAddress;

 public Person(String name, String address, String phoneNumber, String emailAddress) {
	 // 1
     this.name = name;
     this.address = address;
     this.phoneNumber = phoneNumber;
     this.emailAddress = emailAddress;
 }

 public String getName() {
     return name;
 }

 public String toString() {
     return "Person: " + name;
 }
}