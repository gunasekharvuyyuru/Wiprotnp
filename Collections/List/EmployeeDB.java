import java.util.ArrayList;

public class EmployeeDB {

    ArrayList<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).empId == empId) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay Slip"
                        + "\nEmployee ID : " + e.empId
                        + "\nEmployee Name : " + e.empName
                        + "\nSalary : " + e.salary;
            }
        }
        return "Employee Not Found";
    }

    public void showAllEmployees() {
        for (Employee e : list) {
            e.getEmployeeDetails();
            System.out.println("---------------------");
        }
    }
}