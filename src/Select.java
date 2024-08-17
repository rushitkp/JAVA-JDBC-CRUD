import java.sql.*;

public class Select {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
            System.out.println("Connection Successfully");

            PreparedStatement ps = con.prepareStatement("select * from emp");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                System.out.println(id + " " + name + " " + salary);
            }

        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
    }
}

