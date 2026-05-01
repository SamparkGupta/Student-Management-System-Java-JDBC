import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student s1 = new Student(name, age, course);
                    dao.addStudent(s1);
                    break;

                case 2:
                    List<Student> list = dao.getAllStudents();

                    for (Student s : list) {
                        System.out.println(
                            s.getId() + " | " +
                            s.getName() + " | " +
                            s.getAge() + " | " +
                            s.getCourse()
                        );
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int id = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    Student s2 = new Student(id, newName, newAge, newCourse);
                    dao.updateStudent(s2);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();

                    dao.deleteStudent(delId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}