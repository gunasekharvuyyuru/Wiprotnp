import java.util.LinkedHashSet;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] input = {12, 34, 12, 45, 67, 89};
        System.out.println("Input: " + Arrays.toString(input));
        
        // Use LinkedHashSet to maintain order and remove duplicates
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : input) {
            set.add(num);
        }
        
        // Print the unique elements
        System.out.println("Output: " + set);
    }
}