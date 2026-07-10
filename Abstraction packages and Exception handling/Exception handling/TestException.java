import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a number:");
            int number = sc.nextInt();

            if (number < 0) {
                throw new NegativeValueException("Negative value is not allowed");
            }

            System.out.println("Value is: " + number);

        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}