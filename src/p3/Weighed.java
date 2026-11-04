package p3;

public class Weighed extends Purchase {
 private double weight;

 public Weighed(String name, double unitPrice, double weight) {
     super(name, unitPrice);
     this.weight = weight;
 }

 public double getWeight() {
     return weight;
 }

 public void setWeight(double weight) {
     this.weight = weight;
 }

 public String toString() {
     double totalPrice = getUnitPrice() * weight;
     return super.toString() + "  " + weight + "kg  RM " + totalPrice;
 }
}