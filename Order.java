// import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // getters and setters
    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public boolean getOrderStatus(){
        return ready;
    }

    public void setOrderStatus(boolean status){
        ready = status;
    }

    public ArrayList<Item> getOrder(){
        return items;
    }

    public void setOrder(ArrayList<Item> orderItems){
        items = orderItems;
    }

    // class methods
    public void addItem(Item item){
        items.add(item);
    }

    public String getStatusMessage(){
        if (getOrderStatus() == true){
            return "Your order is ready";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double total = 0;
        for (Item item: items){
            total += item.getItemPrice();
        }
        return total;
    }

    public void display(){
        System.out.println("Customer Name: " + name);
        for (Item item: items){
            System.out.println(item.getItemName() + "-" + item.getItemPrice());
        }
        System.out.println("Total: " + getOrderTotal());
    }
}
