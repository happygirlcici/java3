
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Database {
    
    private Connection conn;
    
    Database() throws SQLException {
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/people",   //factory method tell connector which class should be used what is host name and what is the application name
                "root", "root");
    }
            
    public void addPerson(String name, int age) throws SQLException {
        String query = "INSERT INTO person VALUES (NULL, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, name);
        ps.setInt(2, age);
        ps.execute();
    }
    
    public ResultSet listPerson() throws SQLException {
        String query = "SELECT idperson, name, age FROM person";
        PreparedStatement ps = conn.prepareStatement(query);

        return(ps.executeQuery());       
    }
    

   
    public ArrayList<Person> getAllPersons() throws SQLException{
        final String SELECT_PERSON = "SELECT * FROM person";
        ArrayList<Person> result = new ArrayList();
            try (Statement stmt = conn.createStatement()){
            ResultSet rs = stmt.executeQuery(SELECT_PERSON);
            while (rs.next()){
                int id = rs.getInt("idperson");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Person p = new Person(id,name,age);
                result.add(p);
            
                }
            }
            return result;
    }
    
    public Person getPersonById(int id) throws SQLException{
        throw new UnsupportedOperationException("Unimplemented");
    
    
    }
    
    public void updatePersonById(int id) throws SQLException{
        String query = "UPDATE person SET WHERE idperson ="+id;
        
    }
    
    public void updatePersonById(int id,String name,int age) throws SQLException{
        String query = "UPDATE person SET Name ="+name+", Age ="+age+ "WHERE idperson ="+id;
        
    }
    
    public void updatePerson(int id,String name,int age) throws SQLException{
        //String query = "UPDATE person SET Name =\""+name+"\" , Age = \""+age+ "\" WHERE idperson ="+id;
        String query = "UPDATE person SET Name= ? AND age = ? WHERE idperson = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, name);
        ps.setInt(2, age);
        //ps.setAge(3,id);
        Statement stmt = conn.createStatement();
        System.out.println("update "+query);
        stmt.executeUpdate(query);
        
    }
    
    public void deletePersonById(int id) throws SQLException{
        String query = "DELETE FROM person WHERE idperson ="+id;
        PreparedStatement ps = conn.prepareStatement(query);
//        ps.setString(1, name);
//        ps.setInt(2, age);
        
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(query);
        
        //ps.executeQuery(query);
        //return(ps.executeQuery(query));

    }
    
}
