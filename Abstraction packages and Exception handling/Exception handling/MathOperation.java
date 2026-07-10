public class MathOperation {

    public static void main(String[] args) {

        try {

            if (args.length != 5) {
                throw new IllegalArgumentException("Exactly 5 arguments are required.");
            }

            int[] numbers = new int[5];
            int sum = 0;

            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
                sum += numbers[i];
            }

            double average = (double) sum / numbers.length;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid integer format.");
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Mathematical calculation error.");
        } 
        catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}