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
        String string = getName() + ";" + getYear() + ";" + getSecs() + System.getProperty("line.separator");
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

