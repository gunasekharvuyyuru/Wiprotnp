import java.util.*;

public class RepeatLastN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(",");
        String str = parts[0];
        int n = Integer.parseInt(parts[1].trim());

        String repeatPart = str.substring(str.length() - n);
        String result = "";

        for (int i = 0; i < n; i++) {
            result += repeatPart;
        }

        System.out.println(result);
    }
}