import java.sql.*;
import java.util.*;

public class StudentDAO {

    // DB credentials (change password)
    private static final String URL = "jdbc:mysql://localhost:3306/student_db";
    private static final String USER = "root";
    private static final String PASSWORD = "$Tfrko123";

    // Get connection (reusable method)
    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // 🔹 CREATE
    public void addStudent(Student s) {
        try {
            Connection con = getConnection();

            String query = "INSERT INTO students(name, age, course) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getCourse());

            ps.executeUpdate();

            System.out.println("Student Added Successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // 🔹 READ
    public List<Student> getAllStudents() {

        List<Student> list = new ArrayList<>();

        try {
            Connection con = getConnection();

            String query = "SELECT * FROM students";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String course = rs.getString("course");

                list.add(new Student(id, name, age, course));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }

    // 🔹 UPDATE
    public void updateStudent(Student s) {
        try {
            Connection con = getConnection();

            String query = "UPDATE students SET name=?, age=?, course=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getCourse());
            ps.setInt(4, s.getId());

            ps.executeUpdate();

            System.out.println("Student Updated Successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // 🔹 DELETE
    public void deleteStudent(int id) {
        try {
            Connection con = getConnection();

            String query = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Student Deleted Successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}