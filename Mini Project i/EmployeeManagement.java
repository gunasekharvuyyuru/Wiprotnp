import java.io.*;
import java.util.*;

public class EmployeeManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("employee.dat");

        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age ");
                    int age = sc.nextInt();

                    System.out.print("Enter Employee Salary ");
                    double salary = sc.nextDouble();

                    try {
                        ObjectOutputStream out;

                        if (file.exists()) {
                            out = new MyObjectOutputStream(new FileOutputStream(file, true));
                        } else {
                            out = new ObjectOutputStream(new FileOutputStream(file));
                        }

                        out.writeObject(new Employee(id, name, age, salary));
                        out.close();

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    if (!file.exists()) {
                        System.out.println("No employee records found.");
                        break;
                    }

                    try {
                        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));

                        System.out.println("-----Report-----");

                        while (true) {
                            Employee emp = (Employee) in.readObject();
                            System.out.println(emp);
                        }

                    } catch (EOFException e) {
                        System.out.println("-----End of Report-----");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Exiting the System");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

class MyObjectOutputStream extends ObjectOutputStream {

    MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    protected void writeStreamHeader() throws IOException {
        reset();
    }
}