public class PriceObserver implements OrderObserver{
    public void update(Order order){
        if(order.getPrice() >= 200){
            order.price = order.price - 20;
        }
    }
}

