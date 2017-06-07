
package flavour.entity;

public class PlaceOrder {
    
    public PlaceOrder(int placeOrderID, String customerName,String flavourList) {
        this.placeOrderID = placeOrderID;
        this.customerName = customerName;
        this.flavourList = flavourList;
    }

    public int placeOrderID;
    public String customerName,flavourList;

    @Override
    public String toString() {
        return String.format("%s %s %s", placeOrderID,customerName,flavourList);
    }
    
    
    public void setPlaceOrderID(int placeOrderID) {
        this.placeOrderID = placeOrderID;
    }

    public final void setCustomerName(String customerName) {
        if (customerName == null || customerName.length() < 2 ){
            throw new IllegalArgumentException("Name to short");
        }
        this.customerName = customerName;
        
    }

    public void setFlavourList(String flavourList) {
        
        if (flavourList == null ){
            throw new IllegalArgumentException("flavourList  is null");
        }
        
        boolean isStringCommaInvalid = flavourList.toLowerCase().matches("\\s*,\\s*");
        
        if (isStringCommaInvalid == false){
            throw new IllegalArgumentException("flavourComma-Seprate invalid");
        }
        this.flavourList = flavourList;
    }
    
    
}
