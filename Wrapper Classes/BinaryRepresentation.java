import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        binary = String.format("%8s", binary).replace(' ', '0');

        System.out.println(binary);

        sc.close();
    }
}