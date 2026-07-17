public class VectorEmployee {

    private int id;
    private String name;
    private double salary;

    public VectorEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID : " + id
                + "\nEmployee Name : " + name
                + "\nEmployee Salary : " + salary;
    }
}