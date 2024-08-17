import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
            System.out.println("Connection Successfully");

//      Insert Data Table
//            PreparedStatement ps=con.prepareStatement("insert into emp values(2,'rj',30000)");
            PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");
            ps.setInt(1, 5);
            ps.setString(2, "Dj");
            ps.setDouble(3, 68000);

            int a = ps.executeUpdate();
            if (a > 0) {
                System.out.println("Data Insert Successfully");
            } else {
                System.out.println("No Data Insert");
            }

        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }

    }
}
