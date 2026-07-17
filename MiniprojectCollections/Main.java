import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// Employee class implementing Comparable to sort by First Name
class Employee implements Comparable<Employee> {
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private String address;

    public Employee(String firstName, String lastName, String mobile, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int compareTo(Employee other) {
        // Sort alphabetically by first name
        return this.firstName.compareToIgnoreCase(other.firstName);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Employees");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Using TreeSet to automatically sort elements using the Comparable interface
        Set<Employee> employeeSet = new TreeSet<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Employee " + i + " Details:");
            
            System.out.println("Enter the Firstname");
            String firstName = sc.nextLine();
            
            System.out.println("Enter the Lastname");
            String lastName = sc.nextLine();
            
            System.out.println("Enter the Mobile");
            String mobile = sc.nextLine();
            
            System.out.println("Enter the Email");
            String email = sc.nextLine();
            
            System.out.println("Enter the Address");
            String address = sc.nextLine();

            employeeSet.add(new Employee(firstName, lastName, mobile, email, address));
        }

        System.out.println("Employee List:");
        
        // Using the required format specifier from the problem statement
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
        
        for (Employee emp : employeeSet) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
                emp.getFirstName(), 
                emp.getLastName(), 
                emp.getMobile(), 
                emp.getEmail(), 
                emp.getAddress()
            );
        }
        
        sc.close();
    }
}