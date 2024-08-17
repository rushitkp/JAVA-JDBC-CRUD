import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Create {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
            System.out.println("Connection Successfully");

            Statement stmt = con.createStatement();

            String sql = "CREATE TABLE emp (" +
                    "id INT PRIMARY KEY," +
                    "name VARCHAR(20)," +
                    "salary DECIMAL(7,2)" +
                    ")";
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully");
            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception: " + e);
        }
    }
}
