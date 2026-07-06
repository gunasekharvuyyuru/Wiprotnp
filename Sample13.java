public class Sample13 {
    public static void main(String[] args) {
        // Check if exactly 4 arguments are passed
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return; // Exit the program
        }

        // Convert the string arguments into a 2x2 integer array
        int[][] arr = new int[2][2];
        arr[0][0] = Integer.parseInt(args[0]);
        arr[0][1] = Integer.parseInt(args[1]);
        arr[1][0] = Integer.parseInt(args[2]);
        arr[1][1] = Integer.parseInt(args[3]);

        // Print the given array
        System.out.println("The given array is :");
        System.out.println(arr[0][0] + " " + arr[0][1]);
        System.out.println(arr[1][0] + " " + arr[1][1]);

        // Print the reversed array (printing from the last element backwards)
        System.out.println("The reverse of the array is :");
        System.out.println(arr[1][1] + " " + arr[1][0]);
        System.out.println(arr[0][1] + " " + arr[0][0]);
    }
}