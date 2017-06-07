
package flavour.entity;

public class PlaceOrder {
    
    public PlaceOrder(int placeOrderID, String CustomerName,String flavourList) {
        this.placeOrderID = placeOrderID;
        this.CustomerName = CustomerName;
        this.flavourList = flavourList;
    }

    public int placeOrderID;
    public String CustomerName,flavourList;

    @Override
    public String toString() {
        return String.format("%s %s %s", placeOrderID,CustomerName,flavourList);
    }
    
}
