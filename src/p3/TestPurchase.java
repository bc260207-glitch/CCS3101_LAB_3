package p3;

public class TestPurchase {
 public static void main(String[] args) {
     Weighed banana = new Weighed("Banana", 3.00, 1.5);
     Counted coconut = new Counted("Coconut", 1.2, 10);

     System.out.println(banana.toString());
     System.out.println(coconut.toString());
 }
}