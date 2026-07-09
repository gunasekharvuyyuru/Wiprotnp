import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {45, 12, 89, 34, 67, 23};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        // Sort the array
        Arrays.sort(arr);
        
        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}