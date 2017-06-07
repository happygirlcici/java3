
package flavour;



import flavour.entity.Flavour;
import flavour.entity.PlaceOrder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


class SQLExceptionResultEmpty extends SQLException {
}

public class Database {
    
    private Connection conn;
    
    public Database() throws SQLException {
        //conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/ipd/Documents/2017-IPD9-Java3/Quiz3Flavours/flavour.sqlite");
        conn = DriverManager.getConnection("jdbc:sqlite:flavour.sqlite");
    }
    
    public ArrayList<Flavour> getAllFlavours() throws SQLException {
        final String SELECT_ALL_FLA = "SELECT * FROM flavour";
        ArrayList<Flavour> result = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(SELECT_ALL_FLA);
            while (rs.next()) {
                int flavourID = rs.getInt("flavourID");
                String name = rs.getString("name");
                Flavour f = new Flavour(flavourID, name);
                result.add(f);
            }
        }
        return result;
    }
    
    public ArrayList<PlaceOrder> getAllOrders() throws SQLException {
        final String SELECT_ALL_FLA = "SELECT * FROM placeorder";
        ArrayList<PlaceOrder> result = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(SELECT_ALL_FLA);
            while (rs.next()) {
                int placeOrderID = rs.getInt("placeOrderID");
                String customerName = rs.getString("customerName");
                String flavourList = rs.getString("flavourList");
                PlaceOrder f = new PlaceOrder(placeOrderID, customerName,flavourList);
                result.add(f);
            }
        }
        return result;
    }
    
    public void addOrders(PlaceOrder pl) throws SQLException {
        String query = "INSERT INTO placeorder VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, pl.placeOrderID);
        ps.setString(2, pl.customerName);
        ps.setString(3, pl.flavourList);
        ps.execute();
    }
    
} //close
