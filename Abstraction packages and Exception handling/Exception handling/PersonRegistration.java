public class PersonRegistration {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Error: Please provide both name and age as command line arguments.");
            }

            String name = args[0];
            int age;

            try {
                age = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Error: Age must be a valid integer.");
            }

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Error: Age must be greater than or equal to 18 and less than 60.");
            }

            System.out.println("Registration successful for Name: " + name + ", Age: " + age);

        } catch (InvalidAgeException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
