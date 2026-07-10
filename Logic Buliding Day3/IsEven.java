import java.util.Scanner;

public class IsEven {
    public static int isEven(int n) {
        return n % 2 == 0 ? 2 : 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
}