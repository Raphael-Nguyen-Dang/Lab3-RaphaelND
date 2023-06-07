public class QuantityObserver implements OrderObserver{
    public void update(Order order) {
        if (order.getCount() > 5) {
            order.price = order.price - 10;
        }
    }
}
