package p1;

public class TestPerson {
 public static void main(String[] args) {
     MyDate dateE = new MyDate(2026, 10, 15);
     MyDate dateF = new MyDate(2020, 1, 15);
     MyDate dateST = new MyDate(2021, 8, 15);
    
     Person p = new Person("Air", "Address 1", "012-345", "air@mail.com");
     Student s = new Student("Bear", "Address 2", "013-456", "bear@mail.com", Student.Status1);
     Employee e = new Employee("Cat", "Address 3", "014-567", "cat@mail.com", "Room 1", 5000, dateE);
     Faculty f = new Faculty("Dog", "Address 4", "015-678", "dog@mail.com", "Room 2", 7000, dateF, "9am-5pm", "Professor");
     Staff st = new Staff("Egg", "Address 5", "016-789", "egg@mail.com", "Room 3", 3000, dateST, "Engineer");

     System.out.println(p.toString());
     System.out.println(s.toString());
     System.out.println(e.toString());
     System.out.println(f.toString());
     System.out.println(st.toString());	
     
     // below for test
     System.out.println("\n//BELOW FOR TEST");
     
     System.out.println(s.getClassStatus());
     System.out.println(e.dateHired());
     System.out.println(e.superName());
     //System.out.println(s.address); -not work
     //System.out.println(p.address); -not work
 }
}