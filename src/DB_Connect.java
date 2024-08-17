import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/emp";
        String username = "root";
        String password = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successfully");
            con.close();
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }
}