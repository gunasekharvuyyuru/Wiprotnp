import java.io.*;
import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Guna", new Date(), "IT", "Developer", 50000);

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data"));
            out.writeObject(emp);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data"));
            Employee e = (Employee) in.readObject();
            in.close();

            System.out.println("Name : " + e.getName());
            System.out.println("Date of Birth : " + e.getDateOfBirth());
            System.out.println("Department : " + e.getDepartment());
            System.out.println("Designation : " + e.getDesignation());
            System.out.println("Salary : " + e.getSalary());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}