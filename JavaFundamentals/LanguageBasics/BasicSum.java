package LanguageBasics;
public class BasicSum {
    public static void main(String[] args) {
        // Change this array to test different examples from the image
        int[] arr = {10, 3, 6, 1, 2, 7, 9}; 
        
        int sum = 0;
        boolean skip = false;

        for (int i = 0; i < arr.length; i++) {
            // If we hit a 6, we start skipping
            if (arr[i] == 6) {
                skip = true;
            }

            // If we are not skipping, add the number to the sum
            if (skip == false) {
                sum = sum + arr[i];
            }

            // If we hit a 7 and we were skipping, stop skipping for the next numbers
            if (arr[i] == 7 && skip == true) {
                skip = false;
            }
        }

        System.out.println("O/P: " + sum);
    }
}