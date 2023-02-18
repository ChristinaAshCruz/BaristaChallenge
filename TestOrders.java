import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        

        // Menu items
        Item item1 = new Item("Ube Latte", 4.25);
        Item item2 = new Item("Double Espresso", 3.25);
        Item item3 = new Item("Almondmilk Flat White", 4.25);
        Item item4 = new Item("Vietnamese Iced Coffee", 4.00);
        
        // Order variables -- order1, order2 etc.
            //order1
            ArrayList<Object> order1Items = new ArrayList<>();
            order1Items.add(item1);
            Order order1 = new Order("Yoongi", item1.price, false, order1Items);

            //order2
            ArrayList<Object> order2Items = new ArrayList<>();
            order2Items.add(item2);
            order2Items.add(item4);
            Order order2 = new Order("RM", (item2.price + item4.price), true, order1Items);

            //order3
            ArrayList<Object> order3Items = new ArrayList<>();
            order3Items.add(item2);
            order2Items.add(item4);
            order2Items.add(item3);
            Order order3 = new Order("Chimmy", (item2.price + item4.price + item3.price), true, order3Items);

            //order4
            ArrayList<Object> order4Items = new ArrayList<>();
            order4Items.add(item3);
            Order order4 = new Order("Jin", (item3.price), false, order4Items);

    
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.println("--------------------------------------");

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.println("--------------------------------------");

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.println("--------------------------------------");

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
        System.out.println("--------------------------------------");
    }
}
