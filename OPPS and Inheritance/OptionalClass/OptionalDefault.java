import java.util.*;

public class OptionalDefault {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String address = sc.nextLine();
        if (address.equals("null")) address = null;

        Optional<String> opt = Optional.ofNullable(address);
        System.out.println(opt.orElse("India"));
    }
}