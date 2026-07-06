public class Sample14 {
    public static void main(String[] args) {
        // Check if exactly 9 arguments are passed
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return; // Exit the program
        }

        // Convert string arguments into a 3x3 integer array
        int[][] arr = new int[3][3];
        int count = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(args[count]);
                count++;
            }
        }

        // Print the given array
        System.out.println("The given array is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        // Find the biggest number
        int max = arr[0][0]; // Assume the first element is the largest initially
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("The biggest number in the given array is " + max);
    }
}