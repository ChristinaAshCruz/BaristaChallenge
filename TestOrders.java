import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item("Ube Latte", 4.25);
        Item item2 = new Item("Double Espresso", 3.25);
        Item item3 = new Item("Almondmilk Flat White", 4.25);
        Item item4 = new Item("Vietnamese Iced Coffee", 4.00);

        Order order1 = new Order();
        order1.addItem(item3);
        
        Order order2 = new Order();
        order2.addItem(item1);
        order2.addItem(item4);

        Order order3 = new Order("Jungkook");
        Order order4 = new Order("J-Hope");
        Order order5 = new Order("RM");
    }
}
