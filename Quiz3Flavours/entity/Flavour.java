
package flavour.entity;




public class Flavour {
    
    public Flavour(int flavourID, String name) {
        this.flavourID = flavourID;
        this.name = name;
        
    }

    public int flavourID;
    public String name;

    @Override
    public String toString() {
        return String.format("%s %s ", flavourID,name);
    }
    
}

