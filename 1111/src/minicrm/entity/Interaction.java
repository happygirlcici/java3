package minicrm.entity;

public class Interaction {


    private int interactionID;
    private int customerID;
    private int repID;
    private String date;
    private String notes;
   

    public Interaction(int interactionID, int customerID,int repID,String date, String notes) {
        this.interactionID = interactionID;
        this.customerID = customerID;
        this.repID = repID;
        this.date = date;
        this.notes = notes;
       
    }

}
