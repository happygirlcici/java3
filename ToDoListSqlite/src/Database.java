
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

    Database() throws SQLException, ClassNotFoundException {
         Class.forName("org.sqlite.JDBC");
         Connection conn = null;
        try {
            //Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(
                   // "jdbc:sqlite:C:\\sqlite3\\task");
                    "jdbc:sqlite:C:/sqlite3/task.db");
            System.out.println("Opened database successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void addTask(String taskName, String taskDate, String taskStatus) throws SQLException {
        String query = "INSERT INTO task VALUES (NULL, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, taskName);
        ps.setString(2, taskDate);
        ps.setString(3, taskStatus);
        ps.execute();
    }

    public ArrayList<Task> getAllTasks() throws SQLException {
        final String SELECT_PERSON = "SELECT * FROM task";
        ArrayList<Task> result = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(SELECT_PERSON);
            while (rs.next()) {
                int id = rs.getInt("taskid");
                String taskName = rs.getString("taskName");
                String taskDate = rs.getString("taskDate");
                String taskStatus = rs.getString("taskStatus");
                //int age = rs.getInt("age");
                Task t = new Task(id, taskName, taskDate, taskStatus);
                result.add(t);
            }
        }
        return result;
    }

    public Task getTaskById(int id) throws SQLException {
        String query = "SELECT * FROM task WHERE taskid=" + id;
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.next()) {
                throw new SQLExceptionResultEmpty();
            }

            String taskName = rs.getString("taskName");
            String taskDate = rs.getString("taskDate");
            String taskStatus = rs.getString("taskStatus");
            Task t = new Task(id, taskName, taskDate, taskStatus);

            return t;
        }
    }

    public Task getTaskByName(String str) throws SQLException {
        String query = "SELECT * FROM task WHERE taskname like \"%" + str + "%\"";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.next()) {
                throw new SQLExceptionResultEmpty();
            }
            int taskid = rs.getInt("taskid");
            String taskName = rs.getString("taskName");
            String taskDate = rs.getString("taskDate");
            String taskStatus = rs.getString("taskStatus");
            Task t = new Task(taskid, taskName, taskDate, taskStatus);
            //System.out.println("query  is "+ query);
            return t;
        }
    }

    public ArrayList<Task> getTasksByName(String str)  throws SQLException {
        String str_select = "SELECT * FROM task WHERE taskname like \"%" + str + "%\"";
        ArrayList<Task> result = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            System.out.println("getTasks query is "+str_select);
            ResultSet rs = stmt.executeQuery(str_select);
            while (rs.next()) {
                int id = rs.getInt("taskid");
                String taskName = rs.getString("taskName");
                String taskDate = rs.getString("taskDate");
                String taskStatus = rs.getString("taskStatus");
                Task t = new Task(id, taskName, taskDate, taskStatus);
                result.add(t);
                System.out.println("t is "+t);
            }
        }
        return result;
    }
    
    public ArrayList getManyTaskByName(String str) throws SQLException {
        String query = "SELECT * FROM task WHERE taskname like \"%" + str + "%\"";
        
        ArrayList<Task> taskResultList = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            int count = rs.getRow();
            for (int n = 1; n <= count; n++) {
                String taskName = rs.getString("taskName");
                int taskId = rs.getInt("taskid");
                String taskDate = rs.getString("taskDate");
                String taskStatus = rs.getString("taskStatus");

                Task t = new Task(taskId, taskName, taskDate, taskStatus);
                taskResultList.add(t);
            }
            return taskResultList;
        }
    }

    public int getCountTaskByName(String str) throws SQLException {
        String query = "SELECT count(*) FROM task WHERE taskname like \"%" + str + "%\"";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.next()) {
                throw new SQLExceptionResultEmpty();
            }
            rs.last();
            int count = rs.getInt(1);
            rs.beforeFirst();
            boolean re = rs.wasNull();
            return count;
        }
    }

    public void updateTask(Task t) throws SQLException {
        String query = "UPDATE task SET taskName=?, taskDate=?,taskStatus=? WHERE taskid=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, t.getTaskName());
        ps.setString(2, t.getTaskDate());
        ps.setString(3, t.getTaskStatus());
        ps.setInt(4, t.getId());
        ps.execute();
    }

    public void deleteTask(int id) throws SQLException {
        String query = "DELETE FROM TASK WHERE taskid=" + id;
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(query);
        }
    }
}

