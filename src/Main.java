public class Main {
    public static void main(String[] args) {

        Client test = new Client();
        Order ord = new Order();
        ord.addItem(10);
        ord.addItem(20);
        ord.addItem(10);
        ord.addItem(20);
        ord.addItem(10);
        ord.addItem(20);

        System.out.println(ord.toString());
    }
}