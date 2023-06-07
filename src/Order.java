import java.util.ArrayList;
import java.util.List;
public class Order {
 public int quantity;
 public double price;
 static int id = 0;
 PriceObserver Pobs = new PriceObserver();
 QuantityObserver Qobs = new QuantityObserver();
 private List<OrderObserver> Observers = new ArrayList<OrderObserver>();
 public void attach(OrderObserver obs){
  Observers.add(obs);
 }
 public void detach(OrderObserver obs){
  Observers.remove(obs);
 }
 public double getTotalPrice(){
 return price;
 }
 public int getCount(){
  return quantity;
 }
 public void addItem(double prc) {
  quantity++;
  price = price + prc;
  Pobs.update(this);
  Qobs.update(this);
 }
 @Override
 public String toString() {
  return "Order{" +
          "quantity=" + quantity +
          ", price=" + price +
          ", id=" + id +
          '}';
 }
 public double getPrice() {
  return price;
 }
 public Order() {
  this.attach(Pobs);
  this.attach(Qobs);
  Order.id = id + 1;
 }
}
