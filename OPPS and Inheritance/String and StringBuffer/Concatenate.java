import java.util.*;

public class Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();

        if (s1.length() == 0 || s2.length() == 0) {
            System.out.println("Invalid Input");
            return;
        }

        if (s1.charAt(s1.length() - 1) == s2.charAt(0))
            System.out.println(s1 + s2.substring(1));
        else
            System.out.println(s1 + s2);
    }
}