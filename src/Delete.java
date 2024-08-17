import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
            System.out.println("Connection Successfully");
//        DELETE Data

            PreparedStatement ps = con.prepareStatement("delete from emp where id=?");
            ps.setInt(1, 5);
            int a = ps.executeUpdate();
            if (a > 0) {
                System.out.println(a + " Rows Deleted.");
            }

        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
    }
}
