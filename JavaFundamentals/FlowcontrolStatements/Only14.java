public class Only14 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4}; // Example 1
        
        boolean isValid = true;

        for (int i = 0; i < arr.length; i++) {
            // If an element is NOT 1 AND it is NOT 4, it breaks the rule
            if (arr[i] != 1 && arr[i] != 4) {
                isValid = false;
                break; // Stop checking immediately
            }
        }

        System.out.println("O/P: " + isValid);
    }
}