package minicrm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Database {
    
    private Connection conn;
    
    public Database() throws SQLException {
        conn = DriverManager.getConnection("jdbc:sqlite:minicrm.db");
    }
}
