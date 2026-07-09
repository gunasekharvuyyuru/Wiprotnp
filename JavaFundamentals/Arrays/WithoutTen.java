import java.util.Arrays;

public class WithoutTen {
    public static void main(String[] args) {
        int[] arr = {1, 10, 10, 2}; // Example 1
        
        int[] result = new int[arr.length]; // New array initialized with 0s by default
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                result[index] = arr[i];
                index++;
            }
        }

        System.out.println("O/P: " + Arrays.toString(result));
    }
}