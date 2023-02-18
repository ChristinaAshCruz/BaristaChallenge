import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Object> items;

    public Order(){
        // ArrayList<Object> orderItems = new ArrayList<>();
        this("Guest", false, null);
    }

    public Order(String name, boolean ready, ArrayList<Object> items){
        this.name = name;
        this.ready = ready;
        this.items = items;
    }

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

    public ArrayList<Object> getOrder(){
        return items;
    }

    public void setOrder(ArrayList<Object> orderItems){
        items = orderItems;
    }
}
