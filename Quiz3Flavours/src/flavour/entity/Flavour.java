
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

    public void setFlavourID(int flavourID) {
        this.flavourID = flavourID;
    }
    
    
    public final void setName(String name) {
        if (name == null || name.length() < 2 || name.length() > 20){
            throw new IllegalArgumentException("Name to short");
        }
        this.name = name;
    }
}

