import java.util.Optional;

class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

class Employee {
}

public class OptionalThrow {
    public static void main(String[] args) throws InvalidEmployeeException {

        Employee emp = null;

        Optional<Employee> opt = Optional.ofNullable(emp);

        Employee result = opt.orElseThrow(() ->
                new InvalidEmployeeException("Invalid Employee"));

        System.out.println(result);
    }
}