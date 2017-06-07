
import java.util.Date;


public class Trip {
    
    private String destination;
    private String travellerName;
    private String travellerPassportNo;
    private Date departureDate;
    private Date returnDate;
    
    public Trip(String destination,String travellerName,String travellerPassportNo,Date departureDate,Date returnDate){
        this.destination = destination;
        this.travellerName = travellerName;
        this.travellerPassportNo = travellerPassportNo;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
    }
    public Trip(){
        this.destination = destination;
        this.travellerName = travellerName;
        this.travellerPassportNo = travellerPassportNo;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
    }
    
    
    public String toString() {
        String string = getTravellerName()+" ("+getTravellerPassportNo()+") To "+getDestination() + " depart on " + getDepartureDate() + " and return in " + getReturnDate()+".";
        return string;
    }

    public String toStringSave() {
        String string = getTravellerName()+";"+getTravellerPassportNo()+";"+getDestination() + ";" + getDepartureDate() + ";" + getReturnDate()+System.getProperty("line.separator");;
        return string;
    }
    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the travellerName
     */
    public String getTravellerName() {
        return travellerName;
    }

    /**
     * @param travellerName the travellerName to set
     */
    public void setTravellerName(String travellerName) {
        this.travellerName = travellerName;
    }

    /**
     * @return the travellerPassportNo
     */
    public String getTravellerPassportNo() {
        return travellerPassportNo;
    }

    /**
     * @param travellerPassportNo the travellerPassportNo to set
     */
    public void setTravellerPassportNo(String travellerPassportNo) {
        this.travellerPassportNo = travellerPassportNo;
    }

    /**
     * @return the departureDate
     */
    public Date getDepartureDate() {
        return departureDate;
    }

    /**
     * @param departureDate the departureDate to set
     */
    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    /**
     * @return the returnDate
     */
    public Date getReturnDate() {
        return returnDate;
    }

    /**
     * @param returnDate the returnDate to set
     */
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}



/*
public class Car {

    String name;
    int year;
    Double secs;

    public Car(String name, int year, Double secs) {
        this.name = name;
        this.year = year;
        this.secs = secs;

    }

    public Car() {
        this.name = name;
        this.year = year;
        this.secs = secs;

    }

    public String toString() {
        String string = getName() + " from Year" + getYear() + " accelerate to 100 km needs" + getSecs()+" secs.";
        return string;
    }

    public String toStringSave() {
        String string = getName() + ";" + getYear() + ";" + getSecs() + System.getProperty("line.separator");;
        return string;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getSecs() {
        return secs;
    }


    public void setSecs(Double secs) {
        this.secs = secs;
    }

}


*/