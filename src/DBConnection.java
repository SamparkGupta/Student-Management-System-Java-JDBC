import java.sql.*;

public class DBConnection {

    public static void main(String[] args) {

        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db",
                "root",
                "$Tfrko123"
            );

            System.out.println("Connected Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}