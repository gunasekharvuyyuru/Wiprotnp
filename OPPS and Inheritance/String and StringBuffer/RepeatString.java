import java.util.*;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String first = str.substring(0, 2);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++)
            sb.append(first);

        System.out.println(sb.toString());
    }
}