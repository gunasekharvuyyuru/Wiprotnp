import java.util.Scanner;

public class IsOdd {
    public static int isOdd(int n) {
        return n % 2 != 0 ? 2 : 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isOdd(n));
    }
}