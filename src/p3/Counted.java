package p3;

public class Counted extends Purchase {
 private int quantity;

 public Counted(String name, double unitPrice, int quantity) {
     super(name, unitPrice);
     this.quantity = quantity;
 }

 public int getQuantity() {
     return quantity;
 }

 public void setQuantity(int quantity) {
     this.quantity = quantity;
 }
 
 public String toString() {
     double totalPrice = getUnitPrice() * quantity;
     return super.toString() + "  " + quantity + " units  RM " + totalPrice;
 }
}