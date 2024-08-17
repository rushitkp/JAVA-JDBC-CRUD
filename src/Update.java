import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
            System.out.println("Connection Successfully");
            //UPDATE Table Data

            PreparedStatement ps = con.prepareStatement("update emp set name=?,salary=? where id=?");
            ps.setString(1, "Sp");
            ps.setInt(2, 30000);
            ps.setInt(3, 4);
            int a = ps.executeUpdate();
            if (a > 0) {
                System.out.println("Data Successfully Updated");
            } else {
                System.out.println("No rows updated");
            }
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
    }
}
