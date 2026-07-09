import java.util.*;

public class OptionalCheck {
    public static void main(String[] args) {
        String names[] = new String[5];
        Optional<String> checkNull = Optional.ofNullable(names[0]);

        if (checkNull.isPresent()) {
            System.out.print(names[0].length());
        } else {
            System.out.print("Value is not present");
        }
    }
}