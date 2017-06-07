
package minicrm.entity;


public class Customer {
    private int customerID;
    private String nameFirst;
    private String nameLast;
    private String address;
    private String postalCode;
    private String phoneNumber;
    private String SIN;
   
    public Customer(int customerID, String nameFirst, String nameLast,String address,String postalCode, String phoneNumber,String SIN) {
        this.customerID = customerID;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.SIN = SIN;
    }
    
    @Override
    public String toString() {
        return "Customer{" + "id=" + this.customerID + ", name=" + this.nameFirst + " " + this.nameLast 
                +" address " +this.address + " Post code "+ this.postalCode +"phoneNumber "+this.phoneNumber+" SIN is "+this.SIN+'}';
    }
    
}
