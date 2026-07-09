import java.util.Arrays;

public class MiddleWay {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        
        int[] result = new int[2];
        
        // Since both arrays are always length 3, the middle index is always 1
        result[0] = a[1];
        result[1] = b[1];

        System.out.println("O/P: " + Arrays.toString(result));
    }
}