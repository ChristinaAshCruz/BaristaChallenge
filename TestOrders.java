public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item("Ube Latte", 4.25);
        Item item2 = new Item("Double Espresso", 3.25);
        Item item3 = new Item("Almondmilk Flat White", 4.25);
        Item item4 = new Item("Vietnamese Iced Coffee", 4.00);

        // Order Tests
        Order order1 = new Order();
        order1.addItem(item3);
        order1.addItem(item3);
            // Status Test
        order1.setOrderStatus(true);
        order1.display();
        System.out.println("Order Status: " + order1.getOrderStatus());
        System.out.println("--------------------------------------");

        
        Order order2 = new Order();
        order2.addItem(item1);
        order2.addItem(item4);
        order2.display();
        System.out.println("--------------------------------------");
        
        
        Order order3 = new Order("Jungkook");
        order3.addItem(item1);
        order3.addItem(item2);
        order3.display();
        System.out.println("--------------------------------------");
        
        Order order4 = new Order("J-Hope");
        order4.addItem(item4);
        order4.addItem(item2);
        order4.display();
        System.out.println("--------------------------------------");
        
        Order order5 = new Order("RM");
        order5.addItem(item1);
        order5.addItem(item3);
        order5.display();
        System.out.println("--------------------------------------");
    }
}
