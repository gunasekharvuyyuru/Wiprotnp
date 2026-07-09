import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 1}; // Example 1
        
        int[] result = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[start] = arr[i]; // Even numbers go to the front
                start++;
            } else {
                result[end] = arr[i];   // Odd numbers go to the back
                end--;
            }
        }

        System.out.println("O/P: " + Arrays.toString(result));
    }
}