import java.util.*;

public class ZipStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(",");
        String a = parts[0];
        String b = parts[1];
        String result = "";

        int i = 0;
        while (i < a.length() || i < b.length()) {
            if (i < a.length()) result += a.charAt(i);
            if (i < b.length()) result += b.charAt(i);
            i++;
        }

        System.out.println(result);
    }
}