package p3;

public class Purchase {
 private String name;
 private double unitPrice;

 public Purchase(String name, double unitPrice) {
     this.name = name;
     this.unitPrice = unitPrice;
 }

 public String getName() {
     return name;
 }

 public double getUnitPrice() {
     return unitPrice;
 }

 public String toString() {
     return name + " @ " + unitPrice;
 }
}