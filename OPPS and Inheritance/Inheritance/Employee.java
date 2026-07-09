public class Employee {
    int empId;
    String empName;
    double salary;

    void setData(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }
}